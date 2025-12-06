package com.codeapp.crudfullstack.reposittory;

import com.codeapp.crudfullstack.entity.Customer;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
