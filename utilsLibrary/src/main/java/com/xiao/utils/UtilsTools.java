package com.xiao.utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.flyco.dialog.listener.OnBtnClickL;
import com.flyco.dialog.widget.NormalDialog;

import org.json.JSONException;
import org.json.JSONObject;


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
    public static void relativepositionsize(Context mContext, View view, int width, int height, int left, int top, int right, int bottom, int RuleStatus, int addRule, int Rid) {
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
        dialog.content(msg + "：" + phone).style(NormalDialog.STYLE_TWO)
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

    /**
     * @param mContext   当前Activity
     * @param textString 当前内容
     * @param tSize      字体大小
     * @param mColor     字体颜色
     * @param startSize  起始位置
     * @param endSize    终止位置
     * @param tv         控件ID
     */
    public static void TextStyle(Context mContext, String textString, int tSize, int mColor, int startSize, int endSize, TextView tv) {
        Spannable span = new SpannableStringBuilder(textString);
        span.setSpan(new AbsoluteSizeSpan(dip2px(mContext, tSize)), startSize, endSize, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span.setSpan(new ForegroundColorSpan(setColor(mContext, mColor)), startSize, endSize, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv.setText(span);
    }

    /**
     * @param mContext 当前Activity
     * @param icon     图片
     * @param width    图片宽度
     * @param height   图片高度
     * @param view     控件ID
     */
    public static void drawableLeftTextSize(Context mContext, int icon, int width, int height, TextView view) {
        Drawable dw = ContextCompat.getDrawable(mContext, icon);
        dw.setBounds(0, 0, dip2px(mContext, width), dip2px(mContext, height));
        view.setCompoundDrawables(dw, null, null, null);
    }

    /**
     * @param mContext 当前Activity
     * @param icon     图片
     * @param width    图片宽度
     * @param height   图片高度
     * @param view     控件ID
     */
    public static void drawableRightTextSize(Context mContext, int icon, int width, int height, TextView view) {
        Drawable dw = ContextCompat.getDrawable(mContext, icon);
        dw.setBounds(0, 0, dip2px(mContext, width), dip2px(mContext, height));
        view.setCompoundDrawables(null, null, dw, null);
    }

    /**
     * @param mContext 当前Activity
     * @param icon     图片
     * @param width    图片宽度
     * @param height   图片高度
     * @param view     控件ID
     */
    public static void drawableLandRTextSize(Context mContext, int icon, int width, int height, TextView view) {
        Drawable dw = ContextCompat.getDrawable(mContext, icon);
        dw.setBounds(0, 0, dip2px(mContext, width), dip2px(mContext, height));
        view.setCompoundDrawables(dw, null, dw, null);
    }

    /**
     * @param obj 数据类型为JSON的数据
     * @param res 对应的键值对
     */
    public static String analysisJSONObject(String obj, String res) {
        String result;
        try {
            JSONObject object = new JSONObject(obj);
            JSONObject r = object.getJSONObject(res);
            result = r.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            result = "解析异常";
        }
        return result;
    }


    public static int viewWidth(final View view) {
        ViewTreeObserver vto = view.getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                view.getWidth();


            }
        });
        return view.getWidth();
    }

    public static int viewHeight(final View view) {
        ViewTreeObserver vto = view.getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                view.getHeight();
            }
        });
        return view.getHeight();
    }
}
