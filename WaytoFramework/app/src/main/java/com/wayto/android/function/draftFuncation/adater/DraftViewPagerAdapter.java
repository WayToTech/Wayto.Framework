package com.wayto.android.function.draftFuncation.adater;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.wayto.android.function.draftFuncation.fragment.CollectDraftFragment;
import com.wayto.android.function.draftFuncation.fragment.RecordDraftFragment;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:38
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class DraftViewPagerAdapter extends FragmentPagerAdapter {

    public final static int DRAFT_COLLECT_VALUE = 0;/*采集*/
    public final static int DRAFT_RECORD_VALUE = 1;/*上报*/

    private int pages;

    public DraftViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public DraftViewPagerAdapter(FragmentManager fm, int pages) {
        super(fm);
        this.pages = pages;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case DRAFT_COLLECT_VALUE:
                fragment = CollectDraftFragment.newInstance();
                break;
            case DRAFT_RECORD_VALUE:
                fragment = RecordDraftFragment.newInstance();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return pages;
    }
}
