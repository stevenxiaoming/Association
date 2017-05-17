/**
 * Created by StevenMing on 2017/5/3.
 */

$(function () {
    // 初始化，并请求数据
    association.init();
});

$("#pc .association-type li").click(function () {
    association.type($(this));
});

$("#pc .association-star li").click(function () {
    association.star($(this));
});

$("#phone .association-type li").click(function () {
    association.phoneType($(this));
});

$("#phone .association-star li").click(function () {
    association.phoneStar($(this));
});

var association = {
    basePath: "",
    postUrl: "/association",
    currentPage: 1,
    totalPage: 1,
    wait: 0,
    isLoading: false,
    init: function () {
        // 导航条初始化
        $("#header-bar-association").attr("class", "active");
        $("#header-bar-association-sub").append("<span class='sr-only'>(current)</span>");
        $(".association-type .item:first").attr("class", "item active");
        $(".association-star .item:first").attr("class", "item active");

        // 搜索请求值初始化
        $.cookie('type', 10);
        $.cookie('star', 0);
        $.cookie('name', "");

        // 获取初始数据
        association.searchAssociationList();
    },
    type: function (obj) {
        $("#pc .association-type .item").attr("class", "item");
        obj.attr("class", "item active");
        $("#phone-type").text(obj.text());
        $.cookie('type', obj.val());
        association.searchAssociationList();
    },
    phoneType: function (obj) {
        $("#phone-type").text(obj.text());
        $.cookie('type', obj.val());
        association.searchAssociationList();
    },
    star: function (obj) {
        $("#pc .association-star .item").attr("class", "item");
        $(obj).attr("class", "item active");
        $("#phone-star").text(obj.text());
        $.cookie('star', obj.val());
        association.searchAssociationList();
    },
    phoneStar: function (obj) {
        $("#phone-star").text(obj.text());
        $.cookie('star', obj.val());
        association.searchAssociationList();
    },
    name: function (obj) {
        $.cookie('name', obj.val());
    },
    searchAssociationList: function () {
        association.currentPage = 1;
        // 设置延时，防止重复提交
        if (association.wait > 0) {
            alert("请不要频繁查询");
            return;
        } else {
            association.wait = 1;
            setTimeout(function () {
                    association.wait = 0;
                },
                200);
        }
        $("#association-show-list").html("");

        // 绑定滚动条监听事件
        association.bindScrollEvent();

        // 获取社团信息
        association.getAssociationList();
    },
    getAssociationList: function () {
        // 判断是否加载
        if (association.isLoading) {
            return;
        } else {
            association.isLoading = true;
        }

        $('#association-tips').html("社团加载中......");

        // ajax异步加载请求
        $.post(association.postUrl, {currentPage: association.currentPage}, function (result) {
            association.totalPage = result.totalPage;
            association.showAssociation(result.list);

            // 提示剩余未加载社团信息
            if (association.currentPage < association.totalPage) {
                $('#association-tips').html("下拉显示更多社团");
            } else {
                $(window).unbind("scroll");
                $('#association-tips').html("没有更多社团了");
            }
            association.isLoading = false;
        });
    },
    showAssociation: function (list) {
        $.each(list, function (idx, obj) {
            var html = "";
            html += "<div class='item row' onclick='window.location.href=\"" + association.basePath + "association/" + obj.associationId + "\"'>"
                + "<div class='logo col-lg-2 col-md-2 col-sm-4 col-xs-5'>"
                + "<img class='img-responsive' src='images/associationLogo/" + obj.logo
                + "' alt='" + obj.associationName + "Logo'/>"
                + "</div>"
                + "<div class='content col-lg-8 col-md-8 col-sm-8 col-xs-7'>"
                + "<h4 class='name'>" + obj.associationName + "</h4>"
                + "<h5 class='type-star'>" + obj.type + "&nbsp;-&nbsp;";
            for (var i = 0; i < obj.star; i++) {
                html += "<i class='fa fa-star' aria-hidden='true'></i>";
            }
            html += "</h5>"
                + "<div class='words hidden-xs'>简介：" + obj.wordIntroduction + "</div>"
                + "</div>"
                + "<div class='more col-lg-2 col-md-2 hidden-sm hidden-xs'>"
                + "<a href='" + association.basePath + "association/" + obj.associationId + "'>"
                + "查看详细信息"
                + "</a>"
                + "</div>"
                + "</div>"
                + "<hr />";
            $("#association-show-list").append(html);
        });
    },
    bindScrollEvent: function () {
        // 滚动监听
        $(window).scroll(function () {
            var docHeight = $(document).height(); // 获取整个页面的高度
            var winHeight = $(window).height(); // 获取当前窗体的高度
            var winScrollHeight = $(window).scrollTop(); // 获取滚动条滚动的距离
            if (docHeight - 30 <= winHeight + winScrollHeight) {
                association.currentPage++;
                association.getAssociationList();
            }
        })

    }
};