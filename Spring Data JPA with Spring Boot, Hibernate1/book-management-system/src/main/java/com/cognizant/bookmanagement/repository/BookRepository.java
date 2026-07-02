package com.cognizant.bookmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.bookmanagement.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query("FROM Book")
    List<Book> getAllBooks();

    @Query("FROM Book b WHERE b.author=?1")
    List<Book> getBooksByAuthor(String author);

    @Query("SELECT COUNT(b) FROM Book b")
    long countBooks();

    @Query("SELECT AVG(b.price) FROM Book b")
    Double averagePrice();

    @Query("SELECT MAX(b.price) FROM Book b")
    Double maxPrice();

    @Query("SELECT MIN(b.price) FROM Book b")
    Double minPrice();

    @Query(value="SELECT * FROM book", nativeQuery=true)
    List<Book> getAllBooksNative();
}