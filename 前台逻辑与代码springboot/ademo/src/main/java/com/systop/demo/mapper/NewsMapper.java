package com.systop.demo.mapper;

import com.systop.demo.pojo.News;
import com.systop.demo.pojo.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface NewsMapper {

    @Select("select user_readcount from user where user_id=${user_id}")
    Integer selectNewsc(@Param(value = "user_id")Integer user_id);
    @Select("select * from news where news_state=1 and news_author_id in (select relationship_author_id FROM relationship WHERE relationship_user_id=#{user_id})")
    List<News> Newsall(@Param(value = "user_id")Integer user_id);
    //首页展示
    @Select("select * from news n,author a where n.news_state=1 and n.news_author_id=a.author_id ORDER BY n.news_id desc")
    @Results({
            @Result(property = "news_id", column = "news_id"),
            @Result(property = "news_text", column = "news_text"),
            @Result(property = "news_title", column = "news_title"),
            @Result(property = "author.author_name", column = "author_name"),
            @Result(property = "author.author_image", column = "author_image"),
    })
    List<News> Newsalls();
    //阅读后去掉数字
    @Update("update user set user_readcount=0 where user_id=${user_id}")
    Integer newsupdate(@Param(value = "user_id")Integer user_id);
}
