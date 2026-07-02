package com.cognizant.bookmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.bookmanagement.model.Book;
import com.cognizant.bookmanagement.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public List<Book> getAllBooks() {
        return repository.getAllBooks();
    }

    public List<Book> getBooksByAuthor(String author) {
        return repository.getBooksByAuthor(author);
    }

    public long countBooks() {
        return repository.countBooks();
    }

    public Double averagePrice() {
        return repository.averagePrice();
    }

    public Double maxPrice() {
        return repository.maxPrice();
    }

    public Double minPrice() {
        return repository.minPrice();
    }

    public List<Book> getAllBooksNative() {
        return repository.getAllBooksNative();
    }
}