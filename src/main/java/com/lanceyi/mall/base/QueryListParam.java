package com.lanceyi.mall.base;

/**
 * @author Lance YI
 * @date 2019/7/25 11:55
 */

public class QueryListParam {
    private Integer pageSize;
    private Integer pageNum;

    public QueryListParam() {
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}