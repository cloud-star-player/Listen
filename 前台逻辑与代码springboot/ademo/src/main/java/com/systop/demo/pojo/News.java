package com.systop.demo.pojo;

import java.util.Date;
import java.util.List;

public class News {
    private Integer news_id;
    private String news_text;
    private String news_title;
    private Integer news_readstate;
    private Integer news_state;
    private Date news_date;
    private Integer news_author_id;
    private Integer news_type;
    private String author_name;
    private Author author;

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    private List<Relationship> relationshipList;
    public Integer getNews_id() {
        return news_id;
    }

    public void setNews_id(Integer news_id) {
        this.news_id = news_id;
    }

    public String getNews_text() {
        return news_text;
    }

    public void setNews_text(String news_text) {
        this.news_text = news_text;
    }

    public String getNews_title() {
        return news_title;
    }

    public void setNews_title(String news_title) {
        this.news_title = news_title;
    }

    public Integer getNews_readstate() {
        return news_readstate;
    }

    public void setNews_readstate(Integer news_readstate) {
        this.news_readstate = news_readstate;
    }

    public Integer getNews_state() {
        return news_state;
    }

    public void setNews_state(Integer news_state) {
        this.news_state = news_state;
    }

    public Date getNews_date() {
        return news_date;
    }

    public void setNews_date(Date news_date) {
        this.news_date = news_date;
    }

    public Integer getNews_author_id() {
        return news_author_id;
    }

    public void setNews_author_id(Integer news_author_id) {
        this.news_author_id = news_author_id;
    }

    public Integer getNews_type() {
        return news_type;
    }

    public void setNews_type(Integer news_type) {
        this.news_type = news_type;
    }

    public List<Relationship> getRelationshipList() {
        return relationshipList;
    }

    public void setRelationshipList(List<Relationship> relationshipList) {
        this.relationshipList = relationshipList;
    }
}
