package com.xiao.utils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoxiao on 2017/4/8.
 */
public class UtilsGson {

    /**
     * 转成list
     * 解决泛型问题
     * @param json
     * @param cls
     * @param <T>
     * @return
     */
    public static  <T> List<T> jsonToList(String json, Class<T> cls,ArrayList<T> list) {
        Gson gson = new Gson();
        JsonArray array = new JsonParser().parse(json).getAsJsonArray();
        for(final JsonElement elem : array){
            list.add(gson.fromJson(elem, cls));
        }
        return list;
    }

    public static <T> T GsonToBean(String gsonString, Class<T> cls) {
        Gson gson = new Gson();
        T t = null;
        if (gson != null) {
            t = gson.fromJson(gsonString, cls);
        }
        return t;
    }
    /**
     * 转成json
     *
     * @param object
     * @return
     */
    public static String GsonString(Object object) {
        Gson gson = new Gson();
        String gsonString = null;
        if (gson != null) {
            gsonString = gson.toJson(object);
        }
        return gsonString;
    }
}
