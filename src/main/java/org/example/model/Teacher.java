package org.example.model;

public class Teacher {
    private String firstName;
    private String lastName;
    private int code;

    public Teacher(String firstName, String lastName, int code) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
}
