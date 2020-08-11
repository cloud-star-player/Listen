package com.systop.demo.mapper;


import com.systop.demo.pojo.Music;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface MusicMapper {
    //主页展示
    @Select("select *,a.author_name,(select count(*) from discuss where discuss_status=1 and discuss_music_id=music_id) as dcount from author a,musicmant m where m.music_author_id=a.author_id and m.music_status=1 ORDER BY music_id desc")
    @Results({
            @Result(property = "music_id", column = "music_id"),
            @Result(property = "music_name", column = "music_name"),
            @Result(property = "music_image", column = "music_image"),
            @Result(property = "music_music", column = "music_music"),
            @Result(property = "dcount", column = "dcount"),
            @Result(property = "author.author_name", column = "author_name"),
    })
    List<Music> musicall();
    @Select("select *,a.author_name,(select count(*) from relationship where relationship_author_id=m.music_author_id and relationship_user_id=#{user_id})as guanzhu,(select count(*) from discuss where discuss_status=1 and discuss_music_id=music_id) as dcount from author a,musicmant m where m.music_author_id=a.author_id and music_id=#{music_id}")
    @Results({
            @Result(property = "music_id", column = "music_id"),
            @Result(property = "music_name", column = "music_name"),
            @Result(property = "music_image", column = "music_image"),
            @Result(property = "music_music", column = "music_music"),
            @Result(property = "dcount", column = "dcount"),
            @Result(property = "guanzhu", column = "guanzhu"),
            @Result(property = "author.author_name", column = "author_name"),
    })
    Music musicbyid(Integer music_id,Integer user_id);



    @Select("select music_id from musicmant where music_id = (select max(music_id) from musicmant where music_id <#{music_id}) and music_status=1")
    Integer umusic_id(Integer music_id);                                        //上一曲

    @Select("select music_id from musicmant where music_id = (select min(music_id) from musicmant where music_id >#{music_id}) and music_status=1")
    Integer bmusic_id(Integer music_id);                               //下一曲

    @Select("select music_id from musicmant where music_id = (select max(music_id) from musicmant where music_id <#{music_id}) and music_status=1 and music_name like concat('%',#{music_name},'%') or author_name like concat('%',#{music_name},'%')")
    Integer fidumusic_id(Integer music_id,String music_name);                                        //上一曲

    @Select("select music_id from musicmant where music_id = (select min(music_id) from musicmant where music_id >#{music_id}) and music_status=1 and music_name like concat('%',#{music_name},'%') or author_name like concat('%',#{music_name},'%')")
    Integer fidbmusic_id(Integer music_id,String music_name);

    //乐库展示
    @Select("select *,a.author_name from author a,musicmant m where m.music_author_id=a.author_id and m.music_status=1 and music_type=${type} order by rand() limit 8")
    @Results({
            @Result(property = "music_id", column = "music_id"),
            @Result(property = "music_name", column = "music_name"),
            @Result(property = "music_image", column = "music_image"),
            @Result(property = "music_music", column = "music_music"),
            @Result(property = "author.author_name", column = "author_name"),
    })
    List<Music> musicyuke(Integer type);


    //搜索展示
    @Select("select *,a.author_name from author a,musicmant m where m.music_author_id=a.author_id and m.music_status=1 and music_name like concat('%',#{music_name},'%') or author_name like concat('%',#{music_name},'%') and author_id=music_author_id")
    @Results({
            @Result(property = "music_id", column = "music_id"),
            @Result(property = "music_name", column = "music_name"),
            @Result(property = "music_image", column = "music_image"),
            @Result(property = "music_music", column = "music_music"),
            @Result(property = "author.author_name", column = "author_name"),
    })
    List<Music> soumusic(String music_name);

    //热度添加
    @Update("update musicmant set music_hot=music_hot+1 where music_id=#{music}")
    Integer hotup(Integer music_id);

    //排行榜展示
    @Select("select *,a.author_name,(select count(*) from discuss where discuss_status=1 and discuss_music_id=music_id) as dcount from author a,musicmant m where m.music_author_id=a.author_id and m.music_status=1 ORDER BY music_hot desc limit 0,8")
    @Results({
            @Result(property = "music_id", column = "music_id"),
            @Result(property = "music_name", column = "music_name"),
            @Result(property = "music_image", column = "music_image"),
            @Result(property = "music_music", column = "music_music"),
            @Result(property = "dcount", column = "dcount"),
            @Result(property = "author.author_name", column = "author_name"),
    })
    List<Music> musichot();
}
