package com.example.scorelibrary.utils;

import android.util.Log;

import com.example.scorelibrary.BuildConfig;

/**
 * Created by liuzhenhui on 16/8/16.
 */

public class MLog {
    private final static String TAG = "lzh";
    private boolean DEBUG = BuildConfig.DEBUG;

    public static void d(String subTag, String msg) {
        Log.d(TAG, subTag + "-->" + msg);
    }

    public static void d(String msg) {
        Log.d(TAG, msg);
    }
}
