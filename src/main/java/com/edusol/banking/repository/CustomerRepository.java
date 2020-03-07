package com.edusol.banking.repository;

import com.edusol.banking.entity.CustomerDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerDetails,Integer>
{
}
