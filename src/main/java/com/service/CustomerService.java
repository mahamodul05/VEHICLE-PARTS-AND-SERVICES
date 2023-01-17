package com.service;

import com.domain.Customer;
import com.domain.Shop;

import java.util.List;

public interface CustomerService {

    public void save(Customer customer);

    public Customer getCustomer(Customer customer);

    public void update(Customer customer);

    public Customer getcustomer(String cstid);

    public List<Customer> getAll();



}
