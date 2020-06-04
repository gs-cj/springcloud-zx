package com.jk.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class JobBean implements Serializable {
    private Integer id;
    private Integer job_id;
    private Integer relevant_id ;
    private Integer profession_id ;
    private String date;
    private String area;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJob_id() {
        return job_id;
    }

    public void setJob_id(Integer job_id) {
        this.job_id = job_id;
    }

    public Integer getRelevant_id() {
        return relevant_id;
    }

    public void setRelevant_id(Integer relevant_id) {
        this.relevant_id = relevant_id;
    }

    public Integer getProfession_id() {
        return profession_id;
    }

    public void setProfession_id(Integer profession_id) {
        this.profession_id = profession_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
