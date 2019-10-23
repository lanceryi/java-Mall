package com.lanceyi.mall.base;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author Lance YI
 * @date 2019/7/25 11:55
 */

public class BasePageRequest extends BaseRequest {
    @ApiModelProperty(
            value = "分页大小",
            required = true
    )
    @NotNull(
            message = "pageSize不能为null"
    )
    private Integer pageSize;
    @ApiModelProperty(
            value = "页码 默认为1",
            required = true
    )
    @Min(1L)
    private Integer pageNum = 1;

    public BasePageRequest() {
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
