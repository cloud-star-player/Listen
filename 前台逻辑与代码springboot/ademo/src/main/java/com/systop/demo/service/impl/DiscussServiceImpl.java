package com.systop.demo.service.impl;

import com.systop.demo.mapper.DiscussMapper;
import com.systop.demo.mapper.MusicMapper;
import com.systop.demo.pojo.Discuss;
import com.systop.demo.pojo.Music;
import com.systop.demo.pojo.Zan;
import com.systop.demo.service.DiscussService;
import com.systop.demo.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DiscussServiceImpl implements DiscussService {
    @Autowired
    private DiscussMapper discussMapper;

    @Override
    public List<Discuss> discussall(Integer music_id,Integer zan_user_id) {
        return discussMapper.discussall(music_id,zan_user_id);
    }

    @Override
    public Integer insertdiscuss(Discuss discuss) {
        return discussMapper.insertdiscuss(discuss);
    }

    @Override
    public Integer deletediscuss(Integer discuss_user_id) {
        return discussMapper.deletediscuss(discuss_user_id);
    }

    @Override
    public Discuss discussbyid(Integer discuss_id) {
        return discussMapper.discussbyid(discuss_id);
    }

    @Override
    public Discuss discussbyid2(Integer music_id, Integer user_id) {
        return discussMapper.discussbyid2(music_id,user_id);
    }

//    @Override
//    public Zan yzan(Integer zan_user_id, Integer zan_discuss_id) {
//        return null;
//    }


}
