package com.systop.demo.service;



import com.systop.demo.pojo.Music;

import java.util.List;

public interface MusicService {
    public List<Music>musicall();
    public Music musicbyid(Integer music_id,Integer user_id);
    public Integer umusic_id(Integer music_id);
    public Integer bmusic_id(Integer music_id);
    public List<Music> musicyuke(Integer type);
    public List<Music> soumusic(String music_name);
    public Integer hotup(Integer music_id);
    public List<Music> musichot();
}
