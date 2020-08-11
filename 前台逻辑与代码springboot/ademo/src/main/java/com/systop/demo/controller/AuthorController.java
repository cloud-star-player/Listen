package com.systop.demo.controller;

import com.systop.demo.pojo.Author;
import com.systop.demo.service.AuthorService;
import com.systop.demo.service.ZanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 *
 */
@RestController
public class AuthorController {
    @Autowired
    private AuthorService authorservice;
    @RequestMapping(value ="/authorall", method = RequestMethod.POST)
    public @ResponseBody List<Author> authorall(){
        List<Author> author =authorservice.authorall();
        return author;
    }

    @RequestMapping("/AuthorShowImage/{picName}")
    public void sicShow(HttpServletRequest request, HttpServletResponse response, @PathVariable String picName) throws IOException {

        String filePath = "D:\\upload/author/";
        String imagePath =filePath+picName;

        response.reset();
        //判断文件是否存在
        File file = new File(imagePath);
        if (!file.exists()) {
            imagePath =picName+filePath;
        }
        // 得到输出流
        OutputStream output = response.getOutputStream();
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
