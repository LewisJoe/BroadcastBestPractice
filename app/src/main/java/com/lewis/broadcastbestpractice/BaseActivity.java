package com.lewis.broadcastbestpractice;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

/**
 * 所有活动的父类
 * Created by Administrator on 15-8-24.
 */
public class BaseActivity extends ActionBarActivity {
    private final static String TAG = "BaseActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //显示出当前是那个活动
        Log.d(TAG,"Start "+getClass().getSimpleName());
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Destroy "+getClass().getSimpleName());
        ActivityCollector.removeActivity(this);
    }
}
