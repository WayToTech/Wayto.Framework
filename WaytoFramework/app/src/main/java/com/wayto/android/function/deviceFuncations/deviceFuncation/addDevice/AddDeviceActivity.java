package com.wayto.android.function.deviceFuncations.deviceFuncation.addDevice;

import android.app.Activity;
import android.os.Bundle;

import com.wayto.android.function.deviceFuncations.FillBaseActivity;
import com.wayto.android.function.deviceFuncations.FillBaseFragment;
import com.wayto.android.utils.ISkipActivityUtil;

/**
 * 设施采集Activity
 * <p>
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:39
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */
public class AddDeviceActivity extends FillBaseActivity {

    public static void startAddDeviceIntent(Activity activity, String title) {
        Bundle bundle = new Bundle();
        bundle.putString(TITLE_FLAG, title);
        ISkipActivityUtil.startIntent(activity, AddDeviceActivity.class, bundle);
    }

    @Override
    public FillBaseFragment getFillingFragment(Bundle bundle) {
        FillBaseFragment fragment = AddDeviceFragment.newInstance();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public String getHeadTitle() {
        return getIntent().getStringExtra(TITLE_FLAG);
    }
}
