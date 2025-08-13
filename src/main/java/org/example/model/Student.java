package org.example.model;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

public class Student implements Serializable {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Student(String firstName, String lastName, String birthDateStr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = LocalDate.parse(birthDateStr);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public String toString() {
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nDate Of Birth: " + dateOfBirth;
    }
}
