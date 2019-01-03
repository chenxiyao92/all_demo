<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/7
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ include file="common-js.jsp"%>--%>
<jsp:include page="common-js.jsp"/>

<html>

<head>
    <title>Title</title>
</head>
<body>

<div class="easyui-window" style="width: 500px;height: 500px">
    <table>
        <tr>
            <td>姓名</td>
            <td><input type="text" class="easyui-validatebox" data-options="required:true,validType:'equals[2,5]'"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password"></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input id="age" type="text" class="easyui-numberbox"></td>
        </tr>
        <tr>
            <td>出生日期</td>
            <td><input id="dd" type="text"></td>
        </tr>

    </table>
</div>

</body>
<script>
    $(function () {
        $.extend($.fn.validatebox.defaults.rules, {
            equals: {
                validator: function (value, param) {
                        return value.length>= param[0] && value.length<= param[1] ;
                },
                message: '必须在2到5之间'
            }
        });
        $("#age").numberbox({
            required:true,
            missingMessage:"不能为空",
            suffix:"元",
            precision:2,
            message:"数字不符合"

        })
        $('#dd').datebox({
            editable:false,
            required:true

        });



    });
</script>
</html>
