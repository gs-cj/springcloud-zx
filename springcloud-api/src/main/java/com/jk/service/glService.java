package com.jk.service;

import com.jk.model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@FeignClient(value = "glhtprovider")
public interface glService {


    @RequestMapping("/findRelevantCount")
    @ResponseBody
    String findRelevantCount();



    @RequestMapping("/findRelevant")
    @ResponseBody
    List<RelevantBean> findRelevant();


    @RequestMapping("/findProfession")
    @ResponseBody
    List<ProfeBean> findProfession();

    @RequestMapping("/findArea")
    @ResponseBody
    List<AreaBean> findArea();

    @RequestMapping("/findJob")
    @ResponseBody
    List<JobbBean> findJob();


    @RequestMapping("/findProfessionn")
    @ResponseBody
    List<ProfeBean> findProfessionn();


    @RequestMapping("/countjob")
    @ResponseBody
    String countjob();

    @RequestMapping("/findSheJobName")
    @ResponseBody
    List<ReceuBean> findSheJobName();

    @RequestMapping("/findjobbid")
    @ResponseBody
    ReceuBean findSheJobNamee(@RequestParam Integer id);

    @RequestMapping("/finareaid")
    @ResponseBody
    List<ReceuBean> finareaid(@RequestParam("id") Integer id);

    @RequestMapping("/finareaidd")
    @ResponseBody
    List<ReceuBean> finareaidd(@RequestParam("proid") Integer proid);


    @RequestMapping("/success")
    @ResponseBody
    UserModel Succ(@RequestParam("username") String username);

    @RequestMapping("/reg")
    @ResponseBody
    UserModel reg(@RequestParam("username") String username);

    @RequestMapping("/reg1")
    @ResponseBody
    void addUser(UserModel user);

    @RequestMapping("/phoneLogin")
    @ResponseBody
    UserModel fingName(@RequestParam String phone);




/*
   @RequestMapping("/savaMessage")
   @ResponseBody
   void savaMessage(MessageBean messageBean);
*/

}
