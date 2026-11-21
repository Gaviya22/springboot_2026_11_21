package org.example.crm.service;

import org.example.crm.dto.Customer;

import java.util.List;

public interface CustomerService {
    boolean addCustomer(Customer customer);

    List<Customer> getAll();

    boolean deleteById(Integer id);

    Customer searchById(Integer id);
}
