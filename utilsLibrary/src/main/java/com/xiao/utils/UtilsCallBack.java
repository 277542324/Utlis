package com.xiao.utils;

/**
 * Created by xiaoxiao on 2018/8/21.
 */

public class UtilsCallBack {

    /**普通请求回调*/
    private static CallBack mCallBack;

    /**防止一个页面两次请求需要的**/
    private static CallBackAgain mCallBackAgain;

    /**请求用户信息回调接口**/
    private static CallBackUser mCallBackUser;

    /**请求购物车回调接口**/
    private static CallBackAddCart mCallBackAddCart;

    public static void startCallBack(CallBack callBack) {
        mCallBack = callBack;
    }

    public static void setCallBack(String str) {
        mCallBack.requestCallback(str);
    }

    public static void setCallBackAgain(String str) {
        mCallBackAgain.requestCallbackAgain(str);
    }

    public static void setCallBackUser(String str) {
        mCallBackUser.requestCallbackUser(str);
    }

    public static void setCallBackAddCart(String str) {
        mCallBackAddCart.requesetCallBackAddCart(str);
    }
}
