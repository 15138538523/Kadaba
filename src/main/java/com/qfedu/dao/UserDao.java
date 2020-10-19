package com.qfedu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qfedu.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends BaseMapper<User> {

}
