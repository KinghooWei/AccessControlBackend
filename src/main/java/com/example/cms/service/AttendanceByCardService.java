package com.example.cms.service;

import com.example.cms.bean.AttendanceByCardBean;
import org.apache.ibatis.annotations.Param;

/**
 * Create by Jinhu Wei on 2021/1/5
 */
public interface AttendanceByCardService {
    int insertAccessRecord(String name, String phoneNum, String community, String building, String longitude, String latitude, String faceBase64);
}
