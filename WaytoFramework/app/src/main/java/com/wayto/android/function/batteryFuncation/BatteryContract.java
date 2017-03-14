package com.wayto.android.function.batteryFuncation;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:40
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public interface BatteryContract {

    interface Presenter {
        void uploadBatteryAction(int level, int scale);
    }
}
