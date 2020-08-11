package com.systop.demo.pojo;

import java.util.Date;

public class Discuss {
    private Integer discuss_id;
    private Integer discuss_user_id;
    private Integer discuss_music_id;
    private String discuss_user_image;
    private int dcount;
    private int dzan;
    private int dsta;
    private int collects;
    private Date discuss_date;
    private String discuss_content;
    private User user;
    private Music music;
    private TouXiang touXiang;
    private String touimage;

    public int getCollects() {
        return collects;
    }

    public void setCollects(int collects) {
        this.collects = collects;
    }

    public String getTouimage() {
        return touimage;
    }

    public void setTouimage(String touimage) {
        this.touimage = touimage;
    }

    public Integer getDiscuss_id() {
        return discuss_id;
    }

    public void setDiscuss_id(Integer discuss_id) {
        this.discuss_id = discuss_id;
    }

    public Integer getDiscuss_user_id() {
        return discuss_user_id;
    }

    public void setDiscuss_user_id(Integer discuss_user_id) {
        this.discuss_user_id = discuss_user_id;
    }

    public Integer getDiscuss_music_id() {
        return discuss_music_id;
    }

    public void setDiscuss_music_id(Integer discuss_music_id) {
        this.discuss_music_id = discuss_music_id;
    }

    public String getDiscuss_user_image() {
        return discuss_user_image;
    }

    public void setDiscuss_user_image(String discuss_user_image) {
        this.discuss_user_image = discuss_user_image;
    }

    public String getDiscuss_content() {
        return discuss_content;
    }

    public void setDiscuss_content(String discuss_content) {
        this.discuss_content = discuss_content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public Date getDiscuss_date() {
        return discuss_date;
    }

    public void setDiscuss_date(Date discuss_date) {
        this.discuss_date = discuss_date;
    }

    public int getDcount() {
        return dcount;
    }

    public void setDcount(int dcount) {
        this.dcount = dcount;
    }

    public int getDzan() {
        return dzan;
    }

    public void setDzan(int dzan) {
        this.dzan = dzan;
    }

    public int getDsta() {
        return dsta;
    }

    public void setDsta(int dsta) {
        this.dsta = dsta;
    }

    public TouXiang getTouXiang() {
        return touXiang;
    }

    public void setTouXiang(TouXiang touXiang) {
        this.touXiang = touXiang;
    }

    @Override
    public String toString() {
        return "Discuss{" +
                "discuss_id=" + discuss_id +
                ", discuss_user_id=" + discuss_user_id +
                ", discuss_music_id=" + discuss_music_id +
                ", discuss_user_image='" + discuss_user_image + '\'' +
                ", dcount=" + dcount +
                ", dzan=" + dzan +
                ", dsta=" + dsta +
                ", discuss_date=" + discuss_date +
                ", discuss_content='" + discuss_content + '\'' +
                ", user=" + user +
                ", music=" + music +
                ", touXiang=" + touXiang +
                '}';
    }
}
