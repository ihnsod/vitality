package com.ihnsod.vitality.web.mapper;


import com.ihnsod.vitality.web.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Ihnsod
 * @create: 2019/04/06 21:58
 **/
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> selectByterm();
}
