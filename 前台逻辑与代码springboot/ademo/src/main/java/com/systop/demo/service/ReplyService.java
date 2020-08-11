package com.systop.demo.service;

import com.systop.demo.pojo.Reply;

import java.util.List;

public interface ReplyService {
    List<Reply> replyall(Integer reply_discuss_id,Integer zanry_user_id);
    Integer insertreply(Reply reply);
    Integer deletereply(Integer reply_id);
    Integer replybyidcount(Integer user_id);
    List<Reply> replybyid(Integer user_id);
    Integer replyupdate(Integer user_id);
}
