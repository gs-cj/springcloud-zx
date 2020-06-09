package com.jk.model;

public class MessOsdBean {

    private Integer id;
    private Integer mid;
    private Integer oid;


    @Override
    public String toString() {
        return "MessOsdBean{" +
                "id=" + id +
                ", mid=" + mid +
                ", oid=" + oid +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }
}
