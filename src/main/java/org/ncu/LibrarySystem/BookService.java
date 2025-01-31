package org.ncu.LibrarySystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService{

    @Autowired
    repository repo;

    public void getBooks() {

        List<Books> books = repo.findAll();

        for (Books temp : books) {
            int id = temp.getBookId();
            String name = temp.getBookName();
            System.out.println(id + " : " + name);
        }
    }
    public void getBook(int bookId) {
        Books book = repo.findById(bookId).orElse(new Books());
        System.out.println(book.getBookId()+" : "+ book.getBookName());
    }

    public void setBook(Books book){
        repo.save(book);
    }

    public void deleteBook(int bookId){
        repo.deleteById(bookId);
    }

}
