package com.jk.model;

public class LanguageBean {

    private Integer id;
    private Integer linguistictype;
    private Integer masterydegree;
    private Integer hearof;
    private Integer readwrite;


    @Override
    public String toString() {
        return "LanguageBean{" +
                "id=" + id +
                ", linguistictype=" + linguistictype +
                ", masterydegree=" + masterydegree +
                ", hearof=" + hearof +
                ", readwrite=" + readwrite +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLinguistictype() {
        return linguistictype;
    }

    public void setLinguistictype(Integer linguistictype) {
        this.linguistictype = linguistictype;
    }

    public Integer getMasterydegree() {
        return masterydegree;
    }

    public void setMasterydegree(Integer masterydegree) {
        this.masterydegree = masterydegree;
    }

    public Integer getHearof() {
        return hearof;
    }

    public void setHearof(Integer hearof) {
        this.hearof = hearof;
    }

    public Integer getReadwrite() {
        return readwrite;
    }

    public void setReadwrite(Integer readwrite) {
        this.readwrite = readwrite;
    }
}
