package com.systop.demo.mapper;

import com.systop.demo.pojo.Collect;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CollectMapper {
    //收藏
    @Insert("insert into collect(collect_user_id,collect_music_id) values(#{collect_user_id},#{collect_music_id})")
    int conadd(Integer collect_user_id,Integer collect_music_id);
    //取消
    @Delete("delete from collect where collect_user_id=#{collect_user_id} and collect_music_id=#{collect_music_id}")
    int condel(Integer collect_user_id,Integer collect_music_id);

    //查询收藏歌单
    @Select("select c.collect_id,m.music_name,m.music_id,m.music_image,m.music_music,a.author_name,(select count(*) from discuss where discuss_status=1 and discuss_music_id=music_id) as dcount from collect c,musicmant m,author a where c.collect_user_id=${user_id} and m.music_status=1 and a.author_id=m.music_author_id and c.collect_music_id=m.music_id GROUP BY c.collect_id")
    @Results({
            @Result(property = "collect_id", column = "collect_id"),
            @Result(property = "music.music_name", column = "music_name"),
            @Result(property = "music.music_id", column = "music_id"),
            @Result(property = "music.music_image", column = "music_image"),
            @Result(property = "music.music_music", column = "music_music"),
            @Result(property = "author.author_name", column = "author_name"),
            @Result(property = "dcount", column = "dcount"),
    })
    List<Collect> collectsel(Integer user_id);

    //收藏数量
    @Select("select count(*) from collect c,musicmant m where c.collect_user_id=${user_id} and m.music_status=1 and c.collect_music_id=m.music_id")
    Integer collects(Integer user_id);
}
