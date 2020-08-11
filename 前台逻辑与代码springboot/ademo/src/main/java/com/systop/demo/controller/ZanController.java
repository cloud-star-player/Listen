package com.systop.demo.controller;

import com.systop.demo.pojo.User;
import com.systop.demo.service.Userservice;
import com.systop.demo.service.ZanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 *
 */
@RestController
public class ZanController {
    @Autowired
    private ZanService zanservice;
    @RequestMapping(value ="/zanadd/{zan_user_id}/{zan_music_id}/{zan_discuss_id}", method = RequestMethod.POST)
    public @ResponseBody Integer zanadd(@PathVariable("zan_user_id")Integer zan_user_id,@PathVariable("zan_music_id") Integer zan_music_id, @PathVariable("zan_discuss_id")Integer zan_discuss_id)throws Exception {
        Integer row=zanservice.zanadd(zan_user_id,zan_music_id,zan_discuss_id);
        return row;
    }
    @RequestMapping(value ="/zandel/{zan_user_id}/{zan_music_id}/{zan_discuss_id}", method = RequestMethod.POST)
    public @ResponseBody Integer zandel(@PathVariable("zan_user_id")Integer zan_user_id,@PathVariable("zan_music_id") Integer zan_music_id, @PathVariable("zan_discuss_id")Integer zan_discuss_id)throws Exception {
        Integer row=zanservice.zandel(zan_user_id,zan_music_id,zan_discuss_id);
        return row;
    }
}
