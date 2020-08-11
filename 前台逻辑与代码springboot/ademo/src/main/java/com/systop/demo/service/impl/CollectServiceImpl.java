package com.systop.demo.service.impl;

import com.systop.demo.mapper.CollectMapper;
import com.systop.demo.mapper.ZanryMapper;
import com.systop.demo.pojo.Collect;
import com.systop.demo.service.CollectService;
import com.systop.demo.service.ZanryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CollectServiceImpl implements CollectService {
    @Autowired
    private CollectMapper collectMapper;


    @Override
    public int conadd(Integer collect_user_id, Integer collect_music_id) {
        return collectMapper.conadd(collect_user_id,collect_music_id);
    }

    @Override
    public int condel(Integer collect_user_id, Integer collect_music_id) {
        return collectMapper.condel(collect_user_id,collect_music_id);
    }

    @Override
    public List<Collect> collectsel(Integer user_id) {
        return collectMapper.collectsel(user_id);
    }

    @Override
    public Integer collects(Integer user_id) {
        return collectMapper.collects(user_id);
    }
}
