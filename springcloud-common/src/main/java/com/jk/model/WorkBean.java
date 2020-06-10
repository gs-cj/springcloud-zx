package com.jk.model;

import java.util.Date;

public class WorkBean {

    private Integer id;
    private String companyname;
    private String jobtitle;
    private Date workinghours;
    private String jobduties;


    @Override
    public String toString() {
        return "WorkBean{" +
                "id=" + id +
                ", companyname='" + companyname + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", workinghours=" + workinghours +
                ", jobduties='" + jobduties + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public Date getWorkinghours() {
        return workinghours;
    }

    public void setWorkinghours(Date workinghours) {
        this.workinghours = workinghours;
    }

    public String getJobduties() {
        return jobduties;
    }

    public void setJobduties(String jobduties) {
        this.jobduties = jobduties;
    }
}
