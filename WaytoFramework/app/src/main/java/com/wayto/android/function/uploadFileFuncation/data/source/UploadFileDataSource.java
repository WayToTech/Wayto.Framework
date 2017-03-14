package com.wayto.android.function.uploadFileFuncation.data.source;

import java.io.File;

/**
 * 文件上传请求回调接口
 * <p>
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:27
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public interface UploadFileDataSource {

    interface UploadFileCallBack {
        void getUploadFileSuccess(String url);

        void getUploadFileFialure(int code, String msg);
    }

    void uploadFile(File file, UploadFileCallBack callBack);
}
