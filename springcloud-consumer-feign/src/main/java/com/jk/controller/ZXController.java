package com.jk.controller;

import com.jk.model.*;
import com.jk.service.glService;
import com.jk.util.CheckImgUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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



    //查看相关职位个数findRelevantCount
    @RequestMapping("findRelevantCount")
    @ResponseBody
    public String findRelevantCount(){
        return glService.findRelevantCount();
    }


    //查看相关职位
    @RequestMapping("/findRelevant")
    @ResponseBody
    public List<RelevantBean> findRelevantww(){
        return glService.findRelevant();
    }

    //查看职位分类
    @RequestMapping("/findProfession")
    @ResponseBody
    public List<ProfeBean>findProfession(){
        return glService.findProfession();
    }

    //社会招聘查看职位分类
    @RequestMapping("/findProfessionn")
    @ResponseBody
    public List<ProfeBean>findProfessionn(){
        return glService.findProfessionn();
    }

    //查看工作地点
    @RequestMapping("/findArea")
    @ResponseBody
    public List<AreaBean>findArea(){

        return glService.findArea();
    }

    //查看职位
    @RequestMapping("/findJob")
    public ModelAndView findJob(){
       List<JobbBean>list = glService.findJob();

        ModelAndView show = new ModelAndView();
        show.addObject("list",list);
        show.setViewName("show");
        return show;
    }

    //查看职位个数
    @RequestMapping("countjob")
    @ResponseBody
    public String countjob(){
        return glService.countjob();
    }

    //查看社会招聘职位
    @RequestMapping("findSheJobName")
    @ResponseBody
    public ModelAndView findSheJobName(){
     //   ModelAndView model = new ModelAndView("sheJob");
        ModelAndView model = new ModelAndView("sheJob");
        List<ReceuBean>list =   glService.findSheJobName();

        model.addObject("list",list);
        return model;

    }

    //查看职位详情
    @RequestMapping("/findjobbid")
    @ResponseBody
    public ModelAndView findjobbid(@RequestParam Integer id){
        ModelAndView details = new ModelAndView("details");
        ReceuBean receu = glService.findSheJobNamee(id);
        details.addObject("receu",receu);

        return details;
    }

    //职位名称条查
    @RequestMapping("/finareaid")
    @ResponseBody
    public ModelAndView finareaid(@RequestParam("id")Integer id){

        ModelAndView view = new ModelAndView();
        List<ReceuBean>list = glService.finareaid(id);
        view.addObject("list", list);
        view.setViewName("sheJobb");
        return view;
    }
    @RequestMapping("/finareaidd")
    @ResponseBody
    public ModelAndView finareaidd(@RequestParam("proid")Integer proid){

        System.out.println(proid + "---------------");
        ModelAndView view = new ModelAndView();
        List<ReceuBean>list = glService.finareaidd(proid);
        view.addObject("list", list);
        view.setViewName("sheJobb");
        return view;
    }

    /*进入登录页面*/
    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    /*进入注册页面*/
    @GetMapping("/toRegister")
    public String toRegister() {

        return "register";
    }

    /*登录成功进入主页*/
    @GetMapping("/toMain")
    public String toMain3() {

        return "main";
    }


    @RequestMapping("getCode")
    //验证码
    public void getCode(HttpServletRequest request, HttpServletResponse response) {

        CheckImgUtil.buildCheckImg(request, response);
    }

    //登录
    @RequestMapping("/success")
    @ResponseBody
    public HashMap successful(String username, String userpassword, String code, HttpServletRequest request, HttpServletResponse response) throws IOException {

        String realCode = request.getSession().getAttribute("checkcode").toString().toLowerCase();

        HashMap<String, Object> mape = new HashMap<>();

        UserModel loginName = glService.Succ(username);//userService.Succ(username);
        if (realCode.equals(code.toLowerCase())) {
            if (loginName != null) {
                if (loginName.getUserpassword().equals(userpassword)) {
                    mape.put("cd", 1);
                    mape.put("msg", "登录成功");
                    request.getSession().setAttribute("username", loginName.getUsername());

                } else {
                    mape.put("cd", 2);
                    mape.put("msg", "密码错误");
                }
            } else {
                mape.put("cd", 3);
                mape.put("msg", "用户名错误");
            }
        } else {
            mape.put("cd", 4);
            mape.put("msg", "验证码错误");
        }

        return mape;
    }

    //注册
    @RequestMapping(value = {"/reg","/reg1"})
    @ResponseBody
    public HashMap reg(UserModel user) {
        UserModel reuser = glService.reg(user.getUsername());
        HashMap<String, Object> msg = new HashMap<>();
        if (reuser != null) {
            msg.put("cod", 5);
            msg.put("msg", "用户已存在");
        } else {

            glService.addUser(user);
        }
        return msg;
    }

    /*跳转到手机号验证*/
    @RequestMapping("/shoujidenglu")
    public String shoujidenglu() {
        return "shoujidenglu";
    }


}
