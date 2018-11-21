package com.xiao.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;


/**
 * @author xiaoxiao
 * @date 2017/4/14
 */
public class UtilsImg {
    static Drawable d1;
    static Drawable d2;

    /**
     * @param mContext 当前Activity
     * @param imgUrl   图片Url
     * @param view     ImageView控件
     */
    public static void glideImg(final Context mContext, final Object imgUrl, final ImageView view) {
        RequestOptions options = new RequestOptions()
                .centerCrop();
        Glide.with(mContext)
                .load(imgUrl).apply(options)
                .into(view);
    }

    /**
     * @param mContext   当前Activity
     * @param imgUrl     图片Url
     * @param resourceId 图片未加载显示的默认图
     * @param view       ImageView控件
     */
    public static void glideImg(final Context mContext, final Object imgUrl, int resourceId, final ImageView view) {
        RequestOptions options = new RequestOptions()
                .placeholder(resourceId)
                .centerCrop();

        Glide.with(mContext)
                .load(imgUrl).apply(options)
                .into(view);
    }

    /**
     * @param mContext   当前Activity
     * @param imgUrl     图片Url
     * @param resourceId 图片未加载显示的默认图
     * @param view       ImageView控件
     */
    public static void glideImg(final Context mContext, final Object imgUrl, int resourceId, int animationId, final ImageView view) {
        RequestOptions options = new RequestOptions()
                .placeholder(resourceId)
                .centerCrop();

        Glide.with(mContext)
                .load(imgUrl)
                .apply(options)
                .transition(withCrossFade(animationId))
                .into(view);
    }

    /**
     * @param mContext   当前Activity
     * @param imgUrl     图片Url
     * @param resourceId 图片未加载显示的默认图
     * @param view       ImageView控件
     */
    public static void glideImg(final Context mContext, final Object imgUrl, int resourceId, final ImageView view, int RoundNum) {
        RoundedCorners roundedCorners = new RoundedCorners(RoundNum);
        RequestOptions options = new RequestOptions().bitmapTransform(roundedCorners).override(300, 300);

        Glide.with(mContext).load(imgUrl).apply(options).into(view);
    }

    /**
     * @param mContext    当前Activity
     * @param imgUrl      图片Url
     * @param resourceId  图片未加载显示的默认图
     * @param animationId 图片显示时候的动画
     * @param view        ImageView控件
     */
    public static void glideImg(final Context mContext, final Object imgUrl, int resourceId, int animationId, final ImageView view, int RoundNum) {
        RoundedCorners roundedCorners = new RoundedCorners(RoundNum);
        RequestOptions options = new RequestOptions().bitmapTransform(roundedCorners)
                .placeholder(resourceId).centerCrop()
                .centerCrop();

        Glide.with(mContext)
                .load(imgUrl).apply(options).transition(withCrossFade(animationId))
                .into(view);
    }

    /**
     * @param mContext 当前Activity
     * @param imgUrl   图片Url
     * @param view     ImageView控件
     */
    public static void glideGifImg(final Context mContext, final String imgUrl, final ImageView view) {
//        Glide.with(mContext).load(imgUrl).asGif().diskCacheStrategy(DiskCacheStrategy.SOURCE).into(view);
    }

    /**
     * @param mContext   当前Activity
     * @param resourceId 图片未加载显示的默认图
     * @param view       ImageView控件

    public static void glideLocationgImg(final Context mContext, final int resourceId, final ImageView view) {
    Glide.with(mContext)
    .load(resourceId).crossFade()
    .centerCrop().bitmapTransform(new RoundCornersTransformation(mContext, dip2px(mContext, 0), RoundCornersTransformation.CornerType.ALL))
    .into(view);
    }*/

    /**
     * @param mContext 当前Activity
     * @param imgUrl   图片Url
     * @param view     ImageView控件
     */
    public static void glideCircleImg(Context mContext, Object imgUrl, ImageView view) {
        RequestOptions options = new RequestOptions().circleCrop();
        Glide.with(mContext)
                .load(imgUrl).transition(new DrawableTransitionOptions().crossFade())
                .apply(options)
                .into(view);
    }

    /**
     * @param mContext   当前Activity
     * @param imgUrl     图片Url
     * @param resourceId 图片未加载显示的默认图
     * @param view       ImageView控件
     */
    @SuppressLint("CheckResult")
    public static void glideCircleImg(Context mContext, Object imgUrl, int resourceId, ImageView view) {
        RequestOptions options = new RequestOptions().circleCrop().placeholder(resourceId);

        Glide.with(mContext)
                .load(imgUrl).apply(options).transition(new DrawableTransitionOptions().crossFade())
                .into(view);
    }

    /**
     * @param mContext       当前Activity
     * @param beginUrl       原图片Url
     * @param endUrl         需要动画过度后图片的Url
     * @param transitionTime 图片显示时候的动画时间
     * @param view           ImageView控件
     */
    public static void alphaAnima(final Context mContext, final Object beginUrl, final Object endUrl, final int transitionTime, final ImageView view) {
        Glide.with(mContext).asBitmap().load(beginUrl).into(new SimpleTarget<Bitmap>() {
            @Override
            public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                d1 = BitmapToDrawable(mContext, resource);
                Glide.with(mContext).asBitmap().load(endUrl).into(new SimpleTarget<Bitmap>() {

                    @Override
                    public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                        d2 = BitmapToDrawable(mContext, resource);
                        Drawable[] drawableArray = {
                                d1, d2
                        };
                        TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArray);
                        view.setImageDrawable(transitionDrawable);
                        transitionDrawable.startTransition(transitionTime);
                    }
                });
            }

        });
    }


    public static Drawable BitmapToDrawable(Context mContext, Bitmap bmp) {
        Drawable drawable = new BitmapDrawable(mContext.getResources(), bmp);
        return drawable;
    }

    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
