package com.systop.demo.service;

import com.systop.demo.pojo.Collect;

import java.util.List;

public interface CollectService {
    int conadd(Integer collect_user_id,Integer collect_music_id);
    int condel(Integer collect_user_id,Integer collect_music_id);
    List<Collect> collectsel(Integer music_id);
    Integer collects(Integer user_id);
}
