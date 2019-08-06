package com.education.service;

import com.education.bean.Order;

import java.util.List;

public interface OrderService {


    public Order timetable(String starttime, int studentid);












    int deleteByPrimaryKey(Integer oid);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer oid);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}