package com.wayto.android.function.mapFuncation;

import com.wayto.android.function.mapFuncation.data.RegeoEntity;
import com.wayto.android.function.mapFuncation.data.source.RegeoDataSource;
import com.wayto.android.function.mapFuncation.data.source.RegeoRemoteRepo;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:32
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class RegeoPresenter implements RegeoContract.Presenter, RegeoDataSource.RegeoCallBack {

    private RegeoContract.View mView;
    private RegeoRemoteRepo remoteRepo;

    public RegeoPresenter(RegeoContract.View view) {
        this.mView = view;
        this.remoteRepo = RegeoRemoteRepo.newInstance();
    }

    @Override
    public void regeoLocation() {
        mView.onRegeoStart();
        remoteRepo.startRegeo(this);
    }

    @Override
    public void getRegeoSuccess(RegeoEntity entity) {
        mView.onRegeoSuccess(entity);
        mView.onRegeoEnd();
    }

    @Override
    public void getRegeoFailure(String faliure) {
        mView.onRegeoFailure(faliure);
        mView.onRegeoEnd();
    }

    @Override
    public double getLng() {
        return mView.getLng();
    }

    @Override
    public double getLat() {
        return mView.getLat();
    }
}
