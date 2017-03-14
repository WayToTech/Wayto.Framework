package com.wayto.android.function.pollingFuncation.data.source;

import com.wayto.android.db.UploadingTable;
import com.wayto.android.db.WorkRecordTable;

import java.util.List;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/3/14 10:29
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public interface PollingDataSource {
    /**
     * 插入
     */
    interface InsertWorkRecordCallBack {
        void insertWorkRecordSuccess(WorkRecordTable table);

        void insertWorkRecordFailure();
    }

    void insertWorkRecord(WorkRecordTable entity, InsertWorkRecordCallBack callBack);

    /**
     * 查询工作记录表
     */
    interface QueryWorkRecordCallBack {
        void queryWorkRecordSuccess(List<WorkRecordTable> tables);

        void queryWorkRecordFailure();

        int getWorkType();

        int getlocalTag();
    }

    void queryWorkRecordTab(QueryWorkRecordCallBack callBack);

    /**
     * 查询
     */
    interface QueryUploadTaskListCallBack {
        void getUploadTaskListSuccess(List<UploadingTable> lists);

        void getUploadTaskListFailure();
    }

    void queryUploadTaskList(QueryUploadTaskListCallBack callBack);

    /**
     * 上传
     */
    interface UploadTaskCallBack {
        void onUploadTaskSuccess(UploadingTable entity);

        void onUploadTaskFailure(UploadingTable entity);
    }

    void uploadTask(UploadingTable entity, UploadTaskCallBack callBack);/*上传*/

    void insertUploadTask(UploadingTable table);/*插入上传任务数据*/

    void deleteUploadTask(UploadingTable entity);/*删除上传任务数据*/

    void updateWorkRecordTableStatus(WorkRecordTable table);/*修改工作记录上传状态*/

    void updateMissionStatus(int missionId, int missionPointId);/*修改关联的任务状态*/
}
