package com.jk.model;

import java.util.Date;

public class EducationalBean {

    private Integer id;
    private String choolname;
    private Date time;
    private String nameofmajor;
    private String education;
    private String degree;

    @Override
    public String toString() {
        return "EducationalBean{" +
                "id=" + id +
                ", choolname='" + choolname + '\'' +
                ", time=" + time +
                ", nameofmajor='" + nameofmajor + '\'' +
                ", education='" + education + '\'' +
                ", degree='" + degree + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChoolname() {
        return choolname;
    }

    public void setChoolname(String choolname) {
        this.choolname = choolname;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getNameofmajor() {
        return nameofmajor;
    }

    public void setNameofmajor(String nameofmajor) {
        this.nameofmajor = nameofmajor;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
