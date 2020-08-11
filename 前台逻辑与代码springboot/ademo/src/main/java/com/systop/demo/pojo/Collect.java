package com.systop.demo.pojo;

public class Collect {
    private Integer collect_id;
    private Integer collect_music_id;
    private Integer collect_user_id;
    private Music music;
    private Collect collect;
    private Author author;
    private Integer dcount;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getDcount() {
        return dcount;
    }

    public void setDcount(Integer dcount) {
        this.dcount = dcount;
    }

    public Collect getCollect() {
        return collect;
    }

    public void setCollect(Collect collect) {
        this.collect = collect;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public Integer getCollect_id() {
        return collect_id;
    }

    public void setCollect_id(Integer collect_id) {
        this.collect_id = collect_id;
    }

    public Integer getCollect_music_id() {
        return collect_music_id;
    }

    public void setCollect_music_id(Integer collect_music_id) {
        this.collect_music_id = collect_music_id;
    }

    public Integer getCollect_user_id() {
        return collect_user_id;
    }

    public void setCollect_user_id(Integer collect_user_id) {
        this.collect_user_id = collect_user_id;
    }

    @Override
    public String toString() {
        return "Collect{" +
                "collect_id=" + collect_id +
                ", collect_music_id=" + collect_music_id +
                ", collect_user_id=" + collect_user_id +
                '}';
    }
}
