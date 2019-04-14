package com.ihnsod.vitality.web.controller.user;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ihnsod.vitality.web.common.result.BaseResult;
import com.ihnsod.vitality.web.pojo.User;
import com.ihnsod.vitality.web.service.user.UserService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: Ihnsod
 * @create: 2019/04/06 22:00
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @ApiOperation("获取用户列表")
    @RequestMapping("/list")
    public BaseResult listUser() {
        System.err.println(userService.page(new Page<>(1,2)).getRecords());
        System.err.println(userService.count());
        return BaseResult.successCollection(userService.page(new Page<>(1,2)).getRecords());
    }

    @ApiOperation("获取用户列表")
    @RequestMapping("/params")
    public BaseResult listParams() {
        List<User> list = userService.list(new QueryWrapper<User>().lambda().select(User::getId, User::getAge));
        logger.info(list.toString());
        logger.debug(list.toString());
        return BaseResult.successCollection(list);
    }

    @ApiOperation("获取用户列表")
    @RequestMapping("/mybatis")
    public BaseResult mybatis() {
        List<User> list = userService.selectByTerm();
        logger.info(list.toString());
        return BaseResult.successCollection(list);
    }
}
