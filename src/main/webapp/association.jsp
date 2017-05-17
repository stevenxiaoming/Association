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
    <title><%=headerTitle %> | 社团</title>
    <%@ include file="common/head.jsp" %>
    <link href="css/association.css" rel="stylesheet">
</head>

<body>
<%@ include file="common/headerBar.jsp" %>
<div class="container">
    <%@ include file="association-head.jsp" %>
    <div id="association-show-list" class="list-show">
        <%-- 通过js生成 --%>
    </div>
    <div id='association-tips' class='tips'>页面加载中......</div>
</div>
<%-- script --%>
<%@ include file="common/bottom.jsp" %>
<script src="https://cdn.bootcss.com/jquery-cookie/1.4.1/jquery.cookie.min.js"></script>
<script src="js/association.js"></script>
<script type="text/javascript">
    $(function () {
        association.basePath = "<%=basePath %>";
    });

</script>
</body>

</html>