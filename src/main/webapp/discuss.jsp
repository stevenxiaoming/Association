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
    <title><%=headerTitle %> | 讨论区</title>
    <%@ include file="common/head.jsp" %>
</head>

<body>
<%@ include file="common/headerBar.jsp" %>
<div class="container">
    <div style="text-align: center">
        <h3>暂不支持该服务</h3>
        <hr />
        <h4>计划推出功能</h4>
        <div>留言和互动</div>
    </div>
</div>
<%-- script --%>
<%@ include file="common/bottom.jsp" %>
<script type="text/javascript">
    $(document).ready(function () {
        $("#header-bar-discuss").attr("class", "active");
        $("#header-bar-discuss-sub").append("<span class='sr-only'>(current)</span>");
    });
</script>
</body>

</html>