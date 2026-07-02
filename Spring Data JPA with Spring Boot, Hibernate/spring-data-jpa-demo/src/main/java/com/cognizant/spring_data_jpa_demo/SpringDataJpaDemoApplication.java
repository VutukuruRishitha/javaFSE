package com.cognizant.spring_data_jpa_demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.spring_data_jpa_demo.service.CountryService;
import com.cognizant.spring_data_jpa_demo.service.EmployeeService;
import com.cognizant.spring_data_jpa_demo.service.StateService;
import com.cognizant.spring_data_jpa_demo.service.StudentService;

@SpringBootApplication
public class SpringDataJpaDemoApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(SpringDataJpaDemoApplication.class, args);

        CountryService countryService = context.getBean(CountryService.class);
        StateService stateService = context.getBean(StateService.class);
        EmployeeService employeeService = context.getBean(EmployeeService.class);
        StudentService studentService = context.getBean(StudentService.class);

        System.out.println("--------------- ALL COUNTRIES ----------------");
        System.out.println(countryService.getAllCountries());

        System.out.println("--------------- ALL STATES ----------------");
        System.out.println(stateService.getAllStates());

        System.out.println("--------------- SEARCH STATE CONTAINING 'ta' ----------------");
        System.out.println(stateService.searchContaining("ta"));

        System.out.println("--------------- SEARCH STATE STARTING WITH 'Ta' ----------------");
        System.out.println(stateService.searchStarting("Ta"));

        System.out.println("--------------- EMPLOYEE NAME CONTAINING 'an' ----------------");
        System.out.println(employeeService.searchContaining("an"));

        System.out.println("--------------- EMPLOYEE NAME STARTING WITH 'Ra' ----------------");
        System.out.println(employeeService.searchStarting("Ra"));

        System.out.println("--------------- SALARY GREATER THAN 50000 ----------------");
        System.out.println(employeeService.salaryGreater(50000));

        System.out.println("--------------- SALARY LESS THAN 50000 ----------------");
        System.out.println(employeeService.salaryLess(50000));

        System.out.println("--------------- DATE OF BIRTH BETWEEN ----------------");
        System.out.println(employeeService.betweenDates(
                LocalDate.of(1995, 1, 1),
                LocalDate.of(1999, 12, 31)));

        System.out.println("--------------- SORT EMPLOYEES ----------------");
        System.out.println(employeeService.sortEmployees());

        System.out.println("--------------- TOP 3 EMPLOYEES ----------------");
        System.out.println(employeeService.topEmployees());

        System.out.println("--------------- STUDENTS ----------------");
        System.out.println(studentService.getAllStudents());

    }
}