package com.jk.model;

import java.io.Serializable;

public class ReceuBean implements Serializable {
    private Integer id;
    private String jobtitle;
    private String undergo;
    private String jobarea;
    private String jobdate;
    private Integer professId;
    private Integer employ;
    private String startdate;
    private String enddate;
    private String duty;
    private String claim;

    public Integer getEmploy() {
        return employ;
    }

    public void setEmploy(Integer employ) {
        this.employ = employ;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getClaim() {
        return claim;
    }

    public void setClaim(String claim) {
        this.claim = claim;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getUndergo() {
        return undergo;
    }

    public void setUndergo(String undergo) {
        this.undergo = undergo;
    }

    public String getJobarea() {
        return jobarea;
    }

    public void setJobarea(String jobarea) {
        this.jobarea = jobarea;
    }

    public String getJobdate() {
        return jobdate;
    }

    public void setJobdate(String jobdate) {
        this.jobdate = jobdate;
    }

    public Integer getProfessId() {
        return professId;
    }

    public void setProfessId(Integer professId) {
        this.professId = professId;
    }
}
