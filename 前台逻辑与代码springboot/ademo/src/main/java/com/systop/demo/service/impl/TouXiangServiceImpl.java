package com.systop.demo.service.impl;

import com.systop.demo.mapper.TouXiangMapper;
import com.systop.demo.pojo.TouXiang;
import com.systop.demo.service.TouXiangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class TouXiangServiceImpl implements TouXiangService {
    @Autowired
    private TouXiangMapper touXiangMapper;
    @Override
    public List<TouXiang> touxiangall() {
        return touXiangMapper.touxiangall();
    }

    @Override
    public Integer updatetou(Integer user_image_id, Integer user_id) {
        return touXiangMapper.updatetou(user_image_id,user_id);
    }
}
