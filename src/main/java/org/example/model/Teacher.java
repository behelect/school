package org.example.model;

public class Teacher {
    private String firstName;
    private String lastName;
    private String teacherCode;

    public Teacher(String firstName, String lastName, String teacherCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.teacherCode = teacherCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTeacherCode() {
        return teacherCode;
    }
}
