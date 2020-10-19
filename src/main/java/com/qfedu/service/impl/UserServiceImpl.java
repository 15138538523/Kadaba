package com.qfedu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qfedu.dao.UserDao;
import com.qfedu.entity.User;
import com.qfedu.service.UserService;
import com.qfedu.vo.TotalMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: Kadaba
 * author: 崔
 * time: 2020/10/19  17:06
 * description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public TotalMap<List<User>> all() {
        QueryWrapper<User> mapper = new QueryWrapper<>();
        mapper.orderByDesc("id");
        return TotalMap.ok(userDao.selectList(mapper));
    }
}
