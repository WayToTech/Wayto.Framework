package com.wayto.android.function.mapFuncation;

import com.wayto.android.function.mapFuncation.data.RegeoEntity;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:32
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public interface RegeoContract {

    interface View {
        void onRegeoStart();

        void onRegeoEnd();

        void onRegeoSuccess(RegeoEntity entity);

        void onRegeoFailure(String error);

        double getLng();

        double getLat();
    }

    interface Presenter {
        void regeoLocation();
    }
}
