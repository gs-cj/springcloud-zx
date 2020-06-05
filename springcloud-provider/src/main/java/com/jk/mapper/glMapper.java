package com.jk.mapper;

import com.jk.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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

//    @Select("SELECT * from t_job limit 2,1")
//    List<JobBean> findJobList(Integer page, Integer rows, JobBean jobBean);

}
