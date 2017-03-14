package com.wayto.android.vendor.baiduTrack;

/**
 * 历史记录查询回调接口
 * <p>
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:44
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */
public interface BaiduTrackListener {

    void onQueryHistoryTrackSuccess(HistoryTrackData entity);

    void onQueryHistoryTrackFailure(String str);

    void onQueryDistanceCallback(String str);

}
