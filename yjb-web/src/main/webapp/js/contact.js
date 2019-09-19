/**
 * Created by Administrator on 2019/9/10.
 */
layui.use(['table', 'layer', "element"], function(){
    var table = layui.table;
    var layer = layui.layer;
    var element = layui.element;
    $ = layui.jquery;
    
    $.contextMenu({
        selector: '.layui-nav-child', //右键选择器
        callback: function(key, options) {//点击回调处理
          var m = "clicked: " + key;
//          window.console && console.log(m) || alert(m);
//          alert(JSON.stringify($(this).find("span").val()))
          alert(JSON.stringify($(this).find("a").attr("value")))
        },
        items: {//菜单列表配置
          "edit": {name: "修改群组", icon: "edit"},
          "delete": {name: "删除群组", icon: "delete"}
        }
      });

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

    //联系人表格的工具条按钮监听
    table.on('tool(contact-table)', function(obj){
        var row = obj.data;
        var btn = obj.event;
        if(btn == 'detail'){
            layer.msg('detail');
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
                        comfirmModify();
                        layer.close(index);
                        layer.close(i);
                    });
                }
            });
        } else if(btn == 'delete'){
            var id = row.id;	
            layer.confirm('确定删除该联系人？', function(index){
                delContacts(id);
                layer.close(index);
            });
        }
    });

    //左侧通讯录群组监听
    element.on('nav(group-nav)', function(elem){
        var data = $(this).attr('');
        table.reload('contact-table', {
            where: {
                //设定表格重载(查询)参数
                'data': data
            }
        });
    });
    
    //添加群组加号
    $("#add-group").click(function(){
//        clearForm();
        var i = layer.open({
            title: "新建群组",
            area: ['800px', '500px'],
            type: 1,
            btnAlign: 'c',
            closeBtn: 1,
            content: $("#groupInfo"),
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
//                            table.reload('contact-table');
                        }
                    });
                    layer.close(index);
                    layer.close(i);
                });
            },
            btn2: function(){}  //return false 开启该代码可禁止点击该按钮关闭
        });
    });

    //添加联系人按钮
    $("#add-btn").click(function(){
        clearForm();
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
            ids.push(rows[i].id);
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
                //设定表格重载(查询)参数
                'data': data
            }
        });
    });
    loadSerialize();
});

//初始化控件
function initWidget(){
	//初始化性别
}

//删除联系人
function delContacts(ids){
    $.ajax({
        type : "POST",//方法类型
        async : false,
        dataType : "json",//预期服务器返回的数据类型
        url : "",//url
        data : ids,
        contentType: false,
        processData: false,
        success : function(data) {
            if (data.status == 200) {
                layer.msg("删除成功");
            } else{
                layer.msg("删除失败");
            }
        }
    });
}

//将联系人信息填入表单
function fillForm(row){
    $("#contactName").val(row.name);
    //$("#gender").val(row.gender);
}

//检查表单信息完整性
function checkForm(){

}

//清空表单
function clearForm(){
    $("#ctcName").val('');
    $("#ctcEmail").val('');
    $("#ctcPhone").val('');
    $("#ctcTel").val('');
    $("#ctcGroup").val('');
    $("#ctcJob").val('');
    $("#comAddr").val('');
}

//确认修改联系人信息
function comfirmModify(){
    $.ajax({
        type : "POST",//方法类型
        async : false,
        dataType : "json",//预期服务器返回的数据类型
        url : "",//url
        data :"",
        contentType: false,
        processData: false,
        success : function(data) {
            if (data.status == 200) {
                layer.msg("修改成功");
            } else{
                layer.msg("修改失败");
            }
        }
    });
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


