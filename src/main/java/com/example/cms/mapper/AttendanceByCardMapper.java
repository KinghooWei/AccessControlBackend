package com.example.cms.mapper;

import com.example.cms.bean.AttendanceBean;
import com.example.cms.bean.AttendanceByCardBean;

/**
 * Create by Jinhu Wei on 2021/1/5
 */
public interface AttendanceByCardMapper {
    int insertAccessRecord(AttendanceByCardBean attendanceByCardBean);
}
