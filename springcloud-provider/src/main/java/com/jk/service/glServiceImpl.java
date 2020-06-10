package com.jk.service;

import com.jk.mapper.glMapper;
import com.jk.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;




@Controller
public class glServiceImpl implements glService {
    @Autowired
    private glMapper glMapper;




    @RequestMapping("/findRelevantCount")
    @ResponseBody
    @Override
    public String findRelevantCount() {
        return glMapper.findRelevantCount();
    }

    @RequestMapping("/findRelevant")
    @ResponseBody
    @Override
    public List<RelevantBean> findRelevant() {
        return glMapper.findRelevant();
    }

    @RequestMapping("/findProfession")
    @ResponseBody
    @Override
    public List<ProfeBean> findProfession() {
        return glMapper.findProfession();
    }

    @RequestMapping("/findArea")
    @ResponseBody
    @Override
    public List<AreaBean> findArea() {
        return glMapper.findArea();
    }

    @RequestMapping("/findJob")
    @ResponseBody
    @Override
    public List<JobbBean> findJob() {
        return glMapper.findJob();
    }

    @RequestMapping("/findProfessionn")
    @ResponseBody
    @Override
    public List<ProfeBean> findProfessionn() {
        return glMapper.findProfessionn();
    }

    @RequestMapping("/countjob")
    @ResponseBody
    @Override
    public String countjob() {
        return glMapper.countjob();
    }

    @RequestMapping("/findSheJobName")
    @ResponseBody
    @Override
    public List<ReceuBean> findSheJobName() {
        return glMapper.findSheJobName();
    }

    @RequestMapping("/findjobbid")
    @ResponseBody
    public ReceuBean findSheJobNamee(Integer id) {
        return glMapper.findSheJobNamee(id);
    }

    @RequestMapping("/finareaid")
    @ResponseBody
    @Override
    public List<ReceuBean> finareaid(@RequestParam("id") Integer id) {
        return glMapper.finareaid(id);
    }


    @RequestMapping("/finareaidd")
    @ResponseBody
    @Override
    public List<ReceuBean> finareaidd(@RequestParam("proid") Integer proid) {
        return glMapper.finareaidd(proid);
    }

    @Override
    @RequestMapping("/success")
    @ResponseBody
    public UserModel Succ( @RequestParam("username")  String username) {
        return glMapper.Succ(username);
    }

    @Override
    @RequestMapping("/reg")
    @ResponseBody
    public UserModel reg( @RequestParam("username") String username) {
        return glMapper.reg(username);
    }
    @RequestMapping("/reg1")
    @ResponseBody
    public void addUser  (@RequestBody UserModel user) {
        glMapper.addUser(user);
    }

    @Override
    @RequestMapping("/phoneLogin")
    @ResponseBody
    public UserModel fingName(@RequestParam String phone) {
        return glMapper.fingName(phone);
    }


}

