package com.edusol.banking.controller;

import com.edusol.banking.entity.CustomerTransaction;
import com.edusol.banking.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransferController
{
    @Autowired
    TransactionService transactionService;
    @RequestMapping("/transfer")

    public String sayHello()
    {
        return "this is transfer controller";
    }
    @GetMapping("/getAllTransaction")
    public List<CustomerTransaction> getAllTransaction()
    {
        return transactionService.getAllTransaction();
    }
}
