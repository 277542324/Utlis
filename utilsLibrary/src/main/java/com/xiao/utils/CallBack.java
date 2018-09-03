package com.xiao.utils;

/**
 * @author xiaoxiao
 * @date 2018/8/21
 */

public interface CallBack {
    /**
     *
     * @param string 回调String 参数
     * @param type  回调类型 参数
     */
    void requestCallback(String type, String string);

    /**
     *
     * @param string 回调String 参数
     *
     */
    void requestCallback(String string);
}
