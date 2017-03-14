package com.wayto.android.function.uploadFileFuncation;

import com.wayto.android.function.uploadFileFuncation.data.source.UploadFileDataSource;
import com.wayto.android.function.uploadFileFuncation.data.source.UploadFileRemoteRepo;

import java.io.File;

/**
 * 文件上传Presenter
 * <p>
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:25
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class UploadFilePresenter implements UploadFileDataSource.UploadFileCallBack, UploadFileContract.Presenter {

    private UploadFileContract.View mView;
    private UploadFileRemoteRepo remoteRepo;

    public UploadFilePresenter(UploadFileContract.View view) {
        this.mView = view;
        this.remoteRepo = UploadFileRemoteRepo.newInstance();
    }

    @Override
    public void uploadFileAction(File file) {
        mView.onUploadFileStart();
        remoteRepo.uploadFile(file, this);
    }


    @Override
    public void getUploadFileSuccess(String url) {
        mView.onUploadSuccess(url);
        mView.onUploadFileEnd();
    }

    @Override
    public void getUploadFileFialure(int code, String msg) {
        mView.onUploadFialure(code, msg);
        mView.onUploadFileEnd();
    }
}
