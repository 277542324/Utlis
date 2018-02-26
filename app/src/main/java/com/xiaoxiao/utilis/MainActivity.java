package com.xiaoxiao.utilis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xiao.utils.UtilsTools;

/**
 * @author Administrator
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UtilsTools.successRemindBox(this,"我是测试","","");
    }
}
