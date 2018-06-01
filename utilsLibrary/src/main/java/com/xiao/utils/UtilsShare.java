package com.xiao.utils;

import android.content.Context;
import android.graphics.Bitmap;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

/**
 * Created by Administrator on 2018/5/31.
 */

public class UtilsShare {

    public static String buildTransaction(final String type) {
        return (type == null) ? String.valueOf(System.currentTimeMillis()) : type + System.currentTimeMillis();

    }

    //微信分享和朋友圈分享
    public static void getWxShare(final Context mContext, final String wxAPP_ID, final String mImgUrl, final String mLink, final String mTtile, final String mDescription, final String mShareType) {
        Glide.with(mContext).load(mImgUrl).asBitmap()
                .into(new SimpleTarget<Bitmap>() {
                    @Override
                    public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
                        IWXAPI api = WXAPIFactory.createWXAPI(mContext, wxAPP_ID, false);
                        WXWebpageObject webpage = new WXWebpageObject();
                        webpage.webpageUrl = mLink;
                        WXMediaMessage msg = new WXMediaMessage(webpage);
                        msg.title = mTtile;
                        msg.description = mDescription;
                        Bitmap bmp = resource;
                        Bitmap thumbBmp = Bitmap.createScaledBitmap(bmp, 100, 100, true);
                        // bmp.recycle();
                        msg.thumbData = UtilsTools.bmpToByteArray(thumbBmp, true);

                        SendMessageToWX.Req req = new SendMessageToWX.Req();
                        req.transaction = buildTransaction("webpage");
                        req.message = msg;
                        if ("friends".equals(mShareType)) {
                            req.scene = SendMessageToWX.Req.WXSceneTimeline;
                        } else if ("wechat".equals(mShareType)) {
                            req.scene = SendMessageToWX.Req.WXSceneSession;
                        }else{
                            req.scene = SendMessageToWX.Req.WXSceneSession;
                        }
                        api.sendReq(req);
                    }
                });
    }
}
