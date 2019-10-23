package com.lanceyi.mall.base;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Lance YI
 * @date 2019/7/25 11:55
 */
public class PageInfo<T> implements Serializable {
    private static final long serialVersionUID = -8956237515078338667L;
    @ApiModelProperty("总页数")
    private long pageTotal = 0L;
    @ApiModelProperty("数据总条数")
    private long totalCount;
    @ApiModelProperty("每页显示的数量")
    private int pageSize;
    @ApiModelProperty("当前页码")
    private int pageIndex;
    @ApiModelProperty("分页数据")
    private List<T> list;

    public PageInfo(List<T> listData) {
        com.github.pagehelper.PageInfo<T> pageInfoHelper = new com.github.pagehelper.PageInfo(listData);
        this.setPageParam(pageInfoHelper);
        this.list = pageInfoHelper.getList();
    }

    private void setPageParam(com.github.pagehelper.PageInfo pageInfoHelper) {
        this.pageTotal = (long) pageInfoHelper.getPages();
        this.pageSize = pageInfoHelper.getPageSize();
        this.pageIndex = pageInfoHelper.getPageNum();
        this.totalCount = pageInfoHelper.getTotal();
    }

    public PageInfo(List listData, PageDataConvert convert) {
        com.github.pagehelper.PageInfo pageInfoHelper = new com.github.pagehelper.PageInfo(listData);
        this.setPageParam(pageInfoHelper);
        if (listData != null && listData.size() > 0) {
            List<T> endListData = new ArrayList(listData.size());
            Iterator var5 = listData.iterator();

            while (var5.hasNext()) {
                Object listDatum = var5.next();
                endListData.add((T) convert.convert(listDatum));
            }
            this.list = endListData;
        }

    }
}
