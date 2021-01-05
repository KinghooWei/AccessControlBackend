package com.example.cms.serviceImpl;

import com.example.cms.bean.AttendanceBean;
import com.example.cms.bean.AttendanceByCardBean;
import com.example.cms.mapper.AttendanceByCardMapper;
import com.example.cms.service.AttendanceByCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by Jinhu Wei on 2021/1/5
 */
@Service
public class AttendanceByCardServiceImpl implements AttendanceByCardService {
    @Autowired
    AttendanceByCardMapper attendanceByCardMapper;

    @Override
    public int insertAccessRecord(AttendanceByCardBean attendanceByCardBean) {
        return attendanceByCardMapper.insertAccessRecord(attendanceByCardBean);
    }
}
