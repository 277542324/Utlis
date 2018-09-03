package com.xiao.utils;

/**
 * Created by xiaoxiao on 2018/8/21.
 */

public class UtilsCallBack {
    /**
     * 普通请求回调
     */
    private static CallBack mCallBack;

    public static void startCallBack(CallBack callBack) {
        mCallBack = callBack;
    }

    public static void setCallBack(String type,String str) {
        mCallBack.requestCallback(type,str);
    }

}
