package com.systop.demo.service.impl;

import com.systop.demo.mapper.AuthorMapper;
import com.systop.demo.pojo.Author;
import com.systop.demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorMapper authorMapper;
    @Override
    public List<Author> authorall() {
        return authorMapper.authorall();
    }
}
