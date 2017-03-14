package com.wayto.android.function.refreshLocationFuncation;

import com.wayto.android.function.refreshLocationFuncation.data.UploadLocationEntity;
import com.wayto.android.function.refreshLocationFuncation.data.source.UploadLocationRemoteRepo;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:27
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class UploadLocationPresenter implements UploadLocationContract.Presenter {
    private static UploadLocationPresenter presenter;
    private UploadLocationRemoteRepo remoteRepo;

    public static UploadLocationPresenter getInstance() {
        if (presenter == null) {
            presenter = new UploadLocationPresenter();
        }
        return presenter;
    }

    public UploadLocationPresenter() {
        remoteRepo = UploadLocationRemoteRepo.newInstance();
    }

    @Override
    public void refreshLocation(UploadLocationEntity entity) {
        remoteRepo.refreshLocation(entity);
    }
}
