<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="list-search">
    <div id="pc" class="hidden-sm hidden-xs">
        <div class="title col-lg-1 col-md-2">社团类别</div>
        <ul class="association-type list-inline col-lg-11 col-md-10">
            <li value="10" class="item">&nbsp;&nbsp;所有类别&nbsp;&nbsp;</li>
            <li value="11" class="item">&nbsp;&nbsp;公益实践&nbsp;&nbsp;</li>
            <li value="12" class="item">&nbsp;&nbsp;理论学习&nbsp;&nbsp;</li>
            <li value="13" class="item">&nbsp;&nbsp;社会科学&nbsp;&nbsp;</li>
            <li value="14" class="item">&nbsp;&nbsp;体育健身&nbsp;&nbsp;</li>
            <li value="15" class="item">&nbsp;&nbsp;文化艺术&nbsp;&nbsp;</li>
            <li value="16" class="item">&nbsp;&nbsp;学术科技&nbsp;&nbsp;</li>
        </ul>
        <div class="title col-lg-1 col-md-2">社团星级</div>
        <ul class="association-star list-inline col-lg-11 col-md-10">
            <li value="0" class="item">&nbsp;&nbsp;所有星级&nbsp;&nbsp;</li>
            <li value="5" class="item">&nbsp;&nbsp;五星&nbsp;&nbsp;</li>
            <li value="4" class="item">&nbsp;&nbsp;四星&nbsp;&nbsp;</li>
            <li value="3" class="item">&nbsp;&nbsp;三星&nbsp;&nbsp;</li>
            <li value="2" class="item">&nbsp;&nbsp;二星&nbsp;&nbsp;</li>
            <li value="1" class="item">&nbsp;&nbsp;一星&nbsp;&nbsp;</li>
        </ul>
        <div class="title col-lg-1 col-md-2">名称搜索</div>
        <div class="title col-lg-2 col-md-3">
            <input class="form-control" type="text" onchange="association.name($(this))">
        </div>
        <input class="btn btn-default" type="button" value="搜索"
               onclick="association.searchAssociationList()"/>
    </div>

    <div id="phone" class="hidden-lg hidden-md row">
        <div id="phone-type" class="title col-sm-6 col-xs-6"
             data-toggle="modal" data-target="#phone-type-choose">所有类别</div>
        <div id="phone-star" class="title col-sm-6 col-xs-6"
             data-toggle="modal" data-target="#phone-star-choose">所有星级</div>
        <div class="col-sm-10 col-xs-10">
            <input class="form-control" type="text" placeholder="社团名称查找"
                   onchange="association.name($(this))">
        </div>
        <div class="col-sm-2 col-xs-2">
            <input class="btn btn-default" type="button" value="搜索"
                   onclick="association.searchAssociationList()"/>
        </div>

        <div class="modal fade" id="phone-type-choose" tabindex="-1" role="dialog" aria-labelledby="association-type">
            <div class="modal-dialog modal-sm" role="document">
                <div class="modal-content">
                    <div class="modal-body">
                        <ul class="association-type list-unstyled">
                            <li value="10" class="item" data-dismiss="modal">&nbsp;&nbsp;所有类别&nbsp;&nbsp;</li>
                            <li value="11" class="item" data-dismiss="modal">&nbsp;&nbsp;公益实践&nbsp;&nbsp;</li>
                            <li value="12" class="item" data-dismiss="modal">&nbsp;&nbsp;理论学习&nbsp;&nbsp;</li>
                            <li value="13" class="item" data-dismiss="modal">&nbsp;&nbsp;社会科学&nbsp;&nbsp;</li>
                            <li value="14" class="item" data-dismiss="modal">&nbsp;&nbsp;体育健身&nbsp;&nbsp;</li>
                            <li value="15" class="item" data-dismiss="modal">&nbsp;&nbsp;文化艺术&nbsp;&nbsp;</li>
                            <li value="16" class="item" data-dismiss="modal">&nbsp;&nbsp;学术科技&nbsp;&nbsp;</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <div class="modal fade" id="phone-star-choose" tabindex="-1" role="dialog" aria-labelledby="association-star">
            <div class="modal-dialog modal-sm" role="document">
                <div class="modal-content">
                    <div class="modal-body">
                        <ul class="association-star list-unstyled">
                            <li value="0" class="item" data-dismiss="modal">&nbsp;&nbsp;所有星级&nbsp;&nbsp;</li>
                            <li value="5" class="item" data-dismiss="modal">&nbsp;&nbsp;五星&nbsp;&nbsp;</li>
                            <li value="4" class="item" data-dismiss="modal">&nbsp;&nbsp;四星&nbsp;&nbsp;</li>
                            <li value="3" class="item" data-dismiss="modal">&nbsp;&nbsp;三星&nbsp;&nbsp;</li>
                            <li value="2" class="item" data-dismiss="modal">&nbsp;&nbsp;二星&nbsp;&nbsp;</li>
                            <li value="1" class="item" data-dismiss="modal">&nbsp;&nbsp;一星&nbsp;&nbsp;</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
