layui.use(['element','layer','form'], function(){
	//var form = layui.form;
  	var layer = layui.layer;
	var form = layui.form;
	var element = layui.element;
	$ = layui.jquery;
	
	$("#select-gro").click(function(){
		window.location.href="/html/selectGroup.html";
	});
	
	
	
	
  //监听提交
  loadSerialize();
 // getFormJson($("#sendForm"));
  form.on('submit(add_sms)', function(data){
	  console.log(data.elem) //被执行事件的元素DOM对象，一般为button对象
	  console.log(data.form) //被执行提交的form对象，一般在存在form标签时才会返回
	 console.log(data.field) //当前容器的全部表单字段，名值对形式：{name: value}
	 var a = $("#sendForm").serialize();
	 alert(a);
	  $.ajax({
	        type : "POST",//方法类型
	        async : false,
	        dataType : "json",//预期服务器返回的数据类型
	        url : "/sendSms/save",//
	        data :$("#sendForm").serialize(),
//	        contentType: false,
//	        processData: false,
	        success : function(data) {
	            if (data.status == 200) {
	                layer.msg("发送成功");
	            } else{
	                layer.msg("发送失败");
	            }
	        }
	    });
    //layer.msg(JSON.stringify(data.field));
	
	 // var a = $("#sendForm").loadSerialize();
	 // alert(a);
   
    //return false;
  });
});

function formJsonify(dom) {
    var jsons = { };
    var inputVal =  decodeURIComponent($(dom).serialize().replace(/\+/g," ")); // 去空去加号的序列化值
    var d = inputVal.split('&'); // ['1=12' , '2=13']
    for (var i=0;i<d.length;i++) {
        var e = d[i].split('=') // [1,12]
        jsons[e[0]] = e[1]
    }
    return jsons;
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