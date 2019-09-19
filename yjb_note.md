1. ajax的post请求提交表单时，如果控制器接收不到参数，看看ajax属性中有没有定义contentType，有就删了试试
2. 用ajax发起查询请求时，data属性无论写json对象还是字符串对象都无法把查询参数传到controller去，后来把processData属性值改为true就正常了
   ```
      $.ajax({
        type : "post",//方法类型
        async : false,
        dataType : "json",//预期服务器返回的数据类型
        url : "/group/getGroupById",//url
    //		data : param,
        data : {"groId":groId},
        processData: true,
        success : function(data) {
          var info = JSON.stringify(data);
          layer.msg(info);
        }
      });
   ```
   processData属性是：布尔值，规定通过请求发送的数据是否转换为查询字符串。默认是 true。
