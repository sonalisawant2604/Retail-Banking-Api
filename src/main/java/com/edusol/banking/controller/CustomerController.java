package com.edusol.banking.controller;

import com.edusol.banking.entity.CustomerDetails;
import com.edusol.banking.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CustomerController
{
    @Autowired
    CustomerService customerService;
    @RequestMapping("/hello")
    public String sayHello()
    {
        return "this is banking demo";
    }

    @GetMapping("/getAllCustomer")
    public List<CustomerDetails> getAllCustomer()
    {
        return customerService.getAllCustomerDetails();
    }
    @PostMapping("/saveCustomer")
    public void saveCustomer(@RequestBody CustomerDetails customer)
    {
        customerService.saveAllCustomer(customer);
    }
    @DeleteMapping("/deleteCustomer")
    public void deleteCustomer(@RequestParam("id") int id, CustomerDetails customer)
    {
        customerService.deleteCustomer(customer,id);
    }
    @PutMapping("/updateCustomer")
    public CustomerDetails updateCustomer(@RequestBody CustomerDetails customer, @RequestParam("id") int id) {
        return customerService.updateCustomer(customer, id);
    }
}
