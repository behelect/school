package org.example.util;

import org.example.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

import static org.example.util.Screen.showAllStudents;

public class ScreenStudent {
    static ArrayList<Student> students = new ArrayList<>();

    public static void registerStudent() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter Date of Birth (yyyy-MM-dd): ");
            String birthDate = scanner.nextLine();
            Student student = new Student(firstName, lastName, birthDate);
            students.add(student);
            Screen.info();
            int enter = scanner.nextInt();
            scanner.nextLine();
            if (enter == 1) {
                continue;
            } else if (enter == 2) {
                showAllStudents();
                break;
            } else if (enter == 3) {
                break;
            }
        }
    }
}