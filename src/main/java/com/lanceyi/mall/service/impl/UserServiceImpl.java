package com.lanceyi.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.lanceyi.mall.base.BaseService;
import com.lanceyi.mall.base.QueryListParam;
import com.lanceyi.mall.mapper.UserMapper;
import com.lanceyi.mall.model.User;
import com.lanceyi.mall.model.UserExample;
import com.lanceyi.mall.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Lance Yi
 * @Date 2019/10/23 15:34
 */
@Service
public class UserServiceImpl extends BaseService<UserMapper, User, Integer> implements UserService{

    @Override
    public List<User> getUserList() {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        List<User> userList = super.mapper.selectByExample(userExample);
        return userList;
    }

    @Override
    public List<User> queryUserList(User user, QueryListParam queryListParam) {
        super.setPageQueryParam(queryListParam);
        List<User> userList = this.getUserList();
        return userList;
    }

}
