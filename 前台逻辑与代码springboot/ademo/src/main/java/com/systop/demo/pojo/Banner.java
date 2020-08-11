package com.systop.demo.pojo;

public class Banner {
    private Integer banner_weizhi;
    private String banner_image;
    private String banner_name;
    private Integer banner_state;

    public Integer getBanner_weizhi() {
        return banner_weizhi;
    }

    public void setBanner_weizhi(Integer banner_weizhi) {
        this.banner_weizhi = banner_weizhi;
    }

    public String getBanner_image() {
        return banner_image;
    }

    public void setBanner_image(String banner_image) {
        this.banner_image = banner_image;
    }

    public String getBanner_name() {
        return banner_name;
    }

    public void setBanner_name(String banner_name) {
        this.banner_name = banner_name;
    }

    public Integer getBanner_state() {
        return banner_state;
    }

    public void setBanner_state(Integer banner_state) {
        this.banner_state = banner_state;
    }

    @Override
    public String toString() {
        return "Banner{" +
                "banner_weizhi=" + banner_weizhi +
                ", banner_image='" + banner_image + '\'' +
                ", banner_name='" + banner_name + '\'' +
                ", banner_state=" + banner_state +
                '}';
    }
}
