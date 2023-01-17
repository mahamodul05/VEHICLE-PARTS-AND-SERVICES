package com.service;

import com.domain.Review;
import com.domain.Shop;
import com.repository.ReviewRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReviewServiceImp implements ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewServiceImp(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }


    @Override
    public void save(Review review) { reviewRepository.save(review);}

    @Override
    public List<Review> getrevbycstid(String cstid) { return reviewRepository.getrevbycstid(cstid); }

    @Override
    public List<Review> getrevbyshopid(int shopid) { return reviewRepository.getrevbyshopid(shopid); }

}