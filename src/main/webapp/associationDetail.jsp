<%--
  Created by IntelliJ IDEA.
  User: StevenMing
  Date: 2017/5/15
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ include file="common/jarLib.jsp" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <title><%=headerTitle %> | 社团-${association.associationName}</title>
    <%@ include file="common/head.jsp" %>
</head>

<body>
<%@ include file="common/headerBar.jsp" %>
<div class="container">
    <div onclick="window.location.href= '<%=basePath %>index.jsp'">
            ${association.associationId}<br/>
            ${association.associationName}<br/>
            ${association.type}<br/>
            ${association.star}<br/>
            ${association.associationDepartment}<br/>
            ${association.instructor}<br/>
            ${association.associationStatus}<br/>
            <br/>
            ${association.nickName}<br/>
            ${association.logo}<br/>
            ${association.wordIntroduction}<br/>
            ${association.associationEmail}<br/>
            ${association.wechatId}<br/>
            ${association.wechatName}<br/>
            ${association.wechatCode}<br/>
            ${association.associationQq}<br/>
            ${association.applyStatus}<br/>
            <br/>
            ${association.introduction}<br/>
            ${association.gmtCreate}<br/>
            ${association.gmtModified}<br/>
    </div>
</div>
<%-- script --%>
<%@ include file="common/bottom.jsp" %>
<script type="text/javascript">
    $(document).ready(function () {
        $("#header-bar-association").attr("class", "active");
        $("#header-bar-association-sub").append("<span class='sr-only'>(current)</span>");
    });
</script>
</body>

</html>