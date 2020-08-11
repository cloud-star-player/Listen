package com.systop.demo.service.impl;

import com.systop.demo.mapper.NewsMapper;
import com.systop.demo.pojo.News;
import com.systop.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NewsServiceImpl implements NewsService{
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public Integer selectNewsc(Integer user_id) {
        return newsMapper.selectNewsc(user_id);
    }

    @Override
    public List<News> Newsall(Integer user_id) {
        return newsMapper.Newsall(user_id);
    }

    @Override
    public Integer newsupdate(Integer user_id) {
        return newsMapper.newsupdate(user_id);
    }

    @Override
    public List<News> Newsalls() {
        return newsMapper.Newsalls();
    }

}
