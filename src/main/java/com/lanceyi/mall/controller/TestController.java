package com.lanceyi.mall.controller;


import com.lanceyi.mall.base.PageDataConvert;
import com.lanceyi.mall.base.PageInfo;
import com.lanceyi.mall.base.QueryListParam;
import com.lanceyi.mall.base.SuccessResponseTemplate;
import com.lanceyi.mall.config.Path;
import com.lanceyi.mall.domain.response.TestResponse;
import com.lanceyi.mall.model.User;
import com.lanceyi.mall.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Lance YI
 * @date 2018/12/4 10:01
 */

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @ApiOperation("测试")
    @GetMapping(Path.Test.BASE)
    public SuccessResponseTemplate<List<TestResponse>> hello() {
        TestResponse testResponse = new TestResponse();
        testResponse.setFirstName("Yi");
        testResponse.setLastName("Lance");
        return SuccessResponseTemplate.ok(testResponse);
    }

    @ApiOperation("获取用户列表")
    @GetMapping(Path.Test.USER_LIST)
    public SuccessResponseTemplate<List<User>> getUserList() {
        List<User> userList = userService.getUserList();
        return SuccessResponseTemplate.ok(userList);
    }

    @ApiOperation("获取分页用户列表")
    @PostMapping(Path.Test.PAGE_USER_LIST)
    public SuccessResponseTemplate<PageInfo<List<User>>> queryUserList(@RequestBody QueryListParam queryListParam) {
        User user = new User();
        List<User> userList = userService.queryUserList(user, queryListParam);
        PageInfo pageInfo = new PageInfo(userList);
        return SuccessResponseTemplate.ok(pageInfo);
    }


}
