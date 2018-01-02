package com.xiao.utils;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import com.flyco.dialog.widget.base.BaseDialog;
import com.flyco.dialog.widget.base.BottomBaseDialog;


/**
 * @author Administrator
 * @date 2017/12/15
 */

public class UtilsDialog {

    public static class OrderDishesDialog extends BaseDialog {

        LinearLayout orderDishesLinearLayout;

        public OrderDishesDialog(Context Context) {
            super(Context);
            widthScale(1f);
            heightScale(1f);
            mContext = Context;
        }

        @Override
        public View onCreateView() {
            View inflate = View.inflate(mContext, R.layout.order_dishes_dialog_layout, null);
            orderDishesLinearLayout = ViewFindUtils.find(inflate,R.id.orderDishesLinearLayout);
            return inflate;
        }

        @Override
        public void setUiBeforShow() {

            UtilsTools.LiearLayoutViewSize(mContext,orderDishesLinearLayout, UtilsTools.getScreenWidth(mContext), UtilsTools.getScreenHeight(mContext),0,0,0,0);

        }
    }

    public static class MenuClassEditDialogManage extends BottomBaseDialog {

        public MenuClassEditDialogManage(Context Context) {
            super(Context);
            mContext = Context;
        }

        @Override
        public View onCreateView() {
            View inflate = View.inflate(mContext, R.layout.menu_classedit_dialog, null);
            return inflate;
        }

        @Override
        public void setUiBeforShow() {

        }
    }


}
