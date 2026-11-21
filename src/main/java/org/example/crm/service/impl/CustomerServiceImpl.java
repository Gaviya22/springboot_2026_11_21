package org.example.crm.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.crm.dto.Customer;
import org.example.crm.entity.CustomerEntity;
import org.example.crm.repository.CustomerRepository;
import org.example.crm.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    final CustomerRepository repository;

    @Override
    public boolean addCustomer(Customer customer) {
        ModelMapper modelMapper = new ModelMapper();
        CustomerEntity customerEntity = modelMapper.map(customer,CustomerEntity.class);
        repository.save(customerEntity);
        return true;
    }

    @Override
    public List<Customer> getAll() {
        List<CustomerEntity> all = (List<CustomerEntity>) repository.findAll();
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        all.forEach(customerEntity -> customerArrayList.add(new ModelMapper().map(customerEntity, Customer.class)));
        return customerArrayList;
    }

    @Override
    public boolean deleteById(Integer id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public Customer searchById(Integer id) {
        return new ModelMapper().map(repository.findById(id), Customer.class);
    }
}
