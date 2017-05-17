package org.shu.association.entity;

import java.util.Date;

/**
 * Created with IntelliJ IDEA
 * User: StevenMing
 * Date: 2017/4/25
 * Time: 10:56
 */
public class Association {
    private Long associationId;
    private String associationName;
    private String type;
    private Short star;
    private String associationDepartment;
    private String instructor;
    private Short associationStatus;

    private String nickName;
    private String logo;
    private String wordIntroduction;
    private String associationEmail;
    private String wechatId;
    private String wechatName;
    private String wechatCode;
    private String associationQq;
    private Byte applyStatus;

    private String introduction;

    private Date gmtCreate;
    private Date gmtModified;

    @Override
    public String toString() {
        return "Association{" +
                "associationId=" + associationId +
                ", associationName='" + associationName + '\'' +
                ", type=" + type +
                ", star=" + star +
                ", associationDepartment='" + associationDepartment + '\'' +
                ", instructor='" + instructor + '\'' +
                ", associationStatus=" + associationStatus +
                ", nickName='" + nickName + '\'' +
                ", logo='" + logo + '\'' +
                ", wordIntroduction='" + wordIntroduction + '\'' +
                ", associationEmail='" + associationEmail + '\'' +
                ", wechatId='" + wechatId + '\'' +
                ", wechatName='" + wechatName + '\'' +
                ", wechatCode='" + wechatCode + '\'' +
                ", associationQq='" + associationQq + '\'' +
                ", applyStatus=" + applyStatus +
                ", introduction='" + introduction + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }

    public Association() {
    }

    /**
     * 分类查找条件
     * @param type
     * @param star
     */
    public Association(String type, Short star) {
        this.type = type;
        this.star = star;
    }

    /**
     * 列表展示
     * @param associationId
     * @param associationName
     * @param type
     * @param star
     * @param associationStatus
     * @param logo
     * @param wordIntroduction
     */
    public Association(Long associationId, String associationName, String type, Short star, Short associationStatus, String logo,
                       String wordIntroduction) {
        this.associationId = associationId;
        this.associationName = associationName;
        this.type = type;
        this.star = star;
        this.associationStatus = associationStatus;
        this.logo = logo;
        this.wordIntroduction = wordIntroduction;
    }

    public Association(Long associationId, String associationName, String type, Short star, String associationDepartment, String instructor,
                       Short associationStatus, String nickName, String logo, String wordIntroduction, String associationEmail,
                       String wechatId, String wechatName, String wechatCode, String associationQq, Byte applyStatus,
                       String introduction, Date gmtCreate, Date gmtModified) {
        this.associationId = associationId;
        this.associationName = associationName;
        this.type = type;
        this.star = star;
        this.associationDepartment = associationDepartment;
        this.instructor = instructor;
        this.associationStatus = associationStatus;
        this.nickName = nickName;
        this.logo = logo;
        this.wordIntroduction = wordIntroduction;
        this.associationEmail = associationEmail;
        this.wechatId = wechatId;
        this.wechatName = wechatName;
        this.wechatCode = wechatCode;
        this.associationQq = associationQq;
        this.applyStatus = applyStatus;
        this.introduction = introduction;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    /**
     * 社团关键信息修改（高级管理员）
     * @param associationId
     * @param associationName
     * @param type
     * @param star
     * @param associationDepartment
     * @param instructor
     * @param associationStatus
     */
    public Association(Long associationId, String associationName, String type, Short star, String associationDepartment,
                       String instructor, Short associationStatus) {
        this.associationId = associationId;
        this.associationName = associationName;
        this.type = type;
        this.star = star;
        this.associationDepartment = associationDepartment;
        this.instructor = instructor;
        this.associationStatus = associationStatus;
    }

    /**
     * 社团基本信息修改（社团）
     * @param associationId
     * @param nickName
     * @param logo
     * @param wordIntroduction
     * @param associationEmail
     * @param wechatId
     * @param wechatName
     * @param wechatCode
     * @param associationQq
     * @param applyStatus
     * @param introduction
     */
    public Association(Long associationId, String nickName, String logo, String wordIntroduction, String associationEmail,
                       String wechatId, String wechatName, String wechatCode, String associationQq, Byte applyStatus,
                       String introduction) {
        this.associationId = associationId;
        this.nickName = nickName;
        this.logo = logo;
        this.wordIntroduction = wordIntroduction;
        this.associationEmail = associationEmail;
        this.wechatId = wechatId;
        this.wechatName = wechatName;
        this.wechatCode = wechatCode;
        this.associationQq = associationQq;
        this.applyStatus = applyStatus;
        this.introduction = introduction;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getWechatCode() {
        return wechatCode;
    }

    public void setWechatCode(String wechatCode) {
        this.wechatCode = wechatCode;
    }

    public Long getAssociationId() {
        return associationId;
    }

    public void setAssociationId(Long associationId) {
        this.associationId = associationId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Short getStar() {
        return star;
    }

    public void setStar(Short star) {
        this.star = star;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public Short getAssociationStatus() {
        return associationStatus;
    }

    public void setAssociationStatus(Short associationStatus) {
        this.associationStatus = associationStatus;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getWordIntroduction() {
        return wordIntroduction;
    }

    public void setWordIntroduction(String wordIntroduction) {
        this.wordIntroduction = wordIntroduction;
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }

    public String getWechatName() {
        return wechatName;
    }

    public void setWechatName(String wechatName) {
        this.wechatName = wechatName;
    }

    public Byte getApplyStatus() {
        return applyStatus;
    }

    public void setapplyStatus(Byte applyStatus) {
        this.applyStatus = applyStatus;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
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

    public String getAssociationName() {
        return associationName;
    }

    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    public String getAssociationDepartment() {
        return associationDepartment;
    }

    public void setAssociationDepartment(String associationDepartment) {
        this.associationDepartment = associationDepartment;
    }

    public String getAssociationEmail() {
        return associationEmail;
    }

    public void setAssociationEmail(String associationEmail) {
        this.associationEmail = associationEmail;
    }

    public String getAssociationQq() {
        return associationQq;
    }

    public void setAssociationQq(String associationQq) {
        this.associationQq = associationQq;
    }
}
