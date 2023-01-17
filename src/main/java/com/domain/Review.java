package com.domain;

import javax.persistence.*;

@Entity
@Table(name = "cstreview")
public class Review {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "cstid")
    private String cstid;

    @Column(name = "review")
    private String review;


    @Column(name = "shopid")
    private int shopid;

    public Review() {
    }

    public Review(int id, String cstid, String review, int shopid) {
        this.id = id;
        cstid = cstid;
        review = review;
        shopid = shopid;
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

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getShopid() {
        return shopid;
    }

    public void setShopid(int shopid) {
        this.shopid = shopid;
    }
}
