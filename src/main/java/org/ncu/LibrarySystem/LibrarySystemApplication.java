package org.ncu.LibrarySystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class LibrarySystemApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LibrarySystemApplication.class, args);
		BookService bookService = context.getBean(BookService.class);

		bookService.setBook(new Books(1,"The Great Gatsby"));
		bookService.setBook(new Books(2,"Harry Potter"));
		bookService.setBook(new Books(3,"The Witcher"));

		bookService.getBooks();
		bookService.getBook(1);
	}

}
