package com.systop.demo.service.impl;

import com.systop.demo.mapper.ReplyMapper;
import com.systop.demo.pojo.Reply;
import com.systop.demo.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReplyServiceImpl implements ReplyService {
    @Autowired
    private ReplyMapper replyMapper;
    @Override
    public List<Reply> replyall(Integer reply_discuss_id, Integer zanry_user_id) {
        return replyMapper.replyall(reply_discuss_id,zanry_user_id);
    }

    @Override
    public Integer insertreply(Reply reply) {
        return replyMapper.insertreply(reply);
    }

    @Override
    public Integer deletereply(Integer reply_id) {
        return replyMapper.deletereply(reply_id);
    }

    @Override
    public Integer replybyidcount(Integer user_id) {
        return replyMapper.replybyidcount(user_id);
    }

    @Override
    public List<Reply> replybyid(Integer user_id) {
        return replyMapper.replybyid(user_id);
    }

    @Override
    public Integer replyupdate(Integer user_id) {
        return replyMapper.replyupdate(user_id);
    }
}
