package com.madchen.mvpdemo.view;

/**
 * Created by chenwei on 2017/2/12.
 */

public interface ILoginView {

    void clearText();

    void onLoginResult(boolean result, int code);

    void onSetProgressBarVisibility(int visibility);
}
