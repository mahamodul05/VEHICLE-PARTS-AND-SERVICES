package com.domain;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "cstid")
    private String cstid;

    @Column(name = "cstname")
    private String cstname;


    @Column(name = "cstaddress")
    private String cstaddress;

    @Column(name = "cststatus")
    private int cststatus;


    @Column(name = "cstemail")
    private String cstemail;

    @Column(name = "cstpassword")
    private String  cstpassword;


    public Customer() {
    }

    public Customer(int id, String cstid, String cstname, String cstaddress, int cststatus, String cstemail, String cstpassword) {
        this.id = id;
        cstid = cstid;
        cstname = cstname;
        cstaddress = cstaddress;
        cststatus = cststatus;
        cstemail = cstemail;
        cstpassword = cstpassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCstid() {
        return cstid;
    }

    public void setCstid(String cstid) {
        this.cstid = cstid;
    }
    public String getCstname() {
        return cstname;
    }
    public void setCstname(String cstname) {
        this.cstname = cstname;
    }
    public String getCstaddress() {
        return cstaddress;
    }
    public void setCstaddress(String cstaddress) {
        this.cstaddress = cstaddress;
    }
    public int getCststatus() {
        return cststatus;
    }
    public void setCststatus(int cststatus) { this.cststatus = cststatus; }
    public String getCstemail() {
        return cstemail;
    }
    public void setCstemail(String cstemail) {
        this.cstemail = cstemail;
    }
    public String getCstpassword() {
        return cstpassword;
    }
    public void setCstpassword(String cstpassword) {
        this.cstpassword = cstpassword;
    }
}
