package org.ncu.LibrarySystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LibrarySystemApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LibrarySystemApplication.class, args);
		BookService bookService = context.getBean(BookService.class);

		bookService.setBook(new Books(1,"The Great Gatsby"));
		bookService.setBook(new Books(2,"Harry Potter"));
		bookService.setBook(new Books(3,"The Witcher"));
		bookService.setBook(new Books(4,"The Game of Thrones"));

		bookService.getBooks();
		bookService.getBook(1);
		bookService.getBook(2);

		bookService.deleteBook(4);
		bookService.getBooks();
	}

}
