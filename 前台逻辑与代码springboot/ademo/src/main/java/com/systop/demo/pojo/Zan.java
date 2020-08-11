package com.systop.demo.pojo;

public class Zan {
    private Integer zan_id;
    private Integer zan_user_id;
    private Integer zan_status;
    private Integer zan_music_id;
    private Integer zan_discuss_id;

    public Integer getZan_id() {
        return zan_id;
    }

    public void setZan_id(Integer zan_id) {
        this.zan_id = zan_id;
    }

    public Integer getZan_user_id() {
        return zan_user_id;
    }

    public void setZan_user_id(Integer zan_user_id) {
        this.zan_user_id = zan_user_id;
    }

    public Integer getZan_status() {
        return zan_status;
    }

    public void setZan_status(Integer zan_status) {
        this.zan_status = zan_status;
    }

    public Integer getZan_music_id() {
        return zan_music_id;
    }

    public void setZan_music_id(Integer zan_music_id) {
        this.zan_music_id = zan_music_id;
    }

    public Integer getZan_discuss_id() {
        return zan_discuss_id;
    }

    public void setZan_discuss_id(Integer zan_discuss_id) {
        this.zan_discuss_id = zan_discuss_id;
    }

    @Override
    public String toString() {
        return "Zan{" +
                "zan_id=" + zan_id +
                ", zan_user_id=" + zan_user_id +
                ", zan_status=" + zan_status +
                ", zan_music_id=" + zan_music_id +
                ", zan_discuss_id=" + zan_discuss_id +
                '}';
    }
}
