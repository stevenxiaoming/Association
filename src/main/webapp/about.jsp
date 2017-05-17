<%--
  Created by IntelliJ IDEA.
  User: StevenMing
  Date: 2017/4/29
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ include file="common/jarLib.jsp" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <title><%=headerTitle %> | 关于</title>
    <%@ include file="common/head.jsp" %>
</head>

<body>
<%@ include file="common/headerBar.jsp" %>
<div class="container">
    <div style="text-align: center">
        <h3>夏季学期大作业</h3>
        <hr />
        <h4>这只是一个作业</h4>
    </div>
</div>
<%-- script --%>
<%@ include file="common/bottom.jsp" %>
<script type="text/javascript">
    $(document).ready(function () {
        $("#header-bar-about").attr("class", "active");
        $("#header-bar-about-sub").append("<span class='sr-only'>(current)</span>");
    });
</script>
</body>

</html>