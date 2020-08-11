package com.systop.demo.service;

public interface ZanryService {
    int zanryadd(Integer zanry_user_id, Integer zanry_reply_id, Integer zanry_discuss_id);
    int zanrydel(Integer zanry_user_id, Integer zanry_reply_id, Integer zanry_discuss_id);
}
