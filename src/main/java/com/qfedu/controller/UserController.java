package com.qfedu.controller;

import com.qfedu.service.UserService;
import com.qfedu.vo.TotalMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: Kadaba
 * author: 崔
 * time: 2020/10/19  17:02
 * description:
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/all.do")
    public TotalMap all(){
        return userService.all();
    }

}
