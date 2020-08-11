package com.systop.demo.controller;

import com.systop.demo.pojo.Collect;
import com.systop.demo.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
@RestController
public class CollectController {
    @Autowired
    private CollectService collectservice;
    @RequestMapping(value ="/collectadd/{collect_user_id}/{collect_music_id}", method = RequestMethod.POST)
    public @ResponseBody Integer collectadd(@PathVariable("collect_user_id")Integer collect_user_id,@PathVariable("collect_music_id") Integer collect_music_id)throws Exception {
        Integer row=collectservice.conadd(collect_user_id,collect_music_id);
        return row;
    }
    @RequestMapping(value ="/collectdel/{collect_user_id}/{collect_music_id}", method = RequestMethod.POST)
    public @ResponseBody Integer collectdel(@PathVariable("collect_user_id")Integer collect_user_id,@PathVariable("collect_music_id") Integer collect_music_id)throws Exception {
        Integer row=collectservice.condel(collect_user_id,collect_music_id);
        return row;
    }
    @RequestMapping(value ="/collectsel/{collect_user_id}", method = RequestMethod.POST)
    public @ResponseBody List<Collect> collectsel(@PathVariable("collect_user_id")Integer collect_user_id)throws Exception {
        List<Collect> collect=collectservice.collectsel(collect_user_id);
        System.out.println(collect);
        return collect;
    }

    @RequestMapping(value ="/collects/{user_id}", method = RequestMethod.POST)
    public @ResponseBody Integer collects(@PathVariable("user_id")Integer user_id)throws Exception {
        Integer collects=collectservice.collects(user_id);
        return collects;
    }
}
