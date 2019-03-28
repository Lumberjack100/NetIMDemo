package com.mandala.netimdemo.utils;

import android.widget.Toast;
import com.mandala.netimdemo.activity.MyApplication;

/**
 * Created by GH on 2016/8/9.
 */
public class ToastUtil
{
    public static boolean isShow = true;

    private static Toast toast;


    /**
     * 长时间显示Toast
     * @param content  显示内容
     */
    public static void showLongToast(String content)
    {
        if (toast == null)
        {
            toast = Toast.makeText(MyApplication.newInstance(), content, Toast.LENGTH_LONG);
        } else
        {
            toast.setText(content);
        }

        toast.show();
    }


    /**
     * 短时间显示Toast
     * @param content  显示内容
     */
    public static void showShortToast(String content)
    {
        if (toast == null)
        {
            toast = Toast.makeText(MyApplication.newInstance(), content, Toast.LENGTH_SHORT);
        } else
        {
            toast.setText(content);
        }

        toast.show();
    }


    public static void showToast(String content, int duration)
    {
        if (toast == null)
        {
            toast = Toast.makeText(MyApplication.newInstance(), content, duration);
        } else
        {
            toast.setText(content);
        }

        toast.show();
    }


}
