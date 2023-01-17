package com.service;

import com.domain.Customer;
import com.domain.Shop;
import com.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImp implements CustomerService {


    private final CustomerRepository customerRepository;

    public CustomerServiceImp(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    @Transactional(readOnly = true)
    public List<Customer> getAll() {
        return customerRepository.getAll();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer getCustomer(Customer customer) {
        return customerRepository.getCustomer(customer);
    }

    /*@Override
    public List<Student> getvalibstudent (int status) {
       return studentDao.getvalibstudent(status);
    }*/

    @Override
    public void update(Customer customer) {
        customerRepository.update(customer);
    }

    @Override
    public Customer getcustomer(String cstid){return customerRepository.getcustomer(cstid);}

    /*@Override
    public void changestatus(int id, int status) {
        studentDao.changestatus(id,status);
    }

 */
}
