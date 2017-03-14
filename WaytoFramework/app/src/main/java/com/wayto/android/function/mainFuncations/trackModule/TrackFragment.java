package com.wayto.android.function.mainFuncations.trackModule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wayto.android.R;
import com.wayto.android.base.BaseFragment;

import butterknife.ButterKnife;

/**
 * 足迹界面
 * <p>
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:33
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class TrackFragment extends BaseFragment {

    private static TrackFragment fragment;

    public static TrackFragment newInstance() {
        if (fragment == null) {
            fragment = new TrackFragment();
        }
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.main_fragment_track, null);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

}
