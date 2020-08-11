package com.systop.demo.controller;

import com.systop.demo.pojo.Discuss;
import com.systop.demo.pojo.Music;
import com.systop.demo.pojo.Zan;
import com.systop.demo.service.DiscussService;
import com.systop.demo.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class DiscussController {
    @Autowired
    private DiscussService discussService;

    @RequestMapping(value ="/discussinsert/{content}/{user_id}/{music_id}")
    public @ResponseBody Integer insertdiscuss(@PathVariable("content")String content,@PathVariable("user_id")Integer user_id,@PathVariable("music_id")Integer music_id){
        Discuss discuss=new Discuss();
        discuss.setDiscuss_content(content);
        discuss.setDiscuss_music_id(music_id);
        discuss.setDiscuss_user_id(user_id);
        Integer row=discussService.insertdiscuss(discuss);
        return row;
    }

    @RequestMapping(value ="/discussdelect/{id}", method = RequestMethod.POST)
    public @ResponseBody Integer userdeletefyid(@PathVariable("id")Integer id)throws Exception {
        Integer row=discussService.deletediscuss(id);
        System.out.println(row+"dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        return row;
    }

    @RequestMapping("/discussall/{id}/{zan_user_id}")
    public @ResponseBody List<Discuss> discussall(@PathVariable("id")Integer music_id,@PathVariable("zan_user_id")Integer zan_user_id) {
        List <Discuss> list=discussService.discussall(music_id,zan_user_id);
        System.out.println(list+"zheshi");
        return list;
    }

    @RequestMapping("/discussbyid/{id}")
    public @ResponseBody Discuss discussbyid(@PathVariable("id")Integer discuss_id){
        Discuss discuss=discussService.discussbyid(discuss_id);
        return discuss;
    }


    //player.html使用
    @RequestMapping("/discussbyid2/{music_id}/{user_id}")
    public @ResponseBody Discuss discussbyid2(@PathVariable("music_id")Integer music_id,@PathVariable("user_id")Integer user_id){
        Discuss discuss=discussService.discussbyid2(music_id,user_id);
        return discuss;
    }
}
