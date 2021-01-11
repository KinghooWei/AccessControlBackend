package com.example.cms.serviceImpl;

import com.example.cms.bean.AttendanceByCardBean;
import com.example.cms.mapper.AttendanceByCardMapper;
import com.example.cms.service.AttendanceByCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by Jinhu Wei on 2021/1/5
 */
@Service
public class AttendanceByCardServiceImpl implements AttendanceByCardService {
    @Autowired
    AttendanceByCardMapper attendanceByCardMapper;

    @Override
    public int insertAccessRecord(String name, String phoneNum, String community, String building, String longitude, String latitude, String faceBase64) {
        return attendanceByCardMapper.insertAccessRecord(name, phoneNum, community, building, longitude, latitude, faceBase64);
    }

    @Override
    public List<AttendanceByCardBean> getRecordList(String phoneNum) {
        return attendanceByCardMapper.queryRecordsRecent(phoneNum);
    }
}
