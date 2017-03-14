package com.wayto.android.function.batteryFuncation.data.soure;

import com.wayto.android.base.BaseDataSourse;
import com.wayto.android.function.batteryFuncation.data.BatteryEntity;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:40
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */
public interface BatteryDataSouce extends BaseDataSourse {

    void uploadBattery(BatteryEntity body);
}
