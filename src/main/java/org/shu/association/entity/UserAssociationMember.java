package org.shu.association.entity;

import java.util.Date;

/**
 * Created with IntelliJ IDEA
 * User: StevenMing
 * Date: 2017/4/25
 * Time: 18:32
 */
public class UserAssociationMember {
    private Long id;
    private String userId;
    private Long assocaitionId;
    private Short identity;
    private Date joinTime;
    private Date leaveTime;
    private Date gmtCreate;
    private Date gmtModified;

    public UserAssociationMember() {
    }

    public UserAssociationMember(Long id, String userId, Long assocaitionId, Short identity) {
        this.id = id;
        this.userId = userId;
        this.assocaitionId = assocaitionId;
        this.identity = identity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getAssocaitionId() {
        return assocaitionId;
    }

    public void setAssocaitionId(Long assocaitionId) {
        this.assocaitionId = assocaitionId;
    }

    public Short getIdentity() {
        return identity;
    }

    public void setIdentity(Short identity) {
        this.identity = identity;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
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
