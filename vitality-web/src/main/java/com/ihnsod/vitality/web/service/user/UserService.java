package com.ihnsod.vitality.web.service.user;


import com.ihnsod.vitality.web.pojo.User;
import com.ihnsod.vitality.web.service.BaseService;

import java.util.List;

/**
 * @author: Ihnsod
 * @create: 2019/04/06 22:02
 **/
public interface UserService extends BaseService<User> {
    List<User> selectByTerm();
}
