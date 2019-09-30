/**
 * Created by Administrator on 2019/9/11.
 */
$(function(){
	var form;
	var table;
	var ctcTable;
	var sendTable;
	var layer;
	var element;
	var i;
});

layui.use(['table', 'layer', 'form', 'laydate', 'element'], function(){
    table = layui.table;
    form = layui.form;
    layer = layui.layer;
    var laydate = layui.laydate;
    element = layui.element;
    $ = layui.jquery;
    
    //短信收发记录表格
    sendTable = table.render({
        elem: '#sms-rec-table',
        id: 'sms-rec-table',
        width: 1317,
        height: 500,
        page:true,
        limit: 10,
        text: {none: "找不到联系人"},
        url: '/record/list',
        cols: [[
            {field: 'recordId', title: 'ID', checkbox: true, align: 'center'},
            {field: 'ctcName', title: '联系人', align: 'center', width:160, 
            	templet: function(d){
            		return d.ctcName+"("+d.ctcPhone+")";
            	}},
    	    {field: 'smsTime', title: '发送/接收时间', align: 'center', width:161,templet : "<div>{{layui.util.toDateString(d.ordertime, 'yyyy-MM-dd HH:mm:ss')}}</div>"},
            {field: 'smsContent', title: '收发内容', align: 'center', width:852},
            {field: 'smsStatus', title: '状态', align: 'center', width:90, 
            	templet: function(d){
            		if(d.smsStatus == 1){
            			return "发送成功";
            		} else{
            			return "接收成功";
            		}
            	}},
        ]]
    });
    
    //发短信按钮
    $("#send-btn").click(function(){
    	clearAll();
        i = layer.open({
            title: "发送短信",
            area: ['850px', '540px'],
            type: 1,
            btnAlign: 'c',
            closeBtn: 1,
            content: $("#send-sms-win")
        });
    });
    
    //删除记录按钮
    $("#del-btn").click(function(){
        var checkedRows = table.checkStatus('sms-rec-table');
        var rows = checkedRows.data;
        var ids = [];
        for(var i = 0; i < rows.length; i++){
            ids.push(rows[i].recordId);
        }
        if(checkedRows.data.length == 0){
            layer.msg('请选中要删除的记录');
        } else{
            layer.confirm('确定删除选中的记录？', function(index){
            	delRecords(ids);
                layer.close(index);
//                ctcTable.reload({page: {curr: 1}});
                sendTable.reload();
            });
        }
    });

    //查询日期组件
    laydate.render({
        elem: '#date-start',
        type: 'date'
    });
    laydate.render({
        elem: '#date-end',
        type: 'date'
    });
    
    //查询按钮
    $("#search-btn").click(function(){
    	var ctcName = $("#contactName").val();
    	var startDate = $("#date-start").val();
    	var endDate = $("#date-end").val();
    	sendTable.reload({
            where: {
            	ctcName:ctcName,
            	startDate:startDate,
            	endDate:endDate
            },
            page: {
            	curr: 1
            }
        });
    });
    
    //发送窗口的联系人表格
    ctcTable = table.render({
        elem: '#contact-table',
        id: 'contact-table',
        width: 440,
        height: 300,
        skin: 'line',
        limit: 100000000,
        text: {none: "找不到联系人"},
        url: '/contact/list',
        method:'post',
        cols: [[
            {field: 'ctcId', title: 'ID', checkbox: true, align: 'center'},
            {field: 'ctcName', title: '姓名', align: 'center', width:187},
            {field: 'ctcPhone', title: '手机号码', align: 'center', width:187}
        ]]
    });
    
    //选择群组下拉列表监听
    form.on('select(groList)', function(data){
    	var ctcGroup = data.value;
    	ctcTable.reload({
            where: {ctcGroup:ctcGroup}
        });
    });
    
    //手机号码框监听
    $("#ctcPhone").keyup(function(){
    	var ctcPhone = $("#ctcPhone").val(); 
    	ctcTable.reload({
    		where: {ctcPhone:ctcPhone}
    	});
    });

    //添加联系人按钮
    $("#addBtn").click(function(){
    	var ctcName;
    	var ctcId;
    	var flag = 0;
    	var rows = table.checkStatus('contact-table').data;
    	for(var i = 0; i < rows.length; i++){
    		ctcName = rows[i].ctcName;
    		ctcId = rows[i].ctcId;
    		$(".ctc-label").each(function(){
    			if($(this).attr('value') == ctcId && $(this).attr('name') == ctcName){
    				flag = 1;
    				return false; 
    			} 
    		});
    		if(flag == 0){
    			$(".send-contact").append('<a class="ctc-label" name='+ctcName+' value='+ctcId+'>'+ctcName+'<i class="del-icon layui-icon" onclick="javascript:$(this).parent().remove();">&#x1006;</i></a>');
    		} else{
    			flag = 0;
    		}
    	}
    });
    
    //清空已选联系人
    $("#clearCtc").click(function(){
    	$(".ctc-label").remove();
    });
    
    //发送按钮
    $("#sendBtn").click(function(){
    	if($("#sendContent").val() != null && $("#sendContent").val() != ""){
    		var ctcId;
    		var content = $("#sendContent").val();
    		var nums = [];
    		var num;
    		$(".ctc-label").each(function(){
    			num = $(this).attr('value');
    			if(num != "" && num != null){
    				nums.push(num);
    			} 
    		});
    		ctcId = nums.join(',');
    		$.ajax({
    			type : "POST",//方法类型
    			async : false,
    			dataType : "json",//预期服务器返回的数据类型
    			data: {"ctcId":ctcId, "sendContent": content},
    			url : "/sendSms/more",//url
    			processData: true,
    			success : function(data) {
    				if(data.status == 200){
    					layer.msg("发送成功");
    				}
    				layer.close(i);
    				clearAll();
    				sendTable.reload();
    			}
    		});
    	}
    	else{
    		layer.msg("请输入发送内容");
    	}
    });
    loadSerialize();
    refreshGroupList();
    resizeCtcTable();
});

//删除短信
function delRecords(ids){
    $.ajax({
        type : "POST",//方法类型
        async : false,
        dataType : "json",//预期服务器返回的数据类型
        url : "/delete/record",//url
        data : {"ids":ids},
        traditional:true,//必须加上设置为true
        success : function(data) {
            if (data.status == 200) {
                layer.msg("删除成功");
            } else{
                layer.msg("删除失败");
            }
        }
    });
}

function resizeCtcTable(){
	$(".contact-table").find(".layui-table-cell").each(function(){
		$(this).css({"height":"10px","line-height":"10px"});
	});
}

//刷新群组下拉列表
function refreshGroupList(){
	$.ajax({
        type : "POST",//方法类型
        async : false,
        dataType : "json",//预期服务器返回的数据类型
        url : "/group/list",//url
        processData: false,
        success : function(data) {
        	//清空群组下拉列表
        	var opt = $("#groList").find("option");
        	$(opt).remove();
        	$("#groList").append('<option value="">全部</option>');
        	
        	//将查询到的群组重新添加进群组下拉列表里
        	for(var i = 0; i < data.length; i++){
        		$("#groList").append('<option value="'+data[i].groId+'">'+data[i].groAbbr+'</option>');
        	}
        	form.render();
//        	element.init();
        }
    });
}

function clearAll(){
	$(".ctc-label").remove();
	ctcTable.reload({
        where: {ctcGroup:""}
    });
	$("#sendContent").val("");
	refreshGroupList();
	$("#ctcPhone").val("");
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