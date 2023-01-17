package com.repository;

import com.domain.Customer;
import com.domain.Shop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ShopRepositoryImp implements ShopRepository {

    private final SessionFactory sessionFactory;

    public ShopRepositoryImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Shop> getAll() {
        Session session = this.sessionFactory.getCurrentSession();
        Query<Shop> shopQuery = session.createQuery("from Shop", Shop.class);
        List<Shop> shops = shopQuery.getResultList();
        return shops == null ? new ArrayList<Shop>() : shops;
    }

    @Override
    public void save(Shop shop) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(shop);
    }

    @Override
    public Shop get(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.get(Shop.class, id);
    }

    @Override
    public void update(Shop shop) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(shop);
    }

    @Override
    public void delete(int id) {
        Shop shop = get(id);
        Session session = this.sessionFactory.getCurrentSession();
        session.delete(shop);
    }

    @Override
    public List<Shop> getAll(int shop_id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Shop> shopQuery = session.createQuery("from Shop where shopid like '%" + shop_id + "%'", Shop.class);
        return shopQuery.getResultList();
    }

    @Override
    public List<Shop> getbyusername(String service){
        Session session = sessionFactory.getCurrentSession();
        Query<Shop> shopQuery = session.createQuery("from Shop where shopname like '%" + service + "%'", Shop.class);
        return shopQuery.getResultList();
    }

    @Override
    public Shop getownerid(String ownerid){
        Session session = sessionFactory.getCurrentSession();
        Query<Shop> shopQuery = session.createQuery("from Shop where ownerid like '%" + ownerid + "%'", Shop.class);
        return shopQuery.getSingleResult();

    }




}