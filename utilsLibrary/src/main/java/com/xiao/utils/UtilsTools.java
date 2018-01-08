package com.xiao.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.flyco.dialog.listener.OnBtnClickL;
import com.flyco.dialog.widget.NormalDialog;


/**
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
    public static void liearlayoutviewsize(Context mContext, View view, int width, int height, int left, int top, int right, int bottom) {
        LinearLayout.LayoutParams Beslp = new LinearLayout.LayoutParams(width, height);
        Beslp.setMargins(dip2px(mContext, left), dip2px(mContext, top), dip2px(mContext, right), dip2px(mContext, bottom));
        view.setLayoutParams(Beslp);
    }


    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }


    /**
     * 动态设置控件的大小
     *
     * @param mContext
     * @param view
     * @param width
     * @param height
     */
    public static void relativepositionsize(Context mContext, View view, int width, int height) {
        RelativeLayout.LayoutParams beslp = new RelativeLayout.LayoutParams(width, height);
        view.setLayoutParams(beslp);
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
    public static void relativepositionsize(Context mContext, View view, int width, int height, int left, int top, int right, int bottom) {
        RelativeLayout.LayoutParams beslp = new RelativeLayout.LayoutParams(width, height);
        beslp.setMargins(dip2px(mContext, left), dip2px(mContext, top), dip2px(mContext, right), dip2px(mContext, bottom));
        view.setLayoutParams(beslp);
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
     * @param addRule  (RelativeLayout.CENTER_IN_PARENT、
     *                 RelativeLayout.ALIGN_PARENT_RIGHT、
     *                 RelativeLayout.ALIGN_PARENT_BOTTOM、
     *                 RelativeLayout.ALIGN_PARENT_LEFT、
     *                 RelativeLayout.ABOVE、
     *                 RelativeLayout.BELOW)
     */
    public static void relativepositionsize(Context mContext, View view, int width, int height, int left, int top, int right, int bottom, int RuleStatus,int addRule, int Rid) {
        /**status1 不要求输入根据ID进行位置定位*/
        int status1 = -1;
        /**status2 输入根据ID进行位置定位*/
        int status2 = -2;
        RelativeLayout.LayoutParams beslp = new RelativeLayout.LayoutParams(width, height);
        beslp.setMargins(dip2px(mContext, left), dip2px(mContext, top), dip2px(mContext, right), dip2px(mContext, bottom));
        if (RuleStatus == status1) {
            beslp.addRule(addRule);
        } else if (RuleStatus == status2) {
            beslp.addRule(addRule, Rid);
        }
        view.setLayoutParams(beslp);
    }

    /**
     * 动态设置控件的大小
     *
     * @param mContext
     * @param view
     * @param width
     * @param height
     */
    public static void frameLayoutViewsize(Context mContext, View view, int width, int height) {
        FrameLayout.LayoutParams Beslp = new FrameLayout.LayoutParams(width, height);
        view.setLayoutParams(Beslp);
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
    public static void frameLayoutViewsize(Context mContext, View view, int width, int height, int left, int top, int right, int bottom) {
        FrameLayout.LayoutParams Beslp = new FrameLayout.LayoutParams(width, height);
        Beslp.setMargins(dip2px(mContext, left), dip2px(mContext, top), dip2px(mContext, right), dip2px(mContext, bottom));
        view.setLayoutParams(Beslp);
    }


    /**
     * 动态设置控件的大小
     *
     * @param mContext
     * @param view
     * @param width
     * @param height
     */
    public static void linearLayoutViewSize(Context mContext, View view, int width, int height) {
        LinearLayout.LayoutParams Beslp = new LinearLayout.LayoutParams(width, height);
        view.setLayoutParams(Beslp);
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
    public static void linearLayoutViewSize(Context mContext, View view, int width, int height, int left, int top, int right, int bottom) {
        LinearLayout.LayoutParams Beslp = new LinearLayout.LayoutParams(width, height);
        Beslp.setMargins(dip2px(mContext, left), dip2px(mContext, top), dip2px(mContext, right), dip2px(mContext, bottom));
        view.setLayoutParams(Beslp);
    }

    //光标移动到最后
    public static void edittextviewselection(EditText view, int length) {
        view.setSelection(length);
    }


    /**
     * 拨打电话统一操作管理
     */
    public static void callPhone(final Context mContext, final String phone, final String titleMsg, final String msg, float titleSize, float contentSize) {
        final NormalDialog dialog = new NormalDialog(mContext);
        dialog.content(msg + "：" + phone).style(NormalDialog.STYLE_TWO)////
                .titleTextSize(titleSize).contentTextSize(contentSize).title(titleMsg)
                .show();
        dialog.setOnBtnClickL(
                new OnBtnClickL() {
                    @Override
                    public void onBtnClick() {
                        dialog.dismiss();
                    }
                },
                new OnBtnClickL() {
                    @Override
                    public void onBtnClick() {
                        Intent phoneIntent = new Intent("android.intent.action.CALL", Uri.parse("tel:" + phone));
                        mContext.startActivity(phoneIntent);
                        dialog.dismiss();
                    }
                });
    }

    public static int setColor(Context mContext, int resColor) {
        return ContextCompat.getColor(mContext, resColor);
    }
}
