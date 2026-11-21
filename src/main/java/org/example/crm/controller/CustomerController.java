package org.example.crm.controller;

import lombok.RequiredArgsConstructor;
import org.example.crm.dto.Customer;
import org.example.crm.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    final CustomerService service;

    @PostMapping("/add")
    public boolean addCustomer(@RequestBody Customer customer){
        return service.addCustomer(customer);
    }

    @GetMapping("/get-all")
    public List<Customer> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete-by-id/{id}")
    public boolean deleteById(@PathVariable Integer id){
        return service.deleteById(id);
    }

    @GetMapping("/search-by-id/{id}")
    public Customer searchById(@PathVariable Integer id){
        return service.searchById(id);
    }

}
