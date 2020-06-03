package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "glhtprovider")
public interface glService {
    @RequestMapping("/span")
    String spancount();

    @GetMapping("/hello")
    String hello();
}
