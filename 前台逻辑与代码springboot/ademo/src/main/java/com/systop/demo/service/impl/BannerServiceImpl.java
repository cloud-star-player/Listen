package com.systop.demo.service.impl;

import com.systop.demo.mapper.BannerMapper;
import com.systop.demo.pojo.Banner;
import com.systop.demo.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerMapper bannerMapper;
    @Override
    public List<Banner> bannerall() {
        return bannerMapper.bannerall();
    }
}
