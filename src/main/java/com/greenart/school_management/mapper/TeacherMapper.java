package com.greenart.school_management.mapper;

import java.util.List;

import com.greenart.school_management.data.TeacherHistoryVO;
import com.greenart.school_management.data.TeacherVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper {
    public void addTeacherInfo(TeacherVO data);

    public List<TeacherVO> getTeacherList(String type, String keyword, Integer offset);

    public Integer getTeacherCnt(String type, String keyword);

    public void deleteTeacherInfo(Integer seq);
    public Integer isExistTeacher(Integer seq); //삭제 실패여부 알려주기

    public TeacherVO getTeacherInfoBySeq (Integer seq);

    public void updateTeacherInfo(TeacherVO data);

    public void insertTeacherHistory(TeacherHistoryVO data);
    public Integer getRecentAddedTeacherSeq();
}
