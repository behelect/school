package org.example;

import org.example.model.Student;
import java.util.Scanner;

public class ScreenStudent {

    public static void registerStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        int age;
        while (true) {
            System.out.print("Enter Age: ");
            String userInput = scanner.nextLine();
            try {
                age = Integer.parseInt(userInput);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Just enter a number!");
            }
        }

        Student student = new Student(firstName, lastName, age);

        System.out.println("----- Student Info -----");
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Age: " + student.getAge());
        System.out.println("------------------------");
    }
}
