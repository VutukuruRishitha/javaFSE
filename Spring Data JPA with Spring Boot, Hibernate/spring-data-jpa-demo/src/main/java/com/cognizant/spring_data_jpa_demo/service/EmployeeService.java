package com.cognizant.spring_data_jpa_demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.spring_data_jpa_demo.model.Employee;
import com.cognizant.spring_data_jpa_demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> searchContaining(String text) {
        return employeeRepository.findByEmployeeNameContaining(text);
    }

    public List<Employee> searchStarting(String text) {
        return employeeRepository.findByEmployeeNameStartingWith(text);
    }

    public List<Employee> salaryGreater(double salary) {
        return employeeRepository.findBySalaryGreaterThan(salary);
    }

    public List<Employee> salaryLess(double salary) {
        return employeeRepository.findBySalaryLessThan(salary);
    }

    public List<Employee> betweenDates(LocalDate start, LocalDate end) {
        return employeeRepository.findByDateOfBirthBetween(start, end);
    }

    public List<Employee> sortEmployees() {
        return employeeRepository.findByOrderByEmployeeNameAsc();
    }

    public List<Employee> topEmployees() {
        return employeeRepository.findTop3ByOrderBySalaryDesc();
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}