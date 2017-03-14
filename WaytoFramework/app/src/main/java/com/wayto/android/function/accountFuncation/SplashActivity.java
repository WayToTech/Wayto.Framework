package com.wayto.android.function.accountFuncation;

import android.os.Bundle;
import android.os.Message;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.wayto.android.R;
import com.wayto.android.common.Constant;
import com.wayto.android.common.handler.HandlerValue;
import com.wayto.android.function.accountFuncation.data.UserInfoEntity;
import com.wayto.android.function.accountFuncation.data.soure.AccountRemoteRepo;
import com.wayto.android.base.BaseActivity;
import com.wayto.android.function.mainFuncations.MainActivity;
import com.wayto.android.utils.ISkipActivityUtil;
import com.wayto.android.utils.ISpfUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 启动界面
 * <p>
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:40
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */
public class SplashActivity extends BaseActivity implements AccountContract.LoginView {

    @BindView(R.id.splash_iv)
    ImageView splashIv;

    private AccountPresenter loginPresenter;

    @Override
    protected void dispatchMessage(Message msg) {
        super.dispatchMessage(msg);
        switch (msg.what) {
            case HandlerValue.START_PAGE_DELAYED:
                ISkipActivityUtil.startIntent(this, LoginActivity.class);
                break;
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_splash);
        setToolbarVisibility(View.GONE);
        setSwipeEnabled(false);
        ButterKnife.bind(this);
        Glide.with(this).load(R.mipmap.default_welcom).into(splashIv);
        /*重新登录获取新Token*/
        if (!TextUtils.isEmpty(ISpfUtil.getValue(Constant.ACCOUNT_KEY, "").toString()) && !TextUtils.isEmpty(ISpfUtil.getValue(Constant.PSSWORD_KEY, "").toString())) {
            loginPresenter = new AccountPresenter(AccountRemoteRepo.newInstance(), this);
            loginPresenter.login();
        } else {
            mHandler.sendEmptyMessageDelayed(HandlerValue.START_PAGE_DELAYED, Constant.THREE_SECONDES);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        super.finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (loginPresenter!=null){
            loginPresenter.cancelRequest();
        }
    }

    @Override
    public void showDialog() {

    }

    @Override
    public String getPassword() {
        return ISpfUtil.getValue(Constant.PSSWORD_KEY, "").toString();
    }

    @Override
    public String getAccount() {
        return ISpfUtil.getValue(Constant.ACCOUNT_KEY, "").toString();
    }

    @Override
    public void loginFailure(String error) {
        ISkipActivityUtil.startIntent(this,LoginActivity.class);
        finish();
    }

    @Override
    public void loginSuccess(UserInfoEntity entity) {
        ISkipActivityUtil.startIntent(this,MainActivity.class);
        finish();
    }

    @Override
    public void dismissDialog() {

    }
}
