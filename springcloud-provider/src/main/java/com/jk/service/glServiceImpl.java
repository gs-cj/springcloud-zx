package com.jk.service;

import com.jk.mapper.glMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Controller
public class glServiceImpl implements glService {
    @Autowired
    private glMapper glMapper;



    @GetMapping("/hello")
    @Override
    public String hello() {
        return "访问";
    }
}
