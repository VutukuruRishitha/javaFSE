package com.cognizant.spring_data_jpa_demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.spring_data_jpa_demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByEmployeeNameContaining(String text);

    List<Employee> findByEmployeeNameStartingWith(String text);

    List<Employee> findBySalaryGreaterThan(double salary);

    List<Employee> findBySalaryLessThan(double salary);

    List<Employee> findByDateOfBirthBetween(LocalDate startDate,
                                            LocalDate endDate);

    List<Employee> findTop3ByOrderBySalaryDesc();

    List<Employee> findByOrderByEmployeeNameAsc();

}