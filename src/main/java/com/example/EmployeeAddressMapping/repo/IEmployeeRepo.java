package com.example.EmployeeAddressMapping.repo;

import com.example.EmployeeAddressMapping.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo  extends JpaRepository<Employee, Long> {
}
