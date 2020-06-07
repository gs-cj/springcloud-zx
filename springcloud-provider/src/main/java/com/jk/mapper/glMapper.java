package com.jk.mapper;

import com.jk.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface glMapper {
    @Select("select count(1) from t_relevant")
    String spancount();

    @Select("select count(1) from t_relevant")
    String findRelevantCount();


    @Select("select * from t_relevant")
    List<RelevantBean> findRelevant();

    @Select("select * from t_profession  where type=1 or type = 0 ")
    List<ProfeBean> findProfession();

    @Select("select * from t_workplace")
    List<AreaBean> findArea();

    @Select("SELECT * from t_jobb")
    List<JobbBean> findJob();

    @Select("select * from t_profession  where type=2 or type = 0 ")
    List<ProfeBean> findProfessionn();

    @Select("select count(1) from t_jobb")
    String countjob();


    @Select("SELECT * from t_recruitment")
    List<ReceuBean> findSheJobName();


    @Select("SELECT * from t_recruitment where id = #{value}")
    ReceuBean findSheJobNamee(@RequestParam Integer id);

    @Select("<script> " +
            "select * from t_recruitment " +
            "where 1=1" +
            " <if test = '#{id} != null'>" +
            " and workid = #{id}" +
            " </if>" +
            " </script>" )
    List<ReceuBean> finareaid(@RequestParam("id") Integer id);


    @Select("<script> " +
            "select * from t_recruitment " +
            "where 1=1" +
            " <if test = '#{proid} != null'>" +
            " and professid = #{proid}" +
            " </if>" +
            " </script>" )
    List<ReceuBean> finareaidd(@RequestParam("proid") Integer proid);

//    @Select("<script> " +
//            "SELECT * FROM `1908_course`" +
//            " WHERE 1=1 " +
//            "<if test='coursetitle != null and coursetitle.length > 0'> " +
//            "and coursetitle like concat('%',#{coursetitle},'%') " +
//            "</if>"  +
//            "</script>")
//    @Select("SELECT * from t_job limit 2,1")
//    List<JobBean> findJobList(Integer page, Integer rows, JobBean jobBean);

}
