package com.wayto.android.vendor.baiduTrack;


import com.baidu.trace.TraceLocation;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:44
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */
public interface BaiduTrackLocationListener {

    void onReceiveLocation(TraceLocation traceLocation);
}
