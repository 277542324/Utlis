package com.xiaoxiao.utilis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ImageView;

import com.xiao.utils.UtilsImg;
import com.xiao.utils.UtilsTools;

/**
 * @author Administrator
 */
public class MainActivity extends AppCompatActivity{
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.img);
//         UtilsImg.glideImg(this,R.mipmap.bg,R.mipmap.ic_launcher,img,30);
        UtilsTools.successRemindBox(this,"我是测试","","");
    }

}
