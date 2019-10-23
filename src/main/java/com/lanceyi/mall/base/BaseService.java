package com.lanceyi.mall.base;

import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Lance YI
 * @date 2019/7/26 17:07:43
 */
public class BaseService<M , T> {
    protected Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected M mapper;

    public BaseService() {
    }

    protected void setPageQueryParam(QueryListParam param) {
        Integer pageIndex = param.getPageIndex();
        Integer pageSize = param.getPageSize();
        if (pageIndex != null && pageSize != null) {
            PageHelper.startPage(pageIndex, pageSize);
        }

    }
}