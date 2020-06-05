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



    @GetMapping("/hello")
    @Override
    public String hello() {
        return "访问";
    }

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


}
