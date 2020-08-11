package com.systop.demo.service.impl;

import com.systop.demo.mapper.ZanMapper;
import com.systop.demo.service.ZanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ZanServiceImpl implements ZanService {
    @Autowired
    private ZanMapper zanMapper;
    @Override
    public int zanadd(Integer zan_user_id, Integer zan_music_id, Integer zan_discuss_id) {
        return zanMapper.zanadd(zan_user_id,zan_music_id,zan_discuss_id);
    }

    @Override
    public int zandel(Integer zan_user_id, Integer zan_music_id, Integer zan_discuss_id) {
        return zanMapper.zandel(zan_user_id,zan_music_id,zan_discuss_id);
    }
}
