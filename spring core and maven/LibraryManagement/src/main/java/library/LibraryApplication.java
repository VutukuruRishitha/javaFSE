package library;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import libraryservice.BookService;

public class LibraryApplication {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml")) {

            BookService service = context.getBean("bookService", BookService.class);
            service.displayService();
        }
    }
}