package com.wayto.android.function.refreshLocationFuncation.data.source;

import com.wayto.android.function.refreshLocationFuncation.data.UploadLocationEntity;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:27
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public interface UploadLocationDataSource {

    void refreshLocation(UploadLocationEntity entity);
}
