package com.jk.model;

import java.io.Serializable;

public class JobbBean implements Serializable {
    private Integer jobid;
    private String jobname;
    private String area;
    private String date;
    private Integer relevantid;
    private Integer professionid;

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
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
