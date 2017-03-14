package com.wayto.android.function.mainFuncations.recordModule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wayto.android.R;
import com.wayto.android.base.BaseFragment;
import com.wayto.android.base.BaseRecyclerViewAdapter;
import com.wayto.android.view.PullToRefreshRecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 历史模块基类
 * <p>
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:34
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class RecordBaseFragment extends BaseFragment implements PullToRefreshRecyclerView.PullToRefreshRecyclerViewListener, BaseRecyclerViewAdapter.OnRecyclerViewItemLongClickListener, BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener {

    @BindView(R.id.record_recyclerView)
    public PullToRefreshRecyclerView recordRecyclerView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_mission_record, null);
        ButterKnife.bind(this, rootView);
        initRecyclerView();
        return rootView;
    }

    /**
     * 初始化RecyclerView
     */
    private void initRecyclerView() {
        recordRecyclerView.setPullToRefreshListener(this);
    }

    /**
     * 启动刷新
     */
    public void startUpRefresh() {
        recordRecyclerView.startUpRefresh();
    }

    /**
     * 关闭刷新
     */
    public void closeRefresh() {
        recordRecyclerView.closeDownRefresh();
    }

    /**
     * 加载完成
     */
    public void loadComplete() {
        recordRecyclerView.setLoading(false);
    }

    /**
     * 加载更多完成
     */
    public void loadMoreFinish(){
        recordRecyclerView.onLoadMoreFinish();
    }

    /**
     * 设置监听器
     *
     * @param adapter
     */
    public void setAdapter(BaseRecyclerViewAdapter adapter) {
        recordRecyclerView.setRecyclerViewAdapter(adapter);
        adapter.setOnItemClickListener(this);
        adapter.setOnItemLongClickListener(this);
        recordRecyclerView.setMode(PullToRefreshRecyclerView.Mode.BOTH);
    }

    @Override
    public void onItemClick(View view, Object data, int position) {

    }

    @Override
    public void onLongItemClick(View view, Object data, int position) {

    }

    @Override
    public void onDownRefresh() {

    }

    @Override
    public void onPullRefresh() {

    }
}
