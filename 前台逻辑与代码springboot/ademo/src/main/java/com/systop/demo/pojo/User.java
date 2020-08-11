package com.systop.demo.pojo;

import lombok.Data;

import java.util.Date;

@Data            //生成getter setter
public class User {
    private Integer user_id;
    private String user_name;
    private String user_code;
    private String user_password;
    private Integer user_state;
    private Date user_date;
    private TouXiang touxiang;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Integer getUser_state() {
        return user_state;
    }

    public void setUser_state(Integer user_state) {
        this.user_state = user_state;
    }

    public Date getUser_date() {
        return user_date;
    }

    public void setUser_date(Date user_date) {
        this.user_date = user_date;
    }

    public TouXiang getTouxiang() {
        return touxiang;
    }

    public void setTouxiang(TouXiang touxiang) {
        this.touxiang = touxiang;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_code='" + user_code + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_state=" + user_state +
                ", user_date=" + user_date +
                ", touxiang=" + touxiang +
                '}';
    }
}
