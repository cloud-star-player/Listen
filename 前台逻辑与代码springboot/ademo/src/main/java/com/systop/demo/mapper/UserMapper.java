package com.systop.demo.mapper;

import com.systop.demo.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    /**
     * 注册方法
     */
    @Insert("insert into user(user_code,user_password,user_name) values (#{user_code},#{user_password},#{user_name})")
    int register(String user_code, String user_password,String user_name);      //注册

    /**
     *
     * @param user_code 手机号
     * @return
     */
    @Select("select * from user where user_code=#{user_code}")
    User susercode(String user_code);

    /**
     *
     * @param user_password 密码
     * @return
     */
    @Select("select * from user where user_password=#{user_password}")
    User suserpassword(String user_password);

    /**
     *
     * @param user_name
     * @return
     */
    @Select("select * from user where user_name=#{user_name}")
    User susername(String user_name);
    /**
     *
     * @param user_code
     * @param user_password
     * @return
     */

    @Select("select * from user where user_code=#{user_code} and user_password=#{user_password}and user_state=1")
    User login(String user_code,String user_password);

    @Update("update user set user_password=#{user_password} where user_code=#{user_code} and user_state=1")
    Integer userupdate(String user_code,String user_password);

    @Select("select * from user")
    List<User> findUser();

    @Select("select u.user_name,t.touxiang_image from touxiang t,user u where t.touxiang_id=u.user_image_id and user_id=#{user_id}")
    @Results({
            @Result(property = "touxiang.touxiang_image", column = "touxiang_image"),
            @Result(property = "user_name", column = "user_name"),
    })
   User findUserall(Integer user_id);
}
