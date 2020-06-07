package com.jk.service;

import com.jk.mapper.glMapper;
import com.jk.model.MessageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class glServiceImpl implements glService {
    @Autowired
    private glMapper glmapper;


    @Override
    public String spancount() {
        return null;
    }

    @GetMapping("/hello")
    @ResponseBody
    @Override
    public String hello() {
        return "访问";
    }

    @RequestMapping("/savaMessage")
    @ResponseBody
    @Override
    public void savaMessage(@RequestBody MessageBean messageBean) {
        glmapper.savaMessage(messageBean);
    }
}
