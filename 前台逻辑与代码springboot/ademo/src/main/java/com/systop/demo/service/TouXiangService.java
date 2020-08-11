package com.systop.demo.service;



import com.systop.demo.pojo.Music;
import com.systop.demo.pojo.TouXiang;

import java.util.List;

public interface TouXiangService {
    List<TouXiang> touxiangall();
    Integer updatetou(Integer user_image_id,Integer user_id);
}
