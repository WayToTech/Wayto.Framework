package com.wayto.android.function.mapFuncation.data.source;

import com.wayto.android.function.mapFuncation.data.RegeoEntity;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:33
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */
public interface RegeoDataSource {

    interface RegeoCallBack {
        void getRegeoSuccess(RegeoEntity entity);

        void getRegeoFailure(String faliure);

        double getLng();

        double getLat();
    }

    void startRegeo(RegeoCallBack callBack);
}
