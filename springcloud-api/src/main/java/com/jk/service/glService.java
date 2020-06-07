package com.jk.service;

import com.jk.model.MessageBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(value = "glhtprovider")
public interface glService {
    @RequestMapping("/span")
    String spancount();

   @GetMapping("/hello")
    String hello();


   @RequestMapping("/savaMessage")
   @ResponseBody
   void savaMessage(MessageBean messageBean);
}
