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
    <title><%=headerTitle %></title>
    <%@ include file="common/head.jsp" %>
    <link href="css/index.css" rel="stylesheet">
</head>

<body>
<%@ include file="common/headerBar.jsp" %>
<div class="container">
    <div id="carousel" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#carousel" data-slide-to="0"></li>
            <li data-target="#carousel" data-slide-to="1"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox">
            <div class="item active">
                <img src="images/index/ban1.png" alt="上大社团集散中心" onerror="this.src='images/index/default.png';">
                <div class="carousel-caption hidden-sm hidden-xs">
                    <h4>上大社团集散中心——网罗全面的上大社团信息</h4>
                </div>
            </div>
            <div class="item">
                <img src="images/index/ban2.png" alt="六大类社团" onerror="this.src='images/index/default.png';">
                <div class="carousel-caption hidden-sm hidden-xs">
                    <h4>六大类社团——总有一类适合你</h4>
                </div>
            </div>
        </div>

        <!-- Controls -->
        <a class="left carousel-control" href="#carousel" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carousel" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>
<%-- script --%>
<%@ include file="common/bottom.jsp" %>
<script type="text/javascript">
    $(document).ready(function () {
        $("#header-bar-index").attr("class", "active");
        $("#header-bar-index-sub").append("<span class='sr-only'>(current)</span>");
        $("#carousel ol:first li:first").attr("class", "active");
    });
</script>
</body>

</html>