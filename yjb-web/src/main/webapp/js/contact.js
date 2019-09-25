/**
 * Created by Administrator on 2019/9/10.
 */
$(function(){
	var form;
	var table;
	var element;
});

//加载模块
layui.use(['table', 'layer', "element", "form"], function(){
    table = layui.table;
    var layer = layui.layer;
    element = layui.element;
    form = layui.form;
    $ = layui.jquery;

    //联系人表格
    table.render({
        elem: '#contact-table',
        id: 'contact-table',
        width: 1090,
        height: 500,
        page:true,
        limit: 10,
        text: {none: "找不到联系人"},
        url: '/contact/list',
        method:'post',
        cols: [[
            {field: 'ctcId', title: 'ID', checkbox: true, align: 'center'},
            {field: 'ctcName', title: '姓名', align: 'center', width:140},
            {field: 'ctcGender', title: '性别', align: 'center', width:80},
            {field: 'ctcPhone', title: '手机号码', align: 'center', width:140},
            {field: 'ctcTel', title: '固定电话', align: 'center', width:140},
            {field: 'ctcJob', title: '职务', align: 'center', width:140},
            {field: 'comAddr', title: '单位地址', align: 'center', width:228},
            {field: 'oper', title: '操作', align: 'center', width:150, toolbar: '#barDemo'}
        ]]
    });

    //左侧通讯录群组监听
    element.on('nav(group-nav)', function(elem){
        var ctcGroup = $(this).attr('value');
        table.reload('contact-table', {
            where: {
                //设定表格重载(查询)参数
//            	page:1,
//            	limit:10,	
            	ctcGroup:ctcGroup
            }
        });
    });
    
    //添加群组加号
    $("#add-group").click(function(){
    	clearGroForm();
        var i = layer.open({
            title: "新建群组",
            area: ['800px', '500px'],
            type: 1,
            btnAlign: 'c',
            closeBtn: 1,
            content: $("#groupInfo"),
            btn: ['确定', '关闭'],
            yes: function(){
            	if($("#groAbbr").val() != "" && $("#groAbbr").val() != null){
            		layer.confirm("确定添加?", function(index){
            			$.ajax({
            				type : "post",//方法类型
            				async : false,
            				dataType : "json",//预期服务器返回的数据类型
            				url : "/group/save",//url
            				data :$("#addGroupForm").serialize(),
            				processData: false,
            				success : function(data) {
            					if (data.status == 200) {
            						layer.msg("添加成功");
            					} else{
            						layer.msg("添加失败");
            					}
            					refreshGroupList();
            				}
            			});
            			layer.close(index);
            			layer.close(i);
            		});
            	} else{
            		layer.msg("请输入群组简称");
            	}
            },
            btn2: function(){}  //return false 开启该代码可禁止点击该按钮关闭
        });
    });
    
    //群组列表右键菜单
    $.contextMenu({
        selector: '.layui-nav-child', //右键选择器
        callback: function(key, options) {//点击回调处理
          var m = "clicked: " + key;
//          window.console && console.log(m) || alert(m);
          var groId = $(this).find("a").attr("value");
          if(key == "edit"){
        	  getGroupInfo(groId);
        	  var i = layer.open({
                  title: "修改群组",
                  area: ['800px', '500px'],
                  type: 1,
                  btnAlign: 'c',
                  closeBtn: 1,
                  content: $("#groupInfo"),
                  btn: ['确定', '关闭'],
                  yes: function(){
                  	if($("#groAbbr").val() != "" && $("#groAbbr").val() != null){
                  		layer.confirm("确定修改?", function(index){
                  			modifyGroup();
                  			layer.close(index);
                  			layer.close(i);
                  		});
                  	} else{
                  		layer.msg("请输入群组简称");
                  	}
                  },
                  btn2: function(){}  //return false 开启该代码可禁止点击该按钮关闭
              });
          } else{
        	  layer.confirm("确定删除该群组?", function(index){
    			delGroup(groId);
    			layer.close(index);
        	  });
          }
        },
        items: {//菜单列表配置
          "edit": {name: "修改群组", icon: "edit"},
          "delete": {name: "删除群组", icon: "delete"}
        }
      });

    //联系人表格的工具条按钮监听
    table.on('tool(contact-table)', function(obj){
        var row = obj.data;
        var btn = obj.event;
        if(btn == 'detail'){
        	fillForm(row);
        	var i = layer.open({
                title: "查看联系人信息",
                area: ['800px', '500px'],
                type: 1,
                btnAlign: 'c',
                closeBtn: 1,
                content: $("#contactInfo"),
                btn: ['关闭']
            });
        } else if(btn == 'modify'){
            fillForm(row);
            var i = layer.open({
                title: "修改联系人信息",
                area: ['800px', '500px'],
                type: 1,
                btnAlign: 'c',
                closeBtn: 1,
                content: $("#contactInfo"),
                btn: ['确定', '关闭'],
                yes: function(){
                    layer.confirm("确定修改?", function(index){
                    	modifyContact();
                        layer.close(index);
                        layer.close(i);
                    });
                }
            });
        } else if(btn == 'delete'){
            var id = row.ctcId;	
            layer.confirm('确定删除该联系人？', function(index){
            	var ids = [];
            	ids.push(id);
                delContacts(ids);
                layer.close(index);
            });
        }
    });

    //添加联系人按钮
    $("#add-btn").click(function(){
        clearCtcForm();
        var i = layer.open({
            title: "新建联系人",
            area: ['800px', '500px'],
            type: 1,
            btnAlign: 'c',
            closeBtn: 1,
            content: $("#contactInfo"),
            btn: ['确定', '关闭'],
            yes: function(){
                layer.confirm("确定添加?", function(index){
                    $.ajax({
                        type : "post",//方法类型
                        async : false,
                        dataType : "json",//预期服务器返回的数据类型
                        url : "/contact/save",//url
                        data :$("#addCtcForm").serialize(),
                        processData: false,
                        success : function(data) {
                            if (data.status == 200) {
                                layer.msg("添加成功");
                            } else{
                                layer.msg("添加失败");
                            }
                            table.reload('contact-table');
                        }
                    });
                    layer.close(index);
                    layer.close(i);
                });
            },
            btn2: function(){}  //return false 开启该代码可禁止点击该按钮关闭
        });
    });

    //批量删除联系人按钮
    $("#multi-del-btn").click(function(){
        var checkedRows = table.checkStatus('contact-table');
        //console.log(checkStatus.data) //获取选中行的数据
        //console.log(checkStatus.data.length) //获取选中行数量，可作为是否有选中行的条件
        //console.log(checkStatus.isAll ) //表格是否全选
        var rows = checkedRows.data;
        var ids = [];
        for(var i = 0; i < rows.length; i++){
            ids.push(rows[i].ctcId);
        }
        if(checkedRows.data.length == 0){
            layer.msg('请选中要删除的联系人');
        } else{
            layer.confirm('确定删除选中的联系人？', function(index){
                delContacts(ids);
                layer.close(index);
            });
        }
    });

    //查找联系人按钮
    $("#search-btn").click(function(){
        table.reload('contact-table', {
            where: {
            	ctcName:$("#searchName").val()
            }
        });
    });
    loadSerialize();
    initWidget();
});

