package org.example.model;

public class Lesson {
    private String bookName;
    private String bookCode;

    public Lesson(String bookName, String bookCode) {
        this.bookName = bookName;
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }
}
