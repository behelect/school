package org.example.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.example.model.Teacher;

public class ScreenTeacher {
    private static final List<String> teacherInfoLines = new ArrayList<>();

    public static void printTeacherInfo() {
        System.out.println("\nTeacher Info");
        for (String infoLine : teacherInfoLines) {
            System.out.println(infoLine);
        }
        System.out.println("------------------------");
    }

    public static void registerTeacher() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter Code: ");
            String code;
            while (true) {
                String input = scanner.nextLine();
                try {
                    code = input;
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Just enter the number!");
                    System.out.print("Enter Code again: ");
                }
            }

            Teacher teacher = new Teacher(firstName, lastName, code);

            System.out.println("----- Teacher Info -----");
            System.out.println("First Name: " + teacher.getFirstName());
            System.out.println("Last Name: " + teacher.getLastName());
            System.out.println("Code: " + teacher.getCode());
            System.out.println("------------------------");

            String teacherInfoLine = "First Name: " + firstName + "   Last Name: " + lastName + "   Code: " + code;
            teacherInfoLines.add(teacherInfoLine);

            System.out.println("Exit Enter (1)");
            System.out.println("Show Info (2)");
            System.out.println("New Teacher Enter (3)");
            int userChoice = scanner.nextInt();
            scanner.nextLine();

            if (userChoice == 1) {
                break;
            }
            if (userChoice == 2) {
                printTeacherInfo();
                break;
            }
            if (userChoice == 3) {
                continue;
            }
        }
    }
}
