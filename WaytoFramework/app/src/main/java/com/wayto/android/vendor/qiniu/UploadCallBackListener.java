package com.wayto.android.vendor.qiniu;

import java.util.List;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:42
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */
public interface UploadCallBackListener {
    void onUploadStart();

    void onUploadEnd();

    void onProgess(double percent);

    void onUploadComplete(List<String> path);

    void onUploadFailure();
}
