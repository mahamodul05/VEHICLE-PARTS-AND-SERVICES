package com.service;

import com.domain.Review;
import com.domain.Shop;

import java.util.List;

public interface ReviewService {

    public void save(Review review);

    public List<Review> getrevbycstid(String cstid);

    public List<Review> getrevbyshopid(int shopid);


}
