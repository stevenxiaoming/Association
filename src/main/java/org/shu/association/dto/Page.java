package org.shu.association.dto;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * User: StevenMing
 * Date: 2017/4/27
 * Time: 23:33
 */
public class Page {
    private Integer currentPage;
    private Integer totalPage;
    private Integer PageSize = 10;
    private Integer totalCount;
    private List<?> list;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getPageSize() {
        return PageSize;
    }

    public void setPageSize(Integer pageSize) {
        PageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

}
