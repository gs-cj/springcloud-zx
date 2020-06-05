package com.jk.mapper;

import com.jk.model.AreaBean;
import com.jk.model.JobbBean;
import com.jk.model.ProfeBean;
import com.jk.model.RelevantBean;
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

    @Select("select * from t_profession")
    List<ProfeBean> findProfession();

    @Select("select * from t_workplace")
    List<AreaBean> findArea();

    @Select("select count(1) from t_job  ")
    int findJobCount(HashMap<String, Object> params);

    @Select("SELECT * from t_jobb")
    List<JobbBean> findJob();

//    @Select("SELECT * from t_job limit 2,1")
//    List<JobBean> findJobList(Integer page, Integer rows, JobBean jobBean);

    //List<JobBean> findJobList(HashMap<String, Object> params);
}
