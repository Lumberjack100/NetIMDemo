package com.mandala.netimdemo.activity;

import android.os.Bundle;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.mandala.netimdemo.R;
import com.mandala.netimdemo.utils.ToastUtil;
import com.mandala.netimdemo.widge.ClearableEditTextWithIcon;

public class LoginActivity extends BaseCompatActivity
{
    private static final String TAG = "LoginActivity";

    @BindView(R.id.et_login_account)
    ClearableEditTextWithIcon et_login_account;

    @BindView(R.id.et_login_pwd)
    ClearableEditTextWithIcon et_login_pwd;

    private String userName = null;

    private String password = null;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);

    }


    @OnClick({ R.id.btn_login})
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btn_login:

                processLogin();
                break;
        }
    }


    private void processLogin()
    {
        userName = et_login_account.getText().toString().trim();
        password = et_login_pwd.getText().toString().trim();

        if (userName.equals(""))
        {
            ToastUtil.showLongToast(getString(R.string.username_empty_tip));
            return;
        }

        if (password.equals(""))
        {
            ToastUtil.showLongToast(getString(R.string.pwd_empty_tip));
            return;
        }



        showProgressDialog("登录中", null, null);
//        LoginManager.getInstance().login(userName, password, mOrgName, this);
    }
}
