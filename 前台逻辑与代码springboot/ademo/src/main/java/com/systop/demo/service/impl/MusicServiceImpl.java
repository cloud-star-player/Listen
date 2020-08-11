package com.systop.demo.service.impl;

import com.systop.demo.mapper.MusicMapper;
import com.systop.demo.pojo.Music;
import com.systop.demo.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MusicServiceImpl implements MusicService {
    @Autowired
    private MusicMapper musicMapper;

    @Override
    public List<Music> musicall() {
        return musicMapper.musicall();
    }

    @Override
    public Music musicbyid(Integer music_id,Integer user_id) {
        return musicMapper.musicbyid(music_id,user_id);
    }

    @Override
    public Integer umusic_id(Integer music_id) {
        return musicMapper.umusic_id(music_id);
    }

    @Override
    public Integer bmusic_id(Integer music_id) {
        return musicMapper.bmusic_id(music_id);
    }

    @Override
    public List<Music> musicyuke(Integer type) {
        return musicMapper.musicyuke(type);
    }

    @Override
    public List<Music> soumusic(String music_name) {
        return musicMapper.soumusic(music_name);
    }

    @Override
    public Integer hotup(Integer music_id) {
        return musicMapper.hotup(music_id);
    }

    @Override
    public List<Music> musichot() {
        return musicMapper.musichot();
    }
}
