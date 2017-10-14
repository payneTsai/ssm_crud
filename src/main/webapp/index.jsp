<%--
  Created by IntelliJ IDEA.
  User: peter
  Date: 17/9/17
  Time: 下午3:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:forward page="/emps"></jsp:forward>
<html>
<head>
    <title>员工列表</title>
    <%--引入jquery--%>
    <script type="text/javascript" src="static/js/jquery-1.12.4.min.js"></script>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <!-- Bootstrap -->
    <link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container" >
    <%--标题--%>
    <div class="row">
        <div class=".col-md-12">
            <h1>SSM-CRUD</h1>
        </div>
    </div>
    <%--按钮--%>
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <button class="btn btn-primary">新增</button>
            <button class="btn btn-danger">删除</button>
        </div>
    </div>
    <%--显示表格数据--%>
    <div class="row"></div>
    <%--显示分页信息--%>
    <div class="row"></div>

</body>
</html>
