package com.lanceyi.mall.base;

/**
 * @author Lance YI
 * @date 2019/7/25 11:55
 */

public class QueryListParam {
    private Integer pageSize;
    private Integer pageIndex;

    public QueryListParam() {
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }
}