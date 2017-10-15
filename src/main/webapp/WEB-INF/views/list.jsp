<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <div class="col-md-12">
            <h1>SSM-CRUD</h1>
        </div>
    </div>
    <%--按钮--%>
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <button class="btn btn-primary">新增</button>
            <button class="btn btn-danger">删除</button>
        </div>
    </div>
    <%--显示表格数据--%>
    <div class="row">
        <div class="col-md-12">
             <table class="table table-hover">
                 <tr>
                     <th>#</th>
                     <th>empName</th>
                     <th>gender</th>
                     <th>email</th>
                     <th>deptName</th>
                     <th>操作</th>
                 </tr>
                 <c:forEach items="${pageInfo.list }" var="emp">
                     <tr>
                         <th>${emp.empId}</th>
                         <th>${emp.empName}</th>
                         <th>${emp.gender=="M"?"男":"女"}</th>
                         <th>${emp.email}</th>
                         <th>${emp.department.deptName}</th>
                         <th>
                             <button class="btn btn-primary btn-sm">
                                 <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>  编辑
                             </button>
                             <button class="btn btn-danger btn-sm">
                                 <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>  删除
                             </button>
                         </th>
                     </tr>
                 </c:forEach>
             </table>
        </div>
    </div>
    <%--显示分页信息--%>
    <div class="row">
        <%--分页信息--%>
        <div class="col-md-6">
            当前记录数:XXX
        </div>
        <%--分页条信息--%>
        <div class="col-md-6">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <li><a href="#">首页</a> </li>
                    <li>
                        <a href="#" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </li>
                    <li><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li>
                        <a href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>
                    <li><a href="#">末页</a> </li>
                </ul>
            </nav>
        </div>
    </div>

</div>

</body>
</html>
