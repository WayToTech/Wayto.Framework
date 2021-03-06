package com.wayto.android.function.pictureFuncation;

import com.wayto.android.function.pictureFuncation.data.PictureEntity;

import java.util.List;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:31
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */
public interface PictureContract {

    interface View {
        void onQueryAlbumStart();

        void queryAlbumSuccess(List<PictureEntity> lists);

        void queryAlbumFailure();

        void onQueryAlbumEnd();
    }

    interface Presenter {
        void queryAlbum();
    }
}
