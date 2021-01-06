package com.example.cms.mapper;

import com.example.cms.bean.AttendanceBean;
import com.example.cms.bean.AttendanceByCardBean;
import org.apache.ibatis.annotations.Param;

/**
 * Create by Jinhu Wei on 2021/1/5
 */
public interface AttendanceByCardMapper {
    int insertAccessRecord(@Param("name") String name, @Param("phoneNum") String phoneNum, @Param("community") String community,
                           @Param("building") String building, @Param("longitude") String longitude, @Param("latitude") String latitude,
                           @Param("face") String faceBase64);
}
