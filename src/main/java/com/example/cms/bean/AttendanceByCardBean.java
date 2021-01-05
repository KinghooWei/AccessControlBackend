package com.example.cms.bean;

import java.util.Arrays;
import java.util.Date;

/**
 * Create by Jinhu Wei on 2021/1/5
 */
public class AttendanceByCardBean {
    private int id;
    private String name;
    private String phoneNum;
    private Date enterTime;
    private String community;
    private String building;
    private String longitude;
    private String latitude;
    private String face;

    public AttendanceByCardBean(String name, String phoneNum, String community, String building, String longitude, String latitude, String face) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.community = community;
        this.building = building;
        this.longitude = longitude;
        this.latitude = latitude;
        this.face = face;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
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

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    @Override
    public String toString() {
        return "AttendanceByCardBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", enterTime=" + enterTime +
                ", community='" + community + '\'' +
                ", building='" + building + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                '}';
    }
}
