package com.education.dao;

import com.education.bean.Grade;

public interface GradeMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(Grade record);

    int insertSelective(Grade record);

    Grade selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
}