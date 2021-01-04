package com.example.cms.bean;

// 人员信息实体，每个bean对应一个人员信息（这里指的是小区住户）
public class PersonBean {
    private int person_id;
    private String name;
    private String phoneNum;
    private String loginPassword;
    private String community;
    private String building;
    private String roomId;
    private String communityPassword;
    private String buildingPassword;
    private String tempPassword;
    private String faceFeature;
    private String QRCode;
    private String cardID;
    private byte[] portrait;
    private byte[] faceImg;

    public int getId() {
        return person_id;
    }

    public void setId(int id) {
        this.person_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String num) {
        this.phoneNum = num;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String password) {
        this.loginPassword = password;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getCommunityPassword() {
        return communityPassword;
    }

    public void setCommunityPassword(String communityPassword) {
        this.communityPassword = communityPassword;
    }

    public String getBuildingPassword() {
        return buildingPassword;
    }

    public void setBuildingPassword(String buildingPassword) {
        this.buildingPassword = buildingPassword;
    }

    public String getTempPassword() {
        return tempPassword;
    }

    public void setTempPassword(String tempPassword) {
        this.tempPassword = tempPassword;
    }

    public String getFaceFeature() {
        return faceFeature;
    }

    public void setFaceFeature(String faceFeature) {
        this.faceFeature = faceFeature;
    }

    public String getQRCode() {
        return QRCode;
    }

    public void setQRCode(String QRCode) {
        this.QRCode = QRCode;
    }

    public void setPortrait(byte[] portraitData) {
        this.portrait = portraitData;
    }

    public byte[] getPortrait() {
        return portrait;
    }

    public void setFaceImg(byte[] faceImg) {
        this.faceImg = faceImg;
    }

    public byte[] getFaceImg() {
        return faceImg;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }
}
