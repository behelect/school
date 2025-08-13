package org.example.model;
import java.io.Serializable;

public class Teacher implements Serializable {
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
    public String toString() {
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nTeacher Code: " + teacherCode;
    }
}
