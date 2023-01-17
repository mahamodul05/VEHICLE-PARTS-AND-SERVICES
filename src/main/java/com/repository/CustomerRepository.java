package com.repository;

import com.domain.Customer;
import com.domain.Shop;

import java.util.List;

public interface CustomerRepository {


    public List<Customer> getAll();
    public void save(Customer customer);

    public Customer getCustomer(Customer customer);

    public void update(Customer customer);

    public Customer getcustomer(String cstid);

    //public List<Customer> getvalibstudent(int status);

    //public void changestatus(int id, int status);

}
