package com.qfedu.entity;

import lombok.Data;

/**
 * projectName: Kadaba
 * author: 崔
 * time: 2020/10/19  17:49
 * description:实体类
 */
@Data
public class User {
    private Integer id;
    private String phone;
    private String nickName;
    private String password;
    private int flag;//标记位 1.有效 2.无效

}
