package com.ihnsod.vitality.web.service.user.impl;


import com.ihnsod.vitality.web.mapper.UserMapper;
import com.ihnsod.vitality.web.pojo.User;
import com.ihnsod.vitality.web.service.BaseServiceImpl;
import com.ihnsod.vitality.web.service.user.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Ihnsod
 * @create: 2019/04/06 22:03
 **/
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService {

    @Override
    public List<User> selectByTerm() {
        return baseMapper.selectByterm();
    }
}
