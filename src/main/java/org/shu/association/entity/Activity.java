package org.shu.association.entity;

import java.util.Date;

/**
 * Created with IntelliJ IDEA
 * User: StevenMing
 * Date: 2017/5/16
 * Time: 19:37
 */
public class Activity {
    private Long activityId;
    private String activityName;
    private Long associationId;
    private String associationName;
    private Short activityStatus;

    private String logo; // 该项不在数据库中
    private String headPicture;
    private String wordIntroduction;
    private Short applyStatus;
    private Integer setPeople;
    private Integer maxPeople;
    private String location;
    private Date startTime;
    private Date endTime;

    private String introduction;

    private Date gmtCreate;
    private Date gmtModified;

    public Activity() {
    }

    /**
     * 列表展示
     * @param activityId
     * @param activityName
     * @param associationName
     * @param headPicture
     * @param wordIntroduction
     * @param startTime
     * @param endTime
     */
    public Activity(Long activityId, String activityName, String associationName, String headPicture,
                    String wordIntroduction, Date startTime, Date endTime) {
        this.activityId = activityId;
        this.activityName = activityName;
        this.associationName = associationName;
        this.headPicture = headPicture;
        this.wordIntroduction = wordIntroduction;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Activity(Long activityId, String activityName, Long associationId, String associationName,
                    Short activityStatus, String logo, String headPicture, String wordIntroduction, Short applyStatus,
                    Integer setPeople, Integer maxPeople, String location, Date startTime, Date endTime,
                    String introduction, Date gmtCreate, Date gmtModified) {
        this.activityId = activityId;
        this.activityName = activityName;
        this.associationId = associationId;
        this.associationName = associationName;
        this.activityStatus = activityStatus;
        this.logo = logo;
        this.headPicture = headPicture;
        this.wordIntroduction = wordIntroduction;
        this.applyStatus = applyStatus;
        this.setPeople = setPeople;
        this.maxPeople = maxPeople;
        this.location = location;
        this.startTime = startTime;
        this.endTime = endTime;
        this.introduction = introduction;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public String getWordIntroduction() {
        return wordIntroduction;
    }

    public void setWordIntroduction(String wordIntroduction) {
        this.wordIntroduction = wordIntroduction;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getHeadPicture() {
        return headPicture;
    }

    public void setHeadPicture(String headPicture) {
        this.headPicture = headPicture;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Long getAssociationId() {
        return associationId;
    }

    public void setAssociationId(Long associationId) {
        this.associationId = associationId;
    }

    public String getAssociationName() {
        return associationName;
    }

    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    public Short getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Short activityStatus) {
        this.activityStatus = activityStatus;
    }

    public Short getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(Short applyStatus) {
        this.applyStatus = applyStatus;
    }

    public Integer getSetPeople() {
        return setPeople;
    }

    public void setSetPeople(Integer setPeople) {
        this.setPeople = setPeople;
    }

    public Integer getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}
