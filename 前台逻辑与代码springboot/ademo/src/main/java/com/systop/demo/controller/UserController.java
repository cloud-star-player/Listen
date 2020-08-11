package com.systop.demo.controller;

import com.systop.demo.pojo.User;
import com.systop.demo.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.security.MessageDigest;
import java.util.List;

/**
 *
 */
@RestController
public class UserController {
    @Autowired
    Userservice userservice;
    @PostMapping(value = "/register/{user_code}/{user_password}/{user_name}")
    public @ResponseBody Integer register(@PathVariable("user_code") String user_code, @PathVariable("user_password") String user_password,@PathVariable("user_name") String user_name){
        Integer r=null;
        user_password=MD5(user_password);
        User a=userservice.susercode(user_code);
        User b=userservice.suserpassword(user_password);
        User c=userservice.susername(user_name);
        if (a!=null){
            System.out.println(a+"as");
            r=2;
        }
        else if(b!=null){
            System.out.println(b+"bs");
            r=3;
        }
        else if(c!=null){
            System.out.println(c+"cs");
            r=4;
        }
        else if(a==null&&b==null&&c==null){
            r = userservice.register(user_code, user_password,user_name);
        }
        return r;
    }

    @RequestMapping(value = "/user/{user_code}/{user_password}", method = RequestMethod.POST)
    public @ResponseBody
    User selectUser(@PathVariable("user_code") String user_code, @PathVariable("user_password") String user_password, HttpSession session) throws Exception {
        user_password=MD5(user_password);
        User a = userservice.login(user_code, user_password);
        System.out.println(a);
        return a;
    }
    public static String MD5(String inStr) {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        }catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }
        char[] charArray = inStr.toCharArray();
        byte[] byteArray = new byte[charArray.length];
        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }
    @PostMapping(value = "/userupdate/{user_code}/{user_password}/{user_sxinpassword}")
    public @ResponseBody Integer userupdate(@PathVariable("user_code") String user_code, @PathVariable("user_password") String user_password,@PathVariable("user_sxinpassword") String user_sxinpassword){
        Integer i=1;
        user_password=MD5(user_password);
        System.out.println(user_code+"a");
        System.out.println(user_sxinpassword+"b");
        System.out.println(user_password+"c");
        User a = userservice.login(user_code, user_password);
        if (a==null){
            i=0;
        }
        else{
            Integer b = userservice.userupdate(user_code,user_sxinpassword);
            if(b<=0){
                i=2;
            }
        }
        return i;
    }

    @GetMapping("/findUser")
    public List<User> findUser(){
        return userservice.findUser();
    }

    @PostMapping(value = "/findUserall/{user_id}")
    public @ResponseBody User findUserall(@PathVariable("user_id")Integer user_id){
        return  userservice.findUserall(user_id);
    }


}
