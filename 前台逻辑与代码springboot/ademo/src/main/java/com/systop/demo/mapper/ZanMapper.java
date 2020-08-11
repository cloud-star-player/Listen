package com.systop.demo.mapper;

import com.systop.demo.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ZanMapper {
    //点赞
    @Insert("insert into zan(zan_user_id,zan_music_id,zan_discuss_id) values(#{zan_user_id},#{zan_music_id},#{zan_discuss_id})")
    int zanadd(Integer zan_user_id,Integer zan_music_id,Integer zan_discuss_id);

    @Delete("delete from zan where zan_user_id=#{zan_user_id} and zan_music_id=#{zan_music_id} and zan_discuss_id=#{zan_discuss_id}")
    int zandel(Integer zan_user_id,Integer zan_music_id,Integer zan_discuss_id);
}
