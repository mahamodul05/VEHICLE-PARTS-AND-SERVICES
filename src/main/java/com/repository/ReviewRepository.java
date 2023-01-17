package com.repository;

import com.domain.Review;
import com.domain.Shop;

import java.util.List;

public interface ReviewRepository {

    public void save(Review review);

    public List<Review> getrevbycstid(String cstid);

    public List<Review> getrevbyshopid(int shopid);





}
