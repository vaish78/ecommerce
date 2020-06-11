package com.myapp.webapp.service;

import java.util.List;

import com.myapp.webapp.models.Customer;

public interface CustomerService {

    void addCustomer(Customer customer);

    Customer getCustomerById(int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername(String username);

}