//初始化控件
function initWidget(){
	refreshGroupList();
	$(".context-menu-item").removeClass("context-menu-icon-edit context-menu-icon-delete");
}

//刷新群组列表
function refreshGroupList(){
	$.ajax({
        type : "POST",//方法类型
        async : false,
        dataType : "json",//预期服务器返回的数据类型
        url : "/group/list",//url
        processData: false,
        success : function(data) {
        	//清空左侧群组导航列表
        	var dl = $("#groupList").find("dl");
        	$(dl).remove();
        	
        	//清空新建联系人的群组下拉列表
        	var opt = $("#ctcGroup").find("option");
        	$(opt).remove();
        	$("#ctcGroup").append('<option></option>');
        	
        	//将查询到的群组重新添加进左侧群组导航列表和新建联系人的群组下拉列表里
        	for(var i = 0; i < data.length; i++){
        		$("#groupList").append('<dl class="layui-nav-child"><dd><a href="javascript:;" value="'+data[i].groId+'" ><span class="l-line"></span>'+data[i].groAbbr+'</a></dl>');
        		$("#ctcGroup").append('<option value="'+data[i].groId+'">'+data[i].groAbbr+'</option>');
        	}
        	form.render();
        	element.init();
        }
    });
}

//通过groId获取群组信息并填入表单
function getGroupInfo(groId){
	$.ajax({
		type : "post",//方法类型
		async : false,
		dataType : "json",//预期服务器返回的数据类型
		url : "/group/getGroupById",//url
		data : {"groId":groId},
		processData: true,
		success : function(data) {
			fillGroForm(data);
		}
	});
}

