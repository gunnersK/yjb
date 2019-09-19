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
   processData属性是：布尔值，规定通过请求发送的数据是否转换为查询字符串。默认是 true
3. layui下拉框的值，经常要用到动态加载数据的功能，在用jquery操作完DOM元素之后需要调用 form.render(type, filter)方法进行重新渲染，否则加载无效
   1. 第一个参数：type，为表单的 type 类型，可选。默认对全部类型的表单进行一次更新，可局部刷新的 type 
   2. 第二个参数：filter，为 class="layui-form" 所在元素的 lay-filter="" 的值。你可以借助该参数，对表单完成局部更新
      ```
         form.render('select');//表示刷新select选择框渲染
      ```
      详见layui官网文档表单的更新渲染部分
