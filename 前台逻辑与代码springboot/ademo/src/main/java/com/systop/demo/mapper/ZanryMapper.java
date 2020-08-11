package com.systop.demo.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

public interface ZanryMapper {
    //点赞
    @Insert("insert into zanry(zanry_user_id,zanry_reply_id,zanry_discuss_id) values(#{zanry_user_id},#{zanry_reply_id},#{zanry_discuss_id})")
    int zanryadd(Integer zanry_user_id, Integer zanry_reply_id, Integer zanry_discuss_id);

    @Delete("delete from zanry where zanry_user_id=#{zanry_user_id} and zanry_reply_id=#{zanry_reply_id} and zanry_discuss_id=#{zanry_discuss_id}")
    int zanrydel(Integer zanry_user_id, Integer zanry_reply_id, Integer zanry_discuss_id);
}
