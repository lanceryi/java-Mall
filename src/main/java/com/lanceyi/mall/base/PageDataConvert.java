package com.lanceyi.mall.base;

/**
 * @author Lance YI
 * @date 2019/7/25 11:55
 */

public interface PageDataConvert<M, T> {
    T convert(M m);
}