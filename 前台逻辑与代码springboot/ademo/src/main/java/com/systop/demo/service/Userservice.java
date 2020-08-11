package com.systop.demo.service;

import com.systop.demo.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Userservice {
    /**
     *
     * @param user_code
     * @param user_password
     * @param user_name
     * @return
     */
    int register(String user_code,String user_password,String user_name);

    User susercode(String user_code);

    User suserpassword(String user_password);

    User susername(String user_name);

    Integer userupdate(String user_code,String user_password);
    /**
     *登录
     * @param user_code 用户名
     * @param user_password 密码
     * @return
     */
    User login(String user_code,String user_password);

    /**
     * 查询所有
     * @return
     */
    List<User> findUser();
    User findUserall(Integer user_id);


}
