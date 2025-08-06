package org.example.model;

public class Lesson {
    private String bookName;
    private int bookCode;

    public Lesson(String bookName, int bookCode) {
        this.bookName = bookName;
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }
}
