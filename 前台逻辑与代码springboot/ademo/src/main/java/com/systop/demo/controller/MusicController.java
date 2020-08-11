package com.systop.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.systop.demo.pojo.Music;
import com.systop.demo.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

@RestController
public class MusicController {
    @Autowired
    private MusicService musicService;


    @RequestMapping("/musicall")
    public @ResponseBody List<Music> musicall() {
        List <Music> list=musicService.musicall();
        return list;
    }
    @RequestMapping(value ="/ShowImage/{picName}", method = RequestMethod.GET)
    public void picShow(HttpServletRequest request, HttpServletResponse response,@PathVariable String picName) throws IOException {
        System.out.println(picName);

        String filePath = "D:\\upload/image/";
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

//    音乐文件
    @RequestMapping("/ShowMusic/{sicName}")
    public void sicShow(HttpServletRequest request, HttpServletResponse response,@PathVariable String sicName) throws IOException {

        String filePath = "D:\\upload/music/";
        String imagePath =filePath+sicName;

        response.reset();
        //判断文件是否存在
        File file = new File(imagePath);
        if (!file.exists()) {
            imagePath =sicName+filePath;
        }
        // 得到输出流
        OutputStream output = response.getOutputStream();
        FileInputStream is = new FileInputStream(new File(imagePath));
        int i = is.available(); // 得到文件大小
        byte data[] = new byte[i];
        is.read(data); // 读数据
        is.close();
        response.setContentType("audio/*"); // 设置返回的文件类型
        OutputStream toClient = response.getOutputStream(); // 得到向客户端输出二进制数据的对象
        toClient.write(data); // 输出数据
        toClient.close();
    }

    @RequestMapping("/musicbyid/{id}/{id2}")                       //根据id音乐播放
    public @ResponseBody Music musicbyid(@PathVariable("id")Integer music_id,@PathVariable("id2")Integer user_id){
        Music music=musicService.musicbyid(music_id,user_id);
        System.out.println(music);
        return music;
    }

    @RequestMapping("/umusic_id/{music_id}")
    public @ResponseBody Integer umusic_id(@PathVariable("music_id")Integer music_id){
        Integer umusic_id=musicService.umusic_id(music_id);
        System.out.println(umusic_id);
        return umusic_id;
    }
    @RequestMapping("/bmusic_id/{music_id}")
    public @ResponseBody Integer bmusic_id(@PathVariable("music_id")Integer music_id){
        Integer bmusic_id=musicService.bmusic_id(music_id);
        System.out.println(bmusic_id);
        return bmusic_id;
    }
    @RequestMapping("/musicyuke/{type}")               //乐库
    public @ResponseBody List<Music> musicyuke(@PathVariable("type")Integer type) {
        List <Music> list=musicService.musicyuke(type);
        return list;
    }

    @RequestMapping("/soumusic/{name}")               //搜索
    public @ResponseBody List<Music> soumusic(@PathVariable("name")String name) {
        List <Music> list=musicService.soumusic(name);
        return list;
    }


    @RequestMapping("/hotup/{music_id}")               //加热度
    public @ResponseBody Integer hotup(@PathVariable("music_id")Integer music_id) {
        Integer row=musicService.hotup(music_id);
        return row;
    }
    @RequestMapping("/musichot")               //搜索
    public @ResponseBody List<Music> musichot() {
        List <Music> list=musicService.musichot();
        return list;
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
