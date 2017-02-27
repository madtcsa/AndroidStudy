package com.madchen.mvpdemo.presenter;

import android.os.Handler;
import android.os.Looper;

import com.madchen.mvpdemo.model.IUser;
import com.madchen.mvpdemo.model.UserModel;
import com.madchen.mvpdemo.view.ILoginView;

/**
 * Created by chenwei on 2017/2/12.
 */

public class LoginPresenterCompl implements ILoginPresenter {

    private ILoginView mLoginView;
    private IUser mUser;
    private Handler mHandler;

    public LoginPresenterCompl(ILoginView loginView) {
        mLoginView = loginView;
        initUser();
        mHandler = new Handler(Looper.getMainLooper());
    }

    private void initUser() {
        mUser = new UserModel("mvp", "mvp");
    }

    @Override
    public void clear() {
        mLoginView.clearText();
    }

    @Override
    public void doLogin(String name, String passwd) {
        final int code = mUser.checkUserValidity(name, passwd);
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mLoginView.onLoginResult(code != 0, code);
            }
        }, 3000);
    }

    @Override
    public void setProgressBarVisibility(int visibility) {
        mLoginView.onSetProgressBarVisibility(visibility);
    }
}
