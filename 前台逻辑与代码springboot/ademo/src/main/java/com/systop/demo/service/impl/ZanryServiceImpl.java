package com.systop.demo.service.impl;

import com.systop.demo.mapper.ZanryMapper;
import com.systop.demo.service.ZanryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ZanryServiceImpl implements ZanryService {
    @Autowired
    private ZanryMapper zanryMapper;
    @Override
    public int zanryadd(Integer zanry_user_id, Integer zanry_reply_id, Integer zanry_discuss_id) {
        return zanryMapper.zanryadd(zanry_user_id,zanry_reply_id,zanry_discuss_id);
    }

    @Override
    public int zanrydel(Integer zanry_user_id, Integer zanry_reply_id, Integer zanry_discuss_id) {
        return zanryMapper.zanrydel(zanry_user_id,zanry_reply_id,zanry_discuss_id);
    }
}