//清空群组信息表单
function clearGroForm(){
    $("#groAbbr").val('');
    $("#groFullname").val('');
    $("#groOrgCode").val('');
    $("#groPinyin").val('');
    $("#groRepOrgCode").val('');
    $("#groRemarks").val('');
}

//把群组信息填入表单
function fillGroForm(data){
	clearGroForm();
	$("#groId").val(data.groId);
	$("#groAbbr").val(data.groAbbr);
	$("#groFullname").val(data.groFullname);
	$("#groOrgCode").val(data.groOrgCode);
	$("#groPinyin").val(data.groPinyin);
	$("#groRepOrgCode").val(data.groRepOrgCode);
	$("#groRemarks").val(data.groRemarks);
}

//修改群组
function modifyGroup(){
	$.ajax({
		type : "post",//方法类型
		async : false,
		dataType : "json",//预期服务器返回的数据类型
		url : "/group/modify",//url
		data :$("#addGroupForm").serialize(),
		processData: false,
		success : function(data) {
			if (data.status == 200) {
				layer.msg("修改成功");
			} else{
				layer.msg("修改失败");
			}
			refreshGroupList();
		}
	});
}

//删除群组
function delGroup(id){
	$.ajax({
		type : "POST",//方法类型
		async : false,
		dataType : "json",//预期服务器返回的数据类型
		url : "/group/delete",//url
		data : {"groId":id},
		success : function(data) {
			if (data.status == 200) {
				layer.msg("删除成功");
			} else{
				layer.msg("删除失败");
			}
		}
	});
	refreshGroupList();
}

//清空联系人表单
function clearCtcForm(){
	$("#ctcId").val('');
	$("#ctcName").val('');
	$("#ctcEmail").val('');
	$("#ctcPhone").val('');
	$("#ctcTel").val('');
	refreshGroupList();
	$("#ctcJob").val('');
	$("#comAddr").val('');
	$(".ctcGender").eq(0).prop("checked",true);
	form.render();
}

//将联系人信息填入表单
function fillForm(row){
	clearCtcForm();
	$("#ctcId").val(row.ctcId);
	$("#ctcName").val(row.ctcName);
	$("#ctcEmail").val(row.ctcEmail);
	$("#ctcPhone").val(row.ctcPhone);
	$("#ctcTel").val(row.ctcTel);
	$("#ctcGroup").val(row.ctcGroup);
	$("#ctcJob").val(row.ctcJob);
	$("#comAddr").val(row.comAddr);
	if(row.ctcGender == 1){
		$(".ctcGender").eq(1).prop("checked",true);
	} else{
		$(".ctcGender").eq(0).prop("checked",true);
	}
	form.render();
}

//修改联系人信息
function modifyContact(){
  $.ajax({
      type : "POST",//方法类型
      async : false,
      dataType : "json",//预期服务器返回的数据类型
      url : "/contact/modify",//url
      data :$("#addCtcForm").serialize(),
//      contentType: false,
//      processData: false,
      success : function(data) {
          if (data.status == 200) {
              layer.msg("修改成功");
          } else{
              layer.msg("修改失败");
          }
          table.reload('contact-table');
      }
  });
}

//删除联系人
function delContacts(ids){
	var delIds = ids.join(',');
    $.ajax({
        type : "POST",//方法类型
        async : false,
        dataType : "json",//预期服务器返回的数据类型
        url : "/contact/delete",//url
        data : {"ids":delIds},
//        contentType: false,
//        processData: false,
        success : function(data) {
            if (data.status == 200) {
                layer.msg("删除成功");
                table.reload('contact-table');
            } else{
                layer.msg("删除失败");
            }
        }
    });
    refreshGroupList();
}

function loadSerialize(){
    $.fn.serializeJson=function(){ 
      	 var serializeObj={}; 
      	 var array=this.serializeArray(); 
      	 // var str=this.serialize(); 
      	 $(array).each(function(){ // 遍历数组的每个元素 
      	         if(serializeObj[this.name]){ // 判断对象中是否已经存在 name，如果存在name 
      	               if($.isArray(serializeObj[this.name])){ 
      	                      serializeObj[this.name].push(this.value); 
      	               }else{ 
      	                       // 将元素变为 数组 ，hobby : ['音乐','体育'] 
      	                       serializeObj[this.name]=[serializeObj[this.name],this.value]; 
      	               } 
      	         }else{ 
      	                 serializeObj[this.name]=this.value; // 如果元素name不存在，添加一个属性 name:value 
      	         } 
      	 }); 
      	 return serializeObj; 
      	};
}


