package com.xiao.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.HashMap;

/**
 *
 * @author Administrator
 * @date 2017/12/27
 */

public class OpenActManager {

    private static Intent intent;

    private static OpenActManager manager;

    public static OpenActManager get() {
        if (manager == null) {
            synchronized (OpenActManager.class) {
                if (manager == null) {
                    manager = new OpenActManager();
                }
            }
        }
        intent = new Intent();
        return manager;
    }


    /**
     * 启动一个Activity
     *
     * @param _this
     * @param _class
     */
    public  void goActivity(Context _this, Class<? extends Activity> _class) {
        intent.setClass(_this, _class);
        _this.startActivity(intent);
    }

    /**
     * 启动一个Activity
     *
     * @param _this
     * @param _class
     */
    public  void goActivity(Context _this, Class<? extends Activity> _class, HashMap<String, String> map) {
        if (map != null ? map.size() > 0 : false) {
            for (String key : map.keySet()) {
                String value = map.get(key);
                intent.putExtra(key, value);
            }
        }
        intent.setClass(_this, _class);
        _this.startActivity(intent);
    }

    /**
     * 启动一个Activity
     *
     * @param _this
     * @param _class
     */
    public  void goActivity(Context _this, Class<? extends Activity> _class,Bundle mBundle) {
        intent.putExtras(mBundle);
        intent.setClass(_this, _class);
        _this.startActivity(intent);
    }

    /**
     * 启动一个Activity
     *
     * @param _this
     * @param _class
     */
    public  void goActivity(Context _this, Class<? extends Activity> _class, HashMap<String, String> map, Bundle mBundle) {
        if (map != null ? map.size() > 0 : false) {
            for (String key : map.keySet()) {
                String value = map.get(key);
                intent.putExtra(key, value);
            }
        } else {
            intent.putExtras(mBundle);
        }
        intent.setClass(_this, _class);
        _this.startActivity(intent);
    }
}
