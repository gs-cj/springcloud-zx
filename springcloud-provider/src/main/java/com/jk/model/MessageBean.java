package com.jk.model;

public class MessageBean {

    private Integer id;
    private String name;
    private Integer sex;
    private String dateofbirth;
    private Integer maritalstatus;
    private String nationality;
    private String mailbox;
    private String cellphonenumber;
    private String contactaddress;
    private String postalcode;
    private String workingcityid;
    private String expectedcityofwork;
    private String nowengagedinindustry;
    private String presentoccupation;
    private String expectedsalary;
    private String arrivaltime;
    private String hobbiesandinterests;


    @Override
    public String toString() {
        return "MessageBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateofbirth='" + dateofbirth + '\'' +
                ", maritalstatus=" + maritalstatus +
                ", nationality='" + nationality + '\'' +
                ", mailbox='" + mailbox + '\'' +
                ", cellphonenumber='" + cellphonenumber + '\'' +
                ", contactaddress='" + contactaddress + '\'' +
                ", postalcode='" + postalcode + '\'' +
                ", workingcityid='" + workingcityid + '\'' +
                ", expectedcityofwork='" + expectedcityofwork + '\'' +
                ", nowengagedinindustry='" + nowengagedinindustry + '\'' +
                ", presentoccupation='" + presentoccupation + '\'' +
                ", expectedsalary='" + expectedsalary + '\'' +
                ", arrivaltime='" + arrivaltime + '\'' +
                ", hobbiesandinterests='" + hobbiesandinterests + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public Integer getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(Integer maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    public String getCellphonenumber() {
        return cellphonenumber;
    }

    public void setCellphonenumber(String cellphonenumber) {
        this.cellphonenumber = cellphonenumber;
    }

    public String getContactaddress() {
        return contactaddress;
    }

    public void setContactaddress(String contactaddress) {
        this.contactaddress = contactaddress;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getWorkingcityid() {
        return workingcityid;
    }

    public void setWorkingcityid(String workingcityid) {
        this.workingcityid = workingcityid;
    }

    public String getExpectedcityofwork() {
        return expectedcityofwork;
    }

    public void setExpectedcityofwork(String expectedcityofwork) {
        this.expectedcityofwork = expectedcityofwork;
    }

    public String getNowengagedinindustry() {
        return nowengagedinindustry;
    }

    public void setNowengagedinindustry(String nowengagedinindustry) {
        this.nowengagedinindustry = nowengagedinindustry;
    }

    public String getPresentoccupation() {
        return presentoccupation;
    }

    public void setPresentoccupation(String presentoccupation) {
        this.presentoccupation = presentoccupation;
    }

    public String getExpectedsalary() {
        return expectedsalary;
    }

    public void setExpectedsalary(String expectedsalary) {
        this.expectedsalary = expectedsalary;
    }

    public String getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public String getHobbiesandinterests() {
        return hobbiesandinterests;
    }

    public void setHobbiesandinterests(String hobbiesandinterests) {
        this.hobbiesandinterests = hobbiesandinterests;
    }
}