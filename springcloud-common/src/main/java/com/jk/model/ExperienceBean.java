package com.jk.model;

import java.util.Date;

public class ExperienceBean {

    private Integer id;
    private String projectname;
    private Date time;
    private String itemdescription;
    private String projectrole;


    @Override
    public String toString() {
        return "ExperienceBean{" +
                "id=" + id +
                ", projectname='" + projectname + '\'' +
                ", time=" + time +
                ", itemdescription='" + itemdescription + '\'' +
                ", projectrole='" + projectrole + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getItemdescription() {
        return itemdescription;
    }

    public void setItemdescription(String itemdescription) {
        this.itemdescription = itemdescription;
    }

    public String getProjectrole() {
        return projectrole;
    }

    public void setProjectrole(String projectrole) {
        this.projectrole = projectrole;
    }
}
