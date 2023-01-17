package com.repository;

import com.domain.Customer;
import com.domain.Shop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRipositoryImp implements CustomerRepository{
    private final SessionFactory sessionFactory;

    public CustomerRipositoryImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public void save(Customer customer) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(customer);
    }

    @Override
    public List<Customer> getAll() {
        Session session = this.sessionFactory.getCurrentSession();
        Query<Customer> customerQuery = session.createQuery("from Customer", Customer.class);
        List<Customer> customer = customerQuery.getResultList();
        return customer == null ? new ArrayList<Customer>() : customer;
    }

    @Override
    public Customer getCustomer(Customer customer) {

        Session session = this.sessionFactory.getCurrentSession();
        int cststatus=1;
        try {
        Query<Customer> query = session.createQuery("from Customer where cstid =:cstid and cstpassword =:cstpassword and cststatus=:cststatus",Customer.class);
        query.setParameter("cstid", customer.getCstid());
        query.setParameter("cstpassword", customer.getCstpassword());
        query.setParameter("cststatus",cststatus);

        customer = query.getSingleResult();
            return customer;
        }catch (NoResultException e) {
            // TODO: handle exception
            return null;
        }
    }


    @Transactional
    @Override
    public void update(Customer customer) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(customer);
    }

    @Transactional
    @Override
    public Customer getcustomer(String cstid) {
        Session session = sessionFactory.getCurrentSession();
        Query<Customer> customerQuery = session.createQuery("from Customer where cstid like '%" + cstid + "%'", Customer.class);
        return customerQuery.getSingleResult();
    }



}