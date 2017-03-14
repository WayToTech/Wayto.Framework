package com.wayto.android.function.mainFuncations.missionModule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wayto.android.base.BaseFragment;

/**
 * 待审核
 * 
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:36
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
*/

public class MissionUnauditedFragment extends BaseFragment {

    private static MissionUnauditedFragment fragment;

    public static MissionUnauditedFragment newInstance() {
        if (fragment == null) {
            fragment = new MissionUnauditedFragment();
        }
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView=new TextView(getContext());
        textView.setText("待审核");
        return textView;
    }
}
