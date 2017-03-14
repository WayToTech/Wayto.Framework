package com.wayto.map.google;

/**
 * google地图图层类型
 * <p>
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:48
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */
public interface GoogleMapLayerTypes {
    /**
     * 谷歌矢量地图服务 ======市政图
     */
    static final int VECTOR_GOOGLE_MAP = 1;
    /**
     * 谷歌影像地图服务 ====== 卫星图
     */
    static final int IMAGE_GOOGLE_MAP = 2;
    /**
     * 谷歌地形地图服务=======地形图
     */
    static final int TERRAIN_GOOGLE_MAP = 3;
    /**
     * 谷歌道路等POI地图服务 ====纯道路图
     */
    static final int ANNOTATION_GOOGLE_MAP = 4;
}
