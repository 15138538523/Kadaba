package com.qfedu.service;

import com.qfedu.entity.User;
import com.qfedu.vo.TotalMap;

import java.util.List;

public interface UserService {
    TotalMap<List<User>> all();
}
