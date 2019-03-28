package com.mandala.netimdemo.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

public class LoginManager
{
    public static final int LOGIN_CODE_SUCCESS = 0;

    public static final int LOGIN_CODE_FAIL = -1;

    public static final int IM_LOGIN_CODE_SUCCESS = 0;

    public static final int IM_LOGIN_CODE_FAIL = -1;

    private static final String TAG = LoginManager.class.getSimpleName();

    private static LoginManager instance = new LoginManager();

    private Handler handler = null;

    private LoginCallback loginCallback = null;

    private String loginName = null;

    private String md5password = null;

    private String orgName = null;

    private String imAccount = null;

    private String imPassword = null;

    private Runnable runnable = null;

    private BroadcastReceiver networkChangeReceiver = new BroadcastReceiver()
    {
        @Override
        public void onReceive(Context context, Intent intent)
        {
            if (NetworkUtil.isNetworkConnected(context))
            {
                context.unregisterReceiver(this);
//                if (UserSession.getInstance().isLogin())
//                {
//                    autoLoginIM(imAccount, imPassword);
//                }
//                else
//                {
//                    makeAutoLogin(loginName, md5password, orgName);
//                }
            }
        }
    };

    public static LoginManager getInstance()
    {
        return instance;
    }

    private LoginManager()
    {

    }


    private void makeLogin(final String name, String password, String orgName)
    {

    }

    private void loginIM(final String account, final String token)
    {
//        Log.i("test-wangyiIM", "ImId=" + account + "; Toke=" + token);
//
//        if (!NetworkUtil.isNetworkConnected(MyApplication.newInstance()))
//        {
//            if (loginCallback != null)
//            {
//                loginCallback.callback(LOGIN_CODE_FAIL, "网络不可以用，请检查网络");
//            }
//
//            return;
//        }
//
//        // 登录
//        AbortableFuture<LoginInfo> loginRequest = NIMClient.getService(AuthService.class).login(new LoginInfo(account, token));
//        loginRequest.setCallback(new RequestCallback<LoginInfo>()
//        {
//            @Override
//            public void onSuccess(LoginInfo param)
//            {
//                LogUtil.i(TAG, "login success");
//
//                DemoCache.setAccount(account);
//
//                saveLoginInfo(account, token);
//
//                // 初始化消息提醒
//                NIMClient.toggleNotification(UserPreferences.getNotificationToggle());
//
//                // 初始化免打扰
//                if (UserPreferences.getStatusConfig() == null)
//                {
//                    UserPreferences.setStatusConfig(DemoCache.getNotificationConfig());
//                }
//                NIMClient.updateStatusBarNotificationConfig(UserPreferences.getStatusConfig());
//
//                // 构建缓存
//                DataCacheManager.buildDataCacheAsync();
//
//                MyNotificationManager.getInstance().init(MyApplication.newInstance(), account);
//
//                if (loginCallback != null)
//                {
//                    loginCallback.callback(LOGIN_CODE_SUCCESS, "登录成功");
//                }
//            }
//
//            @Override
//            public void onFailed(int code)
//            {
//                UserSession.getInstance().setToken(null);
//                if (code == 302 || code == 404)
//                {
//                    if (loginCallback != null)
//                    {
//                        loginCallback.callback(LOGIN_CODE_FAIL, "服务端内部错误。");
//                    }
//                }
//                else
//                {
//                    if (loginCallback != null)
//                    {
//                        loginCallback.callback(LOGIN_CODE_FAIL, "IM服务端登录失败");
//                    }
//                }
//            }
//
//            @Override
//            public void onException(Throwable exception)
//            {
//                UserSession.getInstance().setToken(null);
//                if (loginCallback != null)
//                {
//                    loginCallback.callback(LOGIN_CODE_FAIL, "IM服务端异常");
//                }
//            }
//        });
    }

    public  interface LoginCallback
    {
        public void callback(int code, Object data);
    }
}
