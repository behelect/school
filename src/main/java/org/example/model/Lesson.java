package org.example.model;

public class Lesson {
    private static String bookName;
    private String bookCode;

    public Lesson(String bookName, String bookCode) {
        Lesson.bookName = bookName;
        this.bookCode = bookCode;
    }

    public static String getBookName() {
        return bookName;
    }

    public String getBookCode() {
        return bookCode;
    }
}