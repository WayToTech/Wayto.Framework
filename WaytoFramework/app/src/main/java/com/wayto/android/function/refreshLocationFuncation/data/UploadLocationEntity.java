package com.wayto.android.function.refreshLocationFuncation.data;

import java.io.Serializable;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:27
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class UploadLocationEntity implements Serializable {
    private double Lng;
    private double Lat;
    private double Altitude;
    private double Bearing;
    private double Speed;
    private String Provider;
    private String CreateTime;

    public double getLng() {
        return Lng;
    }

    public void setLng(double lng) {
        Lng = lng;
    }

    public double getLat() {
        return Lat;
    }

    public void setLat(double lat) {
        Lat = lat;
    }

    public double getAltitude() {
        return Altitude;
    }

    public void setAltitude(double altitude) {
        Altitude = altitude;
    }

    public double getBearing() {
        return Bearing;
    }

    public void setBearing(double bearing) {
        Bearing = bearing;
    }

    public double getSpeed() {
        return Speed;
    }

    public void setSpeed(double speed) {
        Speed = speed;
    }

    public String getProvider() {
        return Provider;
    }

    public void setProvider(String provider) {
        Provider = provider;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }
}
