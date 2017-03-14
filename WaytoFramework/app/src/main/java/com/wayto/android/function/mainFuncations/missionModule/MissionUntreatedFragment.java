package com.wayto.android.function.mainFuncations.missionModule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wayto.android.base.BaseFragment;

/**
 * 待处理
 * <p>
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:35
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class MissionUntreatedFragment extends BaseFragment {

    private static MissionUntreatedFragment fragment;

    public static MissionUntreatedFragment newInstance() {
        if (fragment == null) {
            fragment = new MissionUntreatedFragment();
        }
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(getContext());
        textView.setText("待处理");
        return textView;
    }
}
