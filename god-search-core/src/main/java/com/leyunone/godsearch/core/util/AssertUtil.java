package com.leyunone.godsearch.core.util;


import com.leyunone.godsearch.common.bean.ResponseCode;
import com.leyunone.godsearch.common.config.GodSearchException;

/**
 * @author leyunone
 * @create 2021-08-13 09:31
 *
 * 报错处理
 */
public class AssertUtil {

    public static void isFalse(boolean condition, ResponseCode code){
        isFalse(condition,code.getDesc());
    }

    public static void isFalse(boolean condition,String message){
        isFalse(condition,new GodSearchException(message));
    }

    public static void isFalse(boolean condition){
        isFalse(condition,new GodSearchException("system error"));
    }

    public static void isFalse(boolean condition,GodSearchException ex){
        isTrue(!condition,ex);
    }

    public static void isTrue(boolean condition,GodSearchException ex){
        if(!condition){
            throw ex;
        }
    }

    public static void isTrue(boolean condition,String msg) {
        if(!condition){
            throw new GodSearchException(msg);
        }
    }

    public static void isTrue(boolean condition){
        if(!condition){
            throw new GodSearchException("系统异常");
        }
    }

    public static void isTrue(String msg){
        throw new GodSearchException(msg);
    }
}
