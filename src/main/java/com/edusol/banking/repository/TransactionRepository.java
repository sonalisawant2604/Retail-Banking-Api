package com.edusol.banking.repository;

import com.edusol.banking.entity.CustomerTransaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<CustomerTransaction,Long> {
}
