package com.qfedu.util;

/**
 * projectName: Kadaba
 * author: 崔
 * time: 2020/10/19  15:50
 * description:
 */

public class StrUtil {
    public static boolean checkNoEmpty(String... str){
        boolean b = true;
        for (String s : str) {
            if(s == null || s.length() == 0){
                b = false;
                break;
            }
        }
        return b;
    }
}
