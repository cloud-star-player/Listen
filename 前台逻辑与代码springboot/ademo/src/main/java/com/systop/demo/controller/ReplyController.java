package com.systop.demo.controller;

import com.systop.demo.pojo.Reply;
import com.systop.demo.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReplyController {
    @Autowired
    private ReplyService replyService;

    @RequestMapping(value ="/replyinsert/{content}/{user_id}/{dis_user_id}/{re_reply_id}/{discuss_id}")
    public @ResponseBody Integer insertreply(@PathVariable("content")String content,@PathVariable("user_id")Integer user_id,@PathVariable("dis_user_id")Integer dis_user_id,@PathVariable("re_reply_id")Integer re_reply_id,@PathVariable("discuss_id")Integer discuss_id){
        Reply reply=new Reply();
        reply.setReply_content(content);
        reply.setReply_dis_user_id(dis_user_id);
        reply.setReply_user_id(user_id);
        reply.setReply_reply_id(re_reply_id);
        reply.setReply_discuss_id(discuss_id);
        Integer row=replyService.insertreply(reply);
        return row;

    }
//
    @RequestMapping(value ="/replydelect/{id}", method = RequestMethod.POST)
    public @ResponseBody Integer userdeletefyid(@PathVariable("id")Integer id)throws Exception {
        Integer row=replyService.deletereply(id);
        return row;
    }

    @RequestMapping("/replyall/{id}/{zanry_user_id}")
    public @ResponseBody List<Reply> replyall(@PathVariable("id")Integer reply_discuss_id,@PathVariable("zanry_user_id")Integer zanry_user_id) {
        List <Reply> list=replyService.replyall(reply_discuss_id,zanry_user_id);
        return list;
    }
    @RequestMapping(value ="/replybyidcount/{id}", method = RequestMethod.POST)
    public @ResponseBody Integer replybyidcount(@PathVariable("id")Integer id)throws Exception {
        Integer row=replyService.replybyidcount(id);
        if (row==null){
            row=0;
        }
        return row;
    }

    @RequestMapping("/replybyid/{id}")
    public @ResponseBody List<Reply> replybyid(@PathVariable("id")Integer id) {
        List <Reply> list=replyService.replybyid(id);
        return list;
    }
    @RequestMapping(value ="/replyupdate/{id}", method = RequestMethod.POST)
    public @ResponseBody Integer replyupdate(@PathVariable("id")Integer id)throws Exception {
        Integer row=replyService.replyupdate(id);
        return row;
    }
}
