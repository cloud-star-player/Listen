package com.systop.demo.controller;

import com.systop.demo.service.ZanService;
import com.systop.demo.service.ZanryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
public class ZanryController {
    @Autowired
    private ZanryService zanryservice;
    @RequestMapping(value ="/zanryadd/{zanry_user_id}/{zanry_reply_id}/{zanry_discuss_id}", method = RequestMethod.POST)
    public @ResponseBody Integer zanryadd(@PathVariable("zanry_user_id")Integer zanry_user_id,@PathVariable("zanry_reply_id") Integer zanry_reply_id, @PathVariable("zanry_discuss_id")Integer zanry_discuss_id)throws Exception {
        Integer row=zanryservice.zanryadd(zanry_user_id,zanry_reply_id,zanry_discuss_id);
        return row;
    }
    @RequestMapping(value ="/zanrydel/{zanry_user_id}/{zanry_reply_id}/{zanry_discuss_id}", method = RequestMethod.POST)
    public @ResponseBody Integer zanrydel(@PathVariable("zanry_user_id")Integer zanry_user_id,@PathVariable("zanry_reply_id") Integer zanry_reply_id, @PathVariable("zanry_discuss_id")Integer zanry_discuss_id)throws Exception {
        Integer row=zanryservice.zanrydel(zanry_user_id,zanry_reply_id,zanry_discuss_id);
        return row;
    }
}
