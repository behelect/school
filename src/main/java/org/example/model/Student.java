package org.example.model;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

public class Student implements Serializable {
    private String firstName;
    private String lastName;
    private static LocalDate dateOfBirth;
    private int age;

    public Student(String firstName, String lastName, String birthDateStr, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = LocalDate.parse(birthDateStr);
        this.age = Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();

    }
    public String toString() {
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nDate Of Birth: " + dateOfBirth+"\nAge:"+age;
    }
}
