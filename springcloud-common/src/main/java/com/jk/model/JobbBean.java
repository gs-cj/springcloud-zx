package com.jk.model;

import java.io.Serializable;

public class JobbBean implements Serializable {
    private Integer id;
    private String jobname;
    private String area;
    private String date;
    private Integer relevantid;
    private Integer professionid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getRelevantid() {
        return relevantid;
    }

    public void setRelevantid(Integer relevantid) {
        this.relevantid = relevantid;
    }

    public Integer getProfessionid() {
        return professionid;
    }

    public void setProfessionid(Integer professionid) {
        this.professionid = professionid;
    }
}
