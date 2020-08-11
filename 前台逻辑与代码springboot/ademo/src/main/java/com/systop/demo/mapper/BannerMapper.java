package com.systop.demo.mapper;


import com.systop.demo.pojo.Banner;
import com.systop.demo.pojo.Music;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BannerMapper {
    //主页展示
    @Select("select * from banner where banner_state=1 ORDER BY banner_weizhi limit 0,5")
    List<Banner> bannerall();
}
