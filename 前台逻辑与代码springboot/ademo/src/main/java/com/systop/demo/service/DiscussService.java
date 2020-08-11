package com.systop.demo.service;

import com.systop.demo.pojo.Discuss;
import com.systop.demo.pojo.Zan;

import java.util.List;

public interface DiscussService {
    List<Discuss> discussall(Integer music_id,Integer zan_user_id);

    Integer insertdiscuss(Discuss discuss);

    Integer deletediscuss(Integer discuss_user_id);

    Discuss discussbyid(Integer discuss_id);
    Discuss discussbyid2(Integer music_id,Integer user_id);

//    Zan yzan(Integer zan_user_id, Integer zan_discuss_id);
}
