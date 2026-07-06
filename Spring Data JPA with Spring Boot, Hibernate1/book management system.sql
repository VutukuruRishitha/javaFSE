CREATE DATABASE bookdb;
USE bookdb;
CREATE TABLE book(
    book_id INT PRIMARY KEY,
    book_name VARCHAR(100),
    author VARCHAR(100),
    price DOUBLE
);
INSERT INTO book VALUES
(1,'Java Programming','James Gosling',650),
(2,'Spring Boot Basics','Rod Johnson',750),
(3,'Hibernate Essentials','Gavin King',800),
(4,'Data Structures','Mark Allen',550);