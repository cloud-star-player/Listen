package com.systop.demo.mapper;


import com.systop.demo.pojo.Music;
import com.systop.demo.pojo.TouXiang;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TouXiangMapper {
    @Select("select * from touxiang where touxiang_state=1 ORDER BY touxiang_id desc")
    List<TouXiang> touxiangall();
    @Update("update user set user_image_id=${user_image_id} where user_id=${user_id}")
    Integer updatetou(Integer user_image_id,Integer user_id);
}
