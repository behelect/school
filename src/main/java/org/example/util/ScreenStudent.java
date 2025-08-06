package org.example.util;

import org.example.model.Student;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScreenStudent {
    private static List<String> studentInfoLines = new ArrayList<>();

    public static List<String> printStudentInfo() {
        System.out.println("\nStudent Info");
        for (String infoLine : studentInfoLines) {
            System.out.println(infoLine);
        }
        System.out.println("------------------------");
        return studentInfoLines;
    }

    public static void registerStudent() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\nEnter First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter Date of Birth (yyyy-MM-dd): ");
            LocalDate birthDate = LocalDate.parse(scanner.nextLine());

            Student student = new Student(firstName, lastName, birthDate);
            int age = Period.between(birthDate, LocalDate.now()).getYears();

            System.out.println("----- Student Info -----");
            System.out.println("First Name: " + student.getFirstName());
            System.out.println("Last Name: " + student.getLastName());
            System.out.println("Age: " + age);
            System.out.println("------------------------");

            String studentInfoLine = "First Name: " + firstName + "   Last Name: " + lastName + "   Age: " + age;
            studentInfoLines.add(studentInfoLine);

            System.out.println("Exit Enter (1)");
            System.out.println("Show Info (2)");
            System.out.println("New Student Enter (3)");
            int userChoice = scanner.nextInt();
            scanner.nextLine();

            if (userChoice == 1) {
                break;
            }
            if (userChoice == 2) {
                printStudentInfo();
                break;
            }
            if (userChoice == 3) {
                continue;
            }
            System.out.println("------------------------");
        }
    }
}
