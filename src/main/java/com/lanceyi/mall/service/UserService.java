package com.lanceyi.mall.service;

import com.lanceyi.mall.base.QueryListParam;
import com.lanceyi.mall.model.User;

import java.util.List;

/**
 * @Author Lance Yi
 * @Date 2019/10/23 15:33
 */
public interface UserService {

    /**
     * 获取用户列表
     * @return
     */
    List<User> getUserList();

    /**
     * 分页查询用户列表
     * @param user
     * @param queryListParam
     * @return
     */
    List<User> queryUserList(User user, QueryListParam queryListParam);
}
