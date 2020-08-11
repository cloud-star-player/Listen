package com.systop.demo.mapper;

import com.systop.demo.pojo.Author;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AuthorMapper {
   @Select("select * from author where author_status=1")
   List<Author> authorall();
}
