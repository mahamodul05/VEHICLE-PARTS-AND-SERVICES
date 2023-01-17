package com.repository;

import com.domain.Customer;
import com.domain.Review;
import com.domain.Shop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NoResultException;
import java.util.List;

@Repository
public class ReviewRipositoryImp implements ReviewRepository{
    private final SessionFactory sessionFactory;

    public ReviewRipositoryImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Review review) {

    }

    @Override
    public List<Review> getrevbycstid(String cstid) {
        Session session = sessionFactory.getCurrentSession();
        Query<Review> reviewQuery = session.createQuery("from Review where cstid like '%" + cstid + "%'", Review.class);
        return reviewQuery.getResultList();
    }

    @Override
    public List<Review> getrevbyshopid(int shopid) {
        Session session = sessionFactory.getCurrentSession();
        Query<Review> reviewQuery = session.createQuery("from Review where shopid like '%" + shopid + "%'", Review.class);
        return reviewQuery.getResultList();
    }

}