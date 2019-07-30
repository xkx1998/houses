package com.xukexiang.house.biz.mapper;


import com.xukexiang.house.common.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {
    List<User> selectUsers();
}
