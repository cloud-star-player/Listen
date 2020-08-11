package com.systop.demo.mapper;

import com.systop.demo.pojo.Discuss;
import com.systop.demo.pojo.Reply;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ReplyMapper {
    /**
     * dcount回复数
     * @param
     * @return
     */
    @Select("select (select t.touxiang_image from touxiang t,user u where t.touxiang_id=u.user_image_id and user_id=reply_user_id) as touimage,(select COUNT(*) from zanry where zanry_discuss_id=r.reply_discuss_id and zanry_reply_id=reply_id GROUP BY u.user_id) as dzanry,r.reply_id,r.reply_user_id,(select count(*) from zanry where zanry_user_id=#{zanry_user_id} and zanry_discuss_id=r.reply_discuss_id and zanry_reply_id=reply_id) as dsta,r.reply_reply_id,u.user_name,r.reply_content,r.reply_date,(select user_name from user where user_id=reply_dis_user_id)as replyname,(select reply_content from reply where reply_id=r.reply_reply_id) as replycontent from reply r,user u where u.user_id=r.reply_user_id and reply_status=1 and reply_discuss_id=${reply_discuss_id} GROUP BY reply_id")
    @Results({
            @Result(property = "dzanry", column = "dzanry"),   //赞总数
            @Result(property = "reply_id",column ="reply_id"),
            @Result(property = "reply_user_id",column = "reply_user_id"),
            @Result(property = "dsta", column = "dsta"),                  //赞状态
            @Result(property = "reply_reply_id", column = "reply_reply_id"),
            @Result(property = "user.user_name", column = "user_name"),
            @Result(property = "reply_content", column = "reply_content"),
            @Result(property = "reply_date", column = "reply_date"),
            @Result(property = "replyname", column = "replyname"),
            @Result(property = "replycontent", column = "replycontent"),
            @Result(property = "touimage",column = "touimage"),

    })
    List<Reply> replyall(Integer reply_discuss_id,Integer zanry_user_id);


    @Insert("insert into reply(reply_user_id,reply_content,reply_dis_user_id,reply_reply_id,reply_discuss_id) values (#{reply_user_id},#{reply_content},#{reply_dis_user_id},#{reply_reply_id},#{reply_discuss_id})")
    Integer insertreply(Reply reply);

    @Update("update reply set reply_status=0 where reply_id=#{reply_id}")
    Integer deletereply(Integer reply_id);



    //在news中显示回复数
    @Select("select COUNT(*) from reply r,user u where u.user_id=r.reply_user_id and reply_status=1 and reply_read_status=0 and reply_dis_user_id=#{user_id} and reply_read_status=0")
    Integer replybyidcount(Integer user_id);
   //阅读后去掉数字
    @Update("update reply set reply_read_status=1 where reply_dis_user_id=#{user_id} and reply_read_status=0")
    Integer replyupdate(Integer user_id);

    //在news中显示回复内容
    @Select("select (select t.touxiang_image from touxiang t,user u where t.touxiang_id=u.user_image_id and user_id=reply_user_id) as touimage,r.reply_id,r.reply_reply_id,u.user_name,r.reply_content,r.reply_date,(select user_name from user where user_id=reply_dis_user_id)as replyname,(select reply_content from reply where reply_id=r.reply_reply_id) as replycontent from reply r,user u where u.user_id=r.reply_user_id and reply_status=1 and reply_dis_user_id=#{user_id} GROUP BY reply_id")
    @Results({
            @Result(property = "reply_id",column ="reply_id"),
            @Result(property = "reply_user_id",column = "reply_user_id"),
            @Result(property = "reply_reply_id", column = "reply_reply_id"),
            @Result(property = "user.user_name", column = "user_name"),
            @Result(property = "reply_content", column = "reply_content"),
            @Result(property = "reply_date", column = "reply_date"),
            @Result(property = "touimage",column = "touimage"),

    })
    List<Reply> replybyid(Integer user_id);
}
