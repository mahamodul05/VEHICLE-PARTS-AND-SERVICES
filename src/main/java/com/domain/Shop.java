package com.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "shop")
public class Shop {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shopid")
    private int id;


    @NotNull(message = "Shop Name can not be empty")
    @Column(name = "shopname")
    private String shopname;

    @NotNull(message = "Shop Address can not be empty")
    @Column(name = "shopaddress")
    private String shopaddress;


    @Column(name = "service")
    private String service;

    @Column(name = "shopstatus")
    private int shopstatus;

    @Column(name = "ownername")
    private String ownername;

    @Column(name = "ownerid")
    private String ownerid;

    @Column(name = "password")
    private String password;

    @Column(name = "tradelicense")
    private String tradelicense;



    public Shop() {
    }

    public Shop(int id, String shopname, String shopaddress, String service, int shopstatus, String ownername, String ownerid, String password, String tradelicense) {
        this.id = id;
        shopname = shopname;
        shopaddress = shopaddress;
        service = service;
        shopstatus = shopstatus;
        ownername = ownername;
        ownerid = ownerid;
        password = password;
        tradelicense = tradelicense;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getShopaddress() {
        return shopaddress;
    }

    public void setShopaddress(String shopaddress) {
        this.shopaddress = shopaddress;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
    public int getShopstatus() {
        return shopstatus;
    }
    public void setShopstatus(int shopstatus) {
        this.shopstatus = shopstatus;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(String ownerid) {
        this.ownerid = ownerid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTradelicense() {
        return tradelicense;
    }

    public void setTradelicense(String tradelicense) {
        this.tradelicense = tradelicense;
    }
}
