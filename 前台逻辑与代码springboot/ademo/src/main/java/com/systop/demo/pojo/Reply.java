package com.systop.demo.pojo;

import java.util.Date;

public class Reply {
    private Integer reply_id;
    private Integer reply_user_id;
    private Integer reply_dis_user_id;            //被回复id
    private String reply_content;
    private Date reply_date;
    private Integer reply_reply_id;
    private Integer reply_discuss_id;
    private int dzanry;                   //点赞数
    private int dsta;
    private String replyname;             //回复人名
    private String replycontent;          //回复内容
    private User user;
    private TouXiang touXiang;
    private String touimage;
    private Integer reply_read_status;  //0未读1已读
    public String getTouimage() {
        return touimage;
    }

    public void setTouimage(String touimage) {
        this.touimage = touimage;
    }

    public TouXiang getTouXiang() {
        return touXiang;
    }

    public void setTouXiang(TouXiang touXiang) {
        this.touXiang = touXiang;
    }

    public Integer getReply_id() {
        return reply_id;
    }

    public void setReply_id(Integer reply_id) {
        this.reply_id = reply_id;
    }

    public Integer getReply_user_id() {
        return reply_user_id;
    }

    public void setReply_user_id(Integer reply_user_id) {
        this.reply_user_id = reply_user_id;
    }

    public Integer getReply_dis_user_id() {
        return reply_dis_user_id;
    }

    public void setReply_dis_user_id(Integer reply_dis_user_id) {
        this.reply_dis_user_id = reply_dis_user_id;
    }

    public String getReply_content() {
        return reply_content;
    }

    public void setReply_content(String reply_content) {
        this.reply_content = reply_content;
    }

    public Date getReply_date() {
        return reply_date;
    }

    public void setReply_date(Date reply_date) {
        this.reply_date = reply_date;
    }

    public int getDzanry() {
        return dzanry;
    }

    public void setDzanry(int dzanry) {
        this.dzanry = dzanry;
    }

    public String getReplyname() {
        return replyname;
    }

    public void setReplyname(String replyname) {
        this.replyname = replyname;
    }

    public String getReplycontent() {
        return replycontent;
    }

    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getDsta() {
        return dsta;
    }

    public void setDsta(int dsta) {
        this.dsta = dsta;
    }

    public Integer getReply_reply_id() {
        return reply_reply_id;
    }

    public void setReply_reply_id(Integer reply_reply_id) {
        this.reply_reply_id = reply_reply_id;
    }

    public Integer getReply_discuss_id() {
        return reply_discuss_id;
    }

    public void setReply_discuss_id(Integer reply_discuss_id) {
        this.reply_discuss_id = reply_discuss_id;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "reply_id=" + reply_id +
                ", reply_user_id=" + reply_user_id +
                ", reply_dis_user_id=" + reply_dis_user_id +
                ", reply_content='" + reply_content + '\'' +
                ", reply_date=" + reply_date +
                ", reply_reply_id=" + reply_reply_id +
                ", reply_discuss_id=" + reply_discuss_id +
                ", dzanry=" + dzanry +
                ", dsta=" + dsta +
                ", replyname='" + replyname + '\'' +
                ", replycontent='" + replycontent + '\'' +
                ", user=" + user +
                ", touXiang=" + touXiang +
                '}';
    }
}
