package org.ncu.LibrarySystem;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Books {

    @Id
    private int bookId;

    private String bookName;

    public Books() {
    }

    public Books(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

}
