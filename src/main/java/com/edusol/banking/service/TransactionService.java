package com.edusol.banking.service;

import com.edusol.banking.entity.CustomerTransaction;
import com.edusol.banking.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TransactionService
{
    @Autowired
  TransactionRepository transactionRepository;
    public List<CustomerTransaction> getAllTransaction()
    {
        List<CustomerTransaction>transactions=new ArrayList<>();
        transactionRepository.findAll().forEach(transaction->transactions.add(transaction));
        return transactions;
    }
}
