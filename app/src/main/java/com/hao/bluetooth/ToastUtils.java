package com.hao.bluetooth;

import android.content.Context;
import android.widget.Toast;

/**
* @作者 hao
* @创建日期 2018/4/1 12:32
* Description: toast工具
*/
public class ToastUtils {
    public static void s(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public static void l(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }
}
