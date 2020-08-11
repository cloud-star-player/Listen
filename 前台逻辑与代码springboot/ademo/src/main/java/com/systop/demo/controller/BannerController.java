package com.systop.demo.controller;

import com.systop.demo.pojo.Banner;
import com.systop.demo.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

@RestController
public class BannerController {
    @Autowired
    private BannerService bannerservice;

    @RequestMapping(value ="/bannerall", method = RequestMethod.POST)
    public @ResponseBody List<Banner> authorall(){
        List<Banner> banner =bannerservice.bannerall();
        return banner;
    }
    @RequestMapping(value ="/BannerShowImage/{picName}", method = RequestMethod.GET)
    public void picShow(HttpServletRequest request, HttpServletResponse response, @PathVariable String picName) throws IOException {
        System.out.println(picName);

        String filePath = "D:\\upload/banner/";
        String imagePath =filePath+picName;
        response.reset();
        //判断文件是否存在
        File file = new File(imagePath);
        if (!file.exists()) {
            imagePath =filePath+picName;
        }

        FileInputStream is = new FileInputStream(new File(imagePath));
        int i = is.available(); // 得到文件大小
        byte data[] = new byte[i];
        is.read(data); // 读数据
        is.close();
        response.setContentType("image/*"); // 设置返回的文件类型
        OutputStream toClient = response.getOutputStream(); // 得到向客户端输出二进制数据的对象
        toClient.write(data); // 输出数据
        toClient.close();

    }
}
