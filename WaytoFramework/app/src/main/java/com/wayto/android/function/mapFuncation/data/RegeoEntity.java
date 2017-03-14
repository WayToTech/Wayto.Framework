package com.wayto.android.function.mapFuncation.data;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:32
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */
public class RegeoEntity implements Serializable {

    public class Regeocode implements Serializable {
        //全文地址
        private String formatted_address;

        @SerializedName("addressComponent")
        private AddressComponent addressComponent;

        /**
         * 地址组件集合
         */
        class AddressComponent implements Serializable {

            /**
             * 路段
             */
            private String township;
        }


        public void setFormatted_address(String formatted_address) {
            this.formatted_address = formatted_address;
        }

        public String getFormatted_address() {
            return this.formatted_address;
        }

        public String getTownship() {
            return this.addressComponent.township;
        }

    }

    private String status;

    private String info;

    private String infocode;

    private Regeocode regeocode;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfocode(String infocode) {
        this.infocode = infocode;
    }

    public String getInfocode() {
        return this.infocode;
    }

    public void setRegeocode(Regeocode regeocode) {
        this.regeocode = regeocode;
    }

    public Regeocode getRegeocode() {
        return this.regeocode;
    }


}
