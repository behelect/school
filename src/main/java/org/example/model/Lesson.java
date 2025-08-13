package org.example.model;

import java.io.Serializable;

public class Lesson implements Serializable {
    private String bookName;
    private String bookCode;

    public Lesson(String bookName, String bookCode) {
        this.bookName = bookName;
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }
    public String getBookCode() {
        return bookCode;
    }
    public String toString() {
        return "BookName: " + bookName + "\nBookCode: " + bookCode;
    }
}
