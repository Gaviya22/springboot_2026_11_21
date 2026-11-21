package org.example.crm.service.impl;

import org.example.crm.dto.Customer;
import org.example.crm.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public boolean addCustomer(Customer customer) {
        return false;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }

    @Override
    public Customer searchById(Integer id) {
        return null;
    }
}
