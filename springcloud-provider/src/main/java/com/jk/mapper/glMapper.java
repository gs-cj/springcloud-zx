package com.jk.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface glMapper {
    @Select("select count(1) from t_relevant")
    String spancount();
}
