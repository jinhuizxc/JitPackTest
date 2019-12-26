package com.example.jitpacktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.mylibrary.Test;
import com.mobile.mobilehardware.simcard.SimCardHelper;

import org.json.JSONObject;

/**
 * 实现自己的开源库----JitPack使用体验
 * https://www.jianshu.com/p/9218d34fb8fa?utm_campaign=haruki&utm_content=note&utm_medium=reader_share&utm_source=weixin
 *
 * 仪表盘进度条--利用JitPack已发布
 * https://github.com/DrownCoder/DriverProgress
 *
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String tag = Test.Tag;
        Log.e(TAG, "获取tag信息: " + tag);  // E/MainActivity: 获取tag信息: 123

        JSONObject jsonObject = SimCardHelper.mobileSimInfo(getApplicationContext());

    }
}
