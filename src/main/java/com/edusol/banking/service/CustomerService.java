package com.edusol.banking.service;

import com.edusol.banking.entity.CustomerDetails;
import com.edusol.banking.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    List<CustomerDetails> customers=new ArrayList<>();
    public List<CustomerDetails> getAllCustomerDetails()
    {

        customerRepository.findAll().forEach(customer->customers.add(customer));
        return customers;
    }

    public void saveAllCustomer(CustomerDetails customer)
    {
        customerRepository.save(customer);
    }

    public void deleteCustomer(CustomerDetails customer, int id)
    {
       customerRepository.deleteById(id);
    }



    public CustomerDetails updateCustomer(CustomerDetails customer, int id)
    {
        return customerRepository.findById(id)
                .map(cust -> {
                    cust.setFirstname(customer.getFirstname());
                    cust.setLastname(customer.getLastname());
                    cust.setEmail(customer.getEmail());
                    cust.setCity(customer.getCity());
                    cust.setContact(customer.getContact());
                    return customerRepository.save(customer);
                })
                .orElseGet(() ->
                {
                    customer.setId(id);
                    return customerRepository.save(customer);
                });
    }
}
