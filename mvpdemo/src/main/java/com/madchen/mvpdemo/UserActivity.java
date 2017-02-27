package com.madchen.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.madchen.mvpdemo.presenter.ILoginPresenter;
import com.madchen.mvpdemo.presenter.LoginPresenterCompl;
import com.madchen.mvpdemo.view.ILoginView;

public class UserActivity extends AppCompatActivity implements View.OnClickListener, ILoginView {

    private EditText mNameEditText;
    private EditText mPassWdEditText;
    private Button mLoginBtn, mClearBtn;
    private ILoginPresenter mLoginPresenter;
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameEditText = (EditText) findViewById(R.id.name);
        mPassWdEditText = (EditText) findViewById(R.id.pass_word);
        mLoginBtn = (Button) findViewById(R.id.btn_login);
        mClearBtn = (Button) findViewById(R.id.btn_clear);
        mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);
        mLoginBtn.setOnClickListener(this);
        mClearBtn.setOnClickListener(this);
        mLoginPresenter = new LoginPresenterCompl(this);
        mLoginPresenter.setProgressBarVisibility(View.INVISIBLE);
    }

    @Override
    public void clearText() {
        mNameEditText.setText("");
        mPassWdEditText.setText("");
    }

    @Override
    public void onLoginResult(boolean result, int code) {
        mLoginPresenter.setProgressBarVisibility(View.INVISIBLE);
        mLoginBtn.setEnabled(true);
        mClearBtn.setEnabled(true);
        if (result) {
            Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Login Fail, code = " + code, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onSetProgressBarVisibility(int visibility) {
        mProgressBar.setVisibility(visibility);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_login:
                mLoginPresenter.setProgressBarVisibility(View.VISIBLE);
                mLoginBtn.setClickable(false);
                mClearBtn.setClickable(false);
                mLoginPresenter.doLogin(mNameEditText.getText().toString(), mPassWdEditText.getText().toString());
                break;
            case R.id.btn_clear:
                mLoginPresenter.clear();
                break;
        }
    }
}
