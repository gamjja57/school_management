package com.greenart.school_management.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.greenart.school_management.mapper.DashboardMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {
    @Autowired DashboardMapper mapper;

    public Map<String,Object> getCounts() {
        List<Integer> deptCntList = new ArrayList<Integer>();
        deptCntList.add(mapper.getTotalDepartmentCnt());
        deptCntList.add(mapper.getActiveDepartmentCnt());
        deptCntList.add(mapper.getDeactiveDepartmentCnt());

        List<Integer> teacherCntList = new ArrayList<Integer>();
        teacherCntList.add(mapper.getTotalTeacherCnt());
        teacherCntList.add(mapper.getWorkTeacherCnt());
        teacherCntList.add(mapper.getDatOffTeacherCnt());
        teacherCntList.add(mapper.getDatOff2TeacherCnt());
        teacherCntList.add(mapper.getretireTeacherCnt());
    
        
        List<Integer> studentCntList = new ArrayList<Integer>();
        studentCntList.add(mapper.getTotalStudentCnt());
        studentCntList.add(mapper.getAttendStudentCnt());
        studentCntList.add(mapper.getDayOffStudentCnt());
        studentCntList.add(mapper.getLeaveStudentCnt());
        
        List<Integer> subjectCntList = new ArrayList<Integer>();
        subjectCntList.add(mapper.getTotalSubjectCnt());
        subjectCntList.add(mapper.getActiveSubjectCnt());
        subjectCntList.add(mapper.getDeactiveSubjectCnt());
        subjectCntList.add(mapper.getFinishSubjectCnt());

        Map<String,Object> map = new LinkedHashMap<String,Object>();
        map.put("department", deptCntList);
        map.put("teacher", teacherCntList);
        map.put("student", studentCntList);
        map.put("subject", subjectCntList);
        return map;
    }

    public Map<String, Object> getUpdateDate()  {
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        
        resultMap.put("department", mapper.getDepartmentUpdateDate());
        resultMap.put("teacher", mapper.getTeacherUpdateDate());

        return resultMap;
    }
}

