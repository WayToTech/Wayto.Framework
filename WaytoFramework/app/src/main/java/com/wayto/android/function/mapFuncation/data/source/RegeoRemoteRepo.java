package com.wayto.android.function.mapFuncation.data.source;

import com.wayto.android.BuildConfig;
import com.wayto.android.function.mapFuncation.data.RegeoEntity;
import com.wayto.android.vendor.retrofit.RetrofitManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:33
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class RegeoRemoteRepo implements RegeoDataSource {

    private Call<RegeoEntity> call;

    private static RegeoRemoteRepo repo;

    public static RegeoRemoteRepo newInstance() {
        if (repo == null) {
            repo = new RegeoRemoteRepo();
        }
        return repo;
    }

    @Override
    public void startRegeo(final RegeoCallBack callBack) {
        String url = "v3/geocode/regeo?output=json&location=" + callBack.getLng() + "," + callBack.getLat() + "&key=" + BuildConfig.REGEO_MAP_KEY;
        call = RetrofitManager.getInstance().getGeocodinService().geocodinLocation(url);
        call.enqueue(new Callback<RegeoEntity>() {
            @Override
            public void onResponse(Call<RegeoEntity> call, Response<RegeoEntity> response) {
                if (response.isSuccessful()) {
                    callBack.getRegeoSuccess(response.body());
                } else {
                    callBack.getRegeoFailure("查询失败");
                }
            }

            @Override
            public void onFailure(Call<RegeoEntity> call, Throwable t) {
                callBack.getRegeoFailure("查询失败");
            }
        });
    }
}
