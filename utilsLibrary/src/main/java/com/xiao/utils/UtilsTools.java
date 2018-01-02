package com.xiao.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;



/**
 *
 * @author Administrator
 * @date 2017/12/14
 */

public class UtilsTools {
    /**
     * 得到屏幕的宽度
     *
     * @param mContext
     * @return
     */
    public static int getScreenWidth(Context mContext) {
        if (null == mContext) {
            return 0;
        }
        DisplayMetrics dm = new DisplayMetrics();
        dm = mContext.getApplicationContext().getResources().getDisplayMetrics();
        return dm.widthPixels;
    }

    /**
     * 得到屏幕的高度
     *
     * @param context
     * @return
     */
    public static int getScreenHeight(Context context) {
        if (null == context) {
            return 0;
        }
        DisplayMetrics dm = new DisplayMetrics();
        dm = context.getApplicationContext().getResources().getDisplayMetrics();
        return dm.heightPixels;
    }

    /**
     * 动态设置控件的大小
     *
     * @param mContext
     * @param view
     * @param width
     * @param height
     * @param left
     * @param top
     * @param right
     * @param bottom
     */
    public static void LiearLayoutViewSize(Context mContext, View view, int width, int height, int left, int top, int right, int bottom) {
        LinearLayout.LayoutParams Beslp = new LinearLayout.LayoutParams(width, height);
        Beslp.setMargins(dip2px(mContext, left), dip2px(mContext, top), dip2px(mContext, right), dip2px(mContext, bottom));
        view.setLayoutParams(Beslp);
    }


    public static  int dip2px(Context context, float dpValue)
    {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    public static  int px2dip(Context context, float pxValue)
    {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }


}
