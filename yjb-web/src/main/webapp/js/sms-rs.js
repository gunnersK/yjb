/**
 * Created by Administrator on 2019/9/11.
 */
layui.use(['table', 'layer', 'form', 'laydate', 'element'], function(){
    var table = layui.table;
    var form = layui.form;
    var layer = layui.layer;
    var laydate = layui.laydate;
    var element = layui.element;
    $ = layui.jquery;

    //查询日期组件
    laydate.render({
        elem: '#date-start',
        type: 'date'
    });
    laydate.render({
        elem: '#date-end',
        type: 'date'
    });

    //短信收发记录表格
    table.render({
        elem: '#sms-rec-table',
        id: 'sms-rec-table',
        //width: 1315,
        height: 500,
        page:true,
        limit: 10,
        text: {none: "找不到联系人"},
        url: '/json/contact.json',
        //url: 'http://localhost:8088/json/a.json',
        cols: [[
            {field: 'id', title: 'ID', checkbox: true, align: 'center'},
            {field: 'name', title: 'name', align: 'center', width:140},
            {field: 'gender', title: 'gender', align: 'center', width:80},
            {field: 'phone', title: 'phone', align: 'center', width:140},
            {field: 'tel', title: 'tel', align: 'center', width:140},
            {field: 'job', title: 'job', align: 'center', width:140},
            {field: 'com_addr', title: 'com_addr', align: 'center', width:228},
            {field: 'oper', title: 'oper', align: 'center', width:150, toolbar: '#barDemo'}
        ]]
    });
});