package com.jk.controller;

import com.jk.model.MessageBean;
import com.jk.service.glService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ZXController {
    @Autowired
    private glService glService;
    //测试
    @GetMapping("/hello")
    public String hello(){
        return glService.hello();
    }

    //跳转首页
    @RequestMapping("/toMainn")
    public String toMain(){
        return "index";
    }

    //跳转校园招聘
    @RequestMapping("/toCmpus")
    public String toCmpus(){
        return "campus-recruitment";
    }

    //跳转研发页面
    @RequestMapping("/toDevelopment")
    public String development(){
        return "development";
    }
    //跳转营销页面
    @RequestMapping("/toMarketing")
    public String marketing(){
        return "marketing";
    }
    //跳转运营支持
    @RequestMapping("/toSupport")
    public String support(){
        return "support";
    }

    //跳转供应链
    @RequestMapping("/toChain")
    public String chain(){
        return "chain";
    }
    //跳转社会招聘
    @RequestMapping("/toSocial")
    public String social(){
        return "social";
    }
    //跳转员工福利
    @RequestMapping("/toEmployees")
    public String employees(){
        return "employees";
    }
    //跳转留学生招聘
    @RequestMapping("/toInternational")
    public String international(){
        return "international";
    }
    //跳转走进中兴
    @RequestMapping("/toZte")
    public String zte(){
        return "zte";
    }
    //跳转2020届春季校园招聘启动
    @RequestMapping("/toCampus")
    public String springcampus(){
        return "spring-campus";
    }

    //跳转职业发展
    @RequestMapping("/toZhiye")
    public String careerdevelopment(){
        return "career-development";
    }
    //跳转培训学校
    @RequestMapping("/training")
    public String training(){
        return "training-learning";
    }
    //跳转人才培育
    @RequestMapping("/talent")
    public String apartment(){
        return "talent-apartment";
    }
    //跳转中兴简介
    @RequestMapping("/profile")
    public String profile(){
        return "zte-profile";
    }
    //跳转中兴文化
    @RequestMapping("/culture")
    public String culture(){
        return "zte-culture";
    }
    //跳转爱上中华
    @RequestMapping("/love-zte")
    public String love(){
        return "love-zte";
    }
    //跳转人在中兴
    @RequestMapping("/people")
    public String people(){
        return "people-in-zte";
    }


    @RequestMapping("savaMessage")
    @ResponseBody
    public void savaMessage(MessageBean messageBean){
        glService.savaMessage(messageBean);
    }


    @RequestMapping("/tolvli")
    public String tolvli(){
        return "lvli";
    }

    @RequestMapping("/tonydq")
    public String tonydq(){
        return "zhiwei";
    }



    //求span个数
    @RequestMapping("/span")
    public String spancount(){
        System.out.println("555");
        String ddd =  glService.spancount();
        System.out.println(ddd);
        return null;
    }
}
