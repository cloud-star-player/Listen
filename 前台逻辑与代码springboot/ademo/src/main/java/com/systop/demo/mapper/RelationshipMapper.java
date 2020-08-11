package com.systop.demo.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

public interface RelationshipMapper {
    @Insert("insert into relationship(relationship_user_id,relationship_author_id) values(#{relationship_user_id},#{relationship_author_id})")
    int readd(Integer relationship_user_id,Integer relationship_author_id);
    //取消
    @Delete("delete from relationship where relationship_user_id=#{relationship_user_id} and relationship_author_id=#{relationship_author_id}")
    int redel(Integer relationship_user_id,Integer relationship_author_id);
}
