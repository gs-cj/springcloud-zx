package com.jk.model;

public class PositionModel {

    private Integer id;
    private String  jobtitle;//职位
    private String  undergo;//年限
    private String  jobarea;//地点
    private String  jobdate;
    private Integer professId;
    private Integer employ;
    private String  startdate;//发布日期
    private String  enddate;//截止日期
    private String  duty;//主要职责
    private String  claim;//任职要求
    private Integer workid;
    private Integer positiontop;
    private String  areaName;

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

    public Integer getWorkid() {
        return workid;
    }

    public void setWorkid(Integer workid) {
        this.workid = workid;
    }

    public Integer getPositiontop() {
        return positiontop;
    }

    public void setPositiontop(Integer positiontop) {
        this.positiontop = positiontop;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
}
