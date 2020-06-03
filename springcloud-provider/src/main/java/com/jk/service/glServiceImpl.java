package com.jk.service;

import com.jk.mapper.glMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class glServiceImpl implements glService {
    @Autowired
    private glMapper glMapper;
    @Override
    public String spancount() {
        return glMapper.spancount();
    }
}
