package com.wayto.android.function.uploadFileFuncation;

import java.io.File;

/**
 * 文件上传协议接口
 * <p>
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:26
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public interface UploadFileContract {

    interface View {
        void onUploadFileStart();

        void onUploadFileEnd();

        void onUploadSuccess(String url);

        void onUploadFialure(int code, String msg);
    }

    interface Presenter {
        void uploadFileAction(File file);
    }
}
