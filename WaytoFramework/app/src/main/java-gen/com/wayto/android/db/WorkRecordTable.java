package com.wayto.android.db;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "WORK_RECORD_TABLE".
 */
@Entity
public class WorkRecordTable implements java.io.Serializable {

    @Id
    private Long id;
    private int localTag;
    private int workType;

    @NotNull
    private String uploadUrl;
    private long time;
    private int missionId;
    private int missionPointId;
    private String imagesUrl;
    private String videoUrl;
    private String audioUrl;

    @NotNull
    private String attributes;
    private String revStr1;
    private String revStr2;
    private String revStr3;
    private Integer revInt1;
    private Integer revInt2;
    private Integer revInt3;

    @Generated
    public WorkRecordTable() {
    }

    public WorkRecordTable(Long id) {
        this.id = id;
    }

    @Generated
    public WorkRecordTable(Long id, int localTag, int workType, String uploadUrl, long time, int missionId, int missionPointId, String imagesUrl, String videoUrl, String audioUrl, String attributes, String revStr1, String revStr2, String revStr3, Integer revInt1, Integer revInt2, Integer revInt3) {
        this.id = id;
        this.localTag = localTag;
        this.workType = workType;
        this.uploadUrl = uploadUrl;
        this.time = time;
        this.missionId = missionId;
        this.missionPointId = missionPointId;
        this.imagesUrl = imagesUrl;
        this.videoUrl = videoUrl;
        this.audioUrl = audioUrl;
        this.attributes = attributes;
        this.revStr1 = revStr1;
        this.revStr2 = revStr2;
        this.revStr3 = revStr3;
        this.revInt1 = revInt1;
        this.revInt2 = revInt2;
        this.revInt3 = revInt3;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLocalTag() {
        return localTag;
    }

    public void setLocalTag(int localTag) {
        this.localTag = localTag;
    }

    public int getWorkType() {
        return workType;
    }

    public void setWorkType(int workType) {
        this.workType = workType;
    }

    @NotNull
    public String getUploadUrl() {
        return uploadUrl;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setUploadUrl(@NotNull String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getMissionId() {
        return missionId;
    }

    public void setMissionId(int missionId) {
        this.missionId = missionId;
    }

    public int getMissionPointId() {
        return missionPointId;
    }

    public void setMissionPointId(int missionPointId) {
        this.missionPointId = missionPointId;
    }

    public String getImagesUrl() {
        return imagesUrl;
    }

    public void setImagesUrl(String imagesUrl) {
        this.imagesUrl = imagesUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    @NotNull
    public String getAttributes() {
        return attributes;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setAttributes(@NotNull String attributes) {
        this.attributes = attributes;
    }

    public String getRevStr1() {
        return revStr1;
    }

    public void setRevStr1(String revStr1) {
        this.revStr1 = revStr1;
    }

    public String getRevStr2() {
        return revStr2;
    }

    public void setRevStr2(String revStr2) {
        this.revStr2 = revStr2;
    }

    public String getRevStr3() {
        return revStr3;
    }

    public void setRevStr3(String revStr3) {
        this.revStr3 = revStr3;
    }

    public Integer getRevInt1() {
        return revInt1;
    }

    public void setRevInt1(Integer revInt1) {
        this.revInt1 = revInt1;
    }

    public Integer getRevInt2() {
        return revInt2;
    }

    public void setRevInt2(Integer revInt2) {
        this.revInt2 = revInt2;
    }

    public Integer getRevInt3() {
        return revInt3;
    }

    public void setRevInt3(Integer revInt3) {
        this.revInt3 = revInt3;
    }

}
