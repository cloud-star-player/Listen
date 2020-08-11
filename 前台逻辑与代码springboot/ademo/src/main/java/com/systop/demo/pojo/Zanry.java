package com.systop.demo.pojo;

public class Zanry {
    private Integer zanry_id;
    private Integer zanry_user_id;
    private Integer zanry_status;
    private Integer zanry_reply_id;
    private Integer zanry_discuss_id;

    public Integer getZanry_id() {
        return zanry_id;
    }

    public void setZanry_id(Integer zanry_id) {
        this.zanry_id = zanry_id;
    }

    public Integer getZanry_user_id() {
        return zanry_user_id;
    }

    public void setZanry_user_id(Integer zanry_user_id) {
        this.zanry_user_id = zanry_user_id;
    }

    public Integer getZanry_status() {
        return zanry_status;
    }

    public void setZanry_status(Integer zanry_status) {
        this.zanry_status = zanry_status;
    }

    public Integer getZanry_reply_id() {
        return zanry_reply_id;
    }

    public void setZanry_reply_id(Integer zanry_reply_id) {
        this.zanry_reply_id = zanry_reply_id;
    }

    public Integer getZanry_discuss_id() {
        return zanry_discuss_id;
    }

    public void setZanry_discuss_id(Integer zanry_discuss_id) {
        this.zanry_discuss_id = zanry_discuss_id;
    }

    @Override
    public String toString() {
        return "Zanry{" +
                "zanry_id=" + zanry_id +
                ", zanry_user_id=" + zanry_user_id +
                ", zanry_status=" + zanry_status +
                ", zanry_reply_id=" + zanry_reply_id +
                ", zanry_discuss_id=" + zanry_discuss_id +
                '}';
    }
}
