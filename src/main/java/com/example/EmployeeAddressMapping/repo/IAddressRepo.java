package com.example.EmployeeAddressMapping.repo;

import com.example.EmployeeAddressMapping.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address, Long> {
}
