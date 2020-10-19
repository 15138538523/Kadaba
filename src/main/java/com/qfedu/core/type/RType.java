package com.qfedu.core.type;

/**
 * projectName: Kadaba
 * author: 崔
 * time: 2020/10/19  17:42
 * description:枚举类，型标记多个结果值  也可以用常量代替
 */

public enum RType {
    成功(1), 失败(2), 登录失败(3);
    private int val;
    public int getVal(){
        return val;
    }
    private RType(int v){
        val = v;
    }

}
