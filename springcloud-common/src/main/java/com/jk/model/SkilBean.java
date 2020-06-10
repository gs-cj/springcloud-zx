package com.jk.model;

public class SkilBean {

    private Integer id;
    private String nameofskills;
    private Integer masterydegree;


    @Override
    public String toString() {
        return "SkilBean{" +
                "id=" + id +
                ", nameofskills='" + nameofskills + '\'' +
                ", masterydegree=" + masterydegree +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameofskills() {
        return nameofskills;
    }

    public void setNameofskills(String nameofskills) {
        this.nameofskills = nameofskills;
    }

    public Integer getMasterydegree() {
        return masterydegree;
    }

    public void setMasterydegree(Integer masterydegree) {
        this.masterydegree = masterydegree;
    }
}
