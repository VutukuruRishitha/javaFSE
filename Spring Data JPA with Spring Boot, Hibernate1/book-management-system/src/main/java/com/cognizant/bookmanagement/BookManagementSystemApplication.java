package com.cognizant.bookmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.bookmanagement.service.BookService;

@SpringBootApplication
public class BookManagementSystemApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(BookManagementSystemApplication.class, args);

        BookService service = context.getBean(BookService.class);

        System.out.println("===== HQL =====");

        service.getAllBooks().forEach(System.out::println);

        System.out.println();

        System.out.println("Books by Author");

        service.getBooksByAuthor("James Gosling")
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Total Books : "
                + service.countBooks());

        System.out.println("Average Price : "
                + service.averagePrice());

        System.out.println("Maximum Price : "
                + service.maxPrice());

        System.out.println("Minimum Price : "
                + service.minPrice());

        System.out.println();

        System.out.println("===== Native Query =====");

        service.getAllBooksNative()
                .forEach(System.out::println);
    }
}