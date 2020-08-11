package com.systop.demo.controller;

import com.systop.demo.pojo.News;
import com.systop.demo.pojo.User;
import com.systop.demo.service.NewsService;
import com.systop.demo.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class NewsController {
    @Autowired
    public NewsService newsService;
    @PostMapping(value="/selectNewc/{user_id}")
    public Integer selectNewc(@PathVariable("user_id")Integer user_id){

        return newsService.selectNewsc(user_id);
    }
    @PostMapping(value="/Newsall/{user_id}")
    public List<News> Newsall(@PathVariable("user_id")Integer user_id){
        return newsService.Newsall(user_id);
    }
    @PostMapping(value="/Newsalls")
    public List<News> Newsalls(){
        return newsService.Newsalls();
    }
    @PostMapping(value="/newsupdate/{user_id}")
    public Integer newsupdate(@PathVariable("user_id")Integer user_id){
        return newsService.newsupdate(user_id);
    }
}
