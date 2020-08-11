package com.systop.demo.mapper;

import com.systop.demo.pojo.Discuss;
import com.systop.demo.pojo.User;
import com.systop.demo.pojo.Zan;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface DiscussMapper {
    /**
     * dcount回复数
     * @param music_id
     * @return
     */
    //点赞需要判断当前用户的id是否在记录内
    @Select("select (select t.touxiang_image from touxiang t,user u where t.touxiang_id=u.user_image_id and user_id=discuss_user_id) as touimage,(select count(*) from zan where zan_user_id=#{zan_user_id} and zan_discuss_id=d.discuss_id and zan_music_id=music_id)as dsta,(select COUNT(*) FROM reply where reply_status=1 and reply_discuss_id=d.discuss_id)as dcount,d.discuss_user_id,(SELECT count( * ) from zan where zan_music_id=m.music_id and zan_discuss_id=d.discuss_id GROUP BY u.user_id) as dzan,d.discuss_id,u.user_id,d.discuss_content,d.discuss_date,u.user_name from discuss d,user u,musicmant m,reply r where m.music_id=d.discuss_music_id and u.user_id=d.discuss_user_id and music_id=#{music_id} and discuss_status=1 GROUP BY d.discuss_id")
    @Results({
            @Result(property = "discuss_id", column = "discuss_id"),
            @Result(property = "user.user_id", column = "user_id"),
            @Result(property = "discuss_user_id", column = "discuss_user_id"),
            @Result(property = "discuss_content", column = "discuss_content"),
            @Result(property = "discuss_date", column = "discuss_date"),
            @Result(property = "user.user_name", column = "user_name"),
            @Result(property = "dcount", column = "dcount"),
            @Result(property = "dzan", column = "dzan"),
            @Result(property = "dsta",column = "dsta"),
            @Result(property = "touimage",column = "touimage"),
    })
    List<Discuss> discussall(Integer music_id,Integer zan_user_id);


    @Insert("insert into discuss(discuss_user_id,discuss_content,discuss_music_id) values (#{discuss_user_id},#{discuss_content},#{discuss_music_id})")
    Integer insertdiscuss(Discuss discuss);

    @Delete("update discuss set discuss_status=0 where discuss_id=#{discuss_id}")
    Integer deletediscuss(Integer discuss_id);

    @Select("select (select t.touxiang_image from touxiang t,user u where t.touxiang_id=u.user_image_id and user_id=discuss_user_id) as touimage,u.user_id,u.user_name,d.discuss_content,d.discuss_date from discuss d,user u where d.discuss_user_id=u.user_id and d.discuss_id=#{discuss_id}")
            @Results({
            @Result(property = "user.user_id", column = "user_id"),
            @Result(property = "user.user_name", column = "user_name"),
            @Result(property = "discuss_content", column = "discuss_content"),
            @Result(property = "discuss_date", column = "discuss_date"),
            @Result(property = "touimage",column = "touimage"),
    })
    Discuss discussbyid(Integer discuss_id);

    //播放页面展示收藏状态和评论数量
    @Select("select (SELECT COUNT(*) from collect where collect_music_id=#{music_id} and collect_user_id=#{user_id}) as dzan,COUNT(*) as dcount FROM discuss where discuss_music_id=#{music_id} and discuss_status=1")
    @Results({
            @Result(property = "dcount", column = "dcount"),
            @Result(property = "dzan", column = "dzan"),
    })
    Discuss discussbyid2(Integer music_id,Integer user_id);
}
