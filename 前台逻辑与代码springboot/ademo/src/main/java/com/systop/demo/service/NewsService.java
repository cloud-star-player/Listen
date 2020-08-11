package com.systop.demo.service;

import com.systop.demo.pojo.News;

import java.util.List;

public interface NewsService {
   public Integer selectNewsc(Integer user_id);
   public List<News> Newsall(Integer user_id);
   public Integer newsupdate(Integer user_id);
   public List<News> Newsalls();
}
