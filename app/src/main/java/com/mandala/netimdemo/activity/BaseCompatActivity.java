package com.mandala.netimdemo.activity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;

public class BaseCompatActivity extends AppCompatActivity
{
    protected ProgressDialog progressDialog = null;

    protected void showProgressDialog(String message, String buttonText, DialogInterface.OnClickListener listener)
    {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setMessage(message);
        progressDialog.setIndeterminate(false);
        progressDialog.setCancelable(false);
        progressDialog.setButton(buttonText, listener);
        progressDialog.show();
    }

    protected void dismissProgressDialog()
    {
        if (progressDialog != null)
        {
            try{
                progressDialog.dismiss();
                progressDialog = null;
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
