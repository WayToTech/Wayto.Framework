package com.wayto.android.function.batteryFuncation.data;

import java.io.Serializable;

/**
 * 电量上传实体类
 * <p>
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:40
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class BatteryEntity implements Serializable {

    private int Id;
    private int Value;
    private String Note;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }
}
