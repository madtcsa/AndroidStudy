package com.madchen.mvpdemo.presenter;

/**
 * Created by chenwei on 2017/2/12.
 */

public interface ILoginPresenter {

    void clear();
    void doLogin(String name,String passwd);
    void setProgressBarVisibility(int visibility);
}
