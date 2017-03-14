package com.wayto.android.function.refreshLocationFuncation.data.source;

import com.wayto.android.entity.ResponseModel;
import com.wayto.android.function.refreshLocationFuncation.data.UploadLocationEntity;
import com.wayto.android.utils.ILog;
import com.wayto.android.vendor.retrofit.RetrofitManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:28
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class UploadLocationRemoteRepo implements UploadLocationDataSource {
    private final String TAG = getClass().getSimpleName();

    private static UploadLocationRemoteRepo remoteRepo;
    private Call<ResponseModel> call;

    public static UploadLocationRemoteRepo newInstance() {
        if (remoteRepo == null) {
            remoteRepo = new UploadLocationRemoteRepo();
        }
        return remoteRepo;
    }

    @Override
    public void refreshLocation(UploadLocationEntity entity) {
        call = RetrofitManager.getInstance().getService().uploadLocation(entity);
        call.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                ILog.d(TAG, response.code() + "");
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                ILog.e(TAG, t.getMessage());
            }
        });
    }
}
