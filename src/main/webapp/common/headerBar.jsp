<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<nav id="head-bar" class="navbar navbar-default navbar-static-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#header-bar" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<%=basePath %>index.jsp">SHU Association</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="header-bar">
            <ul class="nav navbar-nav">
                <li id="header-bar-index">
                    <a id="header-bar-index-sub" href="<%=basePath %>index.jsp">
                        <i class="fa fa-home" aria-hidden="true"></i> 首页
                    </a>
                </li>
                <li id="header-bar-association">
                    <a id="header-bar-association-sub" href="<%=basePath %>association.jsp">
                        <i class="fa fa-tags" aria-hidden="true"></i> 社团
                    </a>
                </li>
                <li id="header-bar-activity">
                    <a id="header-bar-activity-sub" href="<%=basePath %>activity.jsp">
                        <i class="fa fa-ticket" aria-hidden="true"></i> 活动
                    </a>
                </li>
                <li id="header-bar-business">
                    <a id="header-bar-business-sub" href="<%=basePath %>business.jsp">
                        <i class="fa fa-table" aria-hidden="true"></i> 公告&事务
                    </a>
                </li>
                <li id="header-bar-discuss">
                    <a id="header-bar-discuss-sub" href="<%=basePath %>discuss.jsp">
                        <i class="fa fa-users" aria-hidden="true"></i> 讨论区
                    </a>
                </li>
                <li id="header-bar-about">
                    <a id="header-bar-about-sub" href="<%=basePath %>about.jsp">
                        <i class="fa fa-info-circle" aria-hidden="true"></i> 关于
                    </a>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <a id="header-bar-login" href="#" data-toggle="modal" data-target="#login">
                        <i class="fa fa-user" aria-hidden="true"></i> 登录
                    </a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="modal fade" id="login" tabindex="-1" role="dialog" aria-labelledby="登录">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">登录</h4>
            </div>
            <div class="modal-body">
                功能暂未开通，敬请期待~~~
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>