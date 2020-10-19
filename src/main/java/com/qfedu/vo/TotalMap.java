package com.qfedu.vo;

import com.baomidou.mybatisplus.extension.api.R;
import com.qfedu.core.type.RType;
import lombok.Data;

import java.util.Set;

/**
 * projectName: Kadaba
 * author: 崔
 * time: 2020/10/19  17:15
 * description:通一返回结果
 */
@Data
public class TotalMap<T>{
    private Integer code;
    private String msg;
    private Integer total;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TotalMap() {
    }

    public TotalMap(Integer code, String msg, Integer total, T data) {
        this.code = code;
        this.msg = msg;
        this.total = total;
        this.data = data;
    }
    public static <T> TotalMap setT(int c,String m, T obj){
        TotalMap totalMap = new TotalMap();
        totalMap.setCode(c);
        totalMap.setMsg(m);
        totalMap.setData(obj);
        return totalMap;
    }
    //成功
    public static TotalMap ok(){
        return setT(RType.成功.getVal(),"ok",null);
    }
    //成功
    public static <T> TotalMap ok(T t){
        return setT(RType.成功.getVal(),"ok",null);
    }
    //失败
    public static TotalMap fail(){
        return setT(RType.失败.getVal(),"Fail",null);
    }

}
