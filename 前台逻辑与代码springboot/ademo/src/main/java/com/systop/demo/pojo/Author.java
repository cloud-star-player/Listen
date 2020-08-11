package com.systop.demo.pojo;

public class Author {
    private Integer author_id;
    private String author_name;
    private String author_image;
    private int author_status;

    public String getAuthor_image() {
        return author_image;
    }

    public void setAuthor_image(String author_image) {
        this.author_image = author_image;
    }

    public int getAuthor_status() {
        return author_status;
    }

    public void setAuthor_status(int author_status) {
        this.author_status = author_status;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "author_id=" + author_id +
                ", author_name='" + author_name + '\'' +
                '}';
    }
}
