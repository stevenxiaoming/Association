package org.shu.association.entity;

import java.util.Date;

/**
 * Created with IntelliJ IDEA
 * User: StevenMing
 * Date: 2017/4/25
 * Time: 18:43
 */
public class UserAttention {
    private String userId;
    private Long associationId;
    private Long activityId;
    private Date gmtCreate;
    private Date gmtModified;

    public UserAttention() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getAssociationId() {
        return associationId;
    }

    public void setAssociationId(Long associationId) {
        this.associationId = associationId;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
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
