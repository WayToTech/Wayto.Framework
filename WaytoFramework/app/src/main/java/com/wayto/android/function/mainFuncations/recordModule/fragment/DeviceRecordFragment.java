package com.wayto.android.function.mainFuncations.recordModule.fragment;

import android.os.Bundle;
import android.os.Message;
import android.support.annotation.Nullable;

import com.wayto.android.function.accountFuncation.data.UserInfoEntity;
import com.wayto.android.function.mainFuncations.recordModule.RecordBaseFragment;
import com.wayto.android.function.mainFuncations.recordModule.adapter.DeviceRecyclerViewAdater;

import java.util.ArrayList;
import java.util.List;

/**
 * 设施采集历史记录
 * 
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:34
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
*/

public class DeviceRecordFragment extends RecordBaseFragment {

    private DeviceRecyclerViewAdater adater;

    @Override
    protected void dispatchMessage(Message msg) {
        super.dispatchMessage(msg);
        switch (msg.what) {
            case 0x501:
                List<UserInfoEntity> entities = (List<UserInfoEntity>) msg.obj;
                adater.addItems(entities);
                closeRefresh();
                loadMoreFinish();
                break;
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        adater = new DeviceRecyclerViewAdater(getContext());
        setAdapter(adater);
        startUpRefresh();
    }

    @Override
    public void onDownRefresh() {
        super.onDownRefresh();
        List<UserInfoEntity> entities = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            UserInfoEntity entity = new UserInfoEntity();
            entity.setName("设施" + (i + 1));
            entities.add(entity);
        }
        Message message = new Message();
        message.what = 0x501;
        message.obj = entities;
        mHandler.sendMessageDelayed(message, 3000);
    }

    @Override
    public void onPullRefresh() {
        super.onPullRefresh();
    }
}
