package com.education.service.impl;

import com.education.bean.Order;
import com.education.dao.OrderMapper;
import com.education.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.Id;
import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public Order timetable(String starttime, int studentid) {
        return orderMapper.timetable(starttime,studentid);
    }










    @Override
    public int deleteByPrimaryKey(Integer oid) {
        return 0;
    }

    @Override
    public int insert(Order record) {
        return 0;
    }

    @Override
    public int insertSelective(Order record) {
        return 0;
    }

    @Override
    public Order selectByPrimaryKey(Integer oid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Order record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Order record) {
        return 0;
    }
}
