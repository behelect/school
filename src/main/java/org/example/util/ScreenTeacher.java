package org.example.util;

import org.example.model.Teacher;
import java.util.Scanner;

public class ScreenTeacher {
    public static void registerTeacher() {
        Scanner scanner = new Scanner(System.in);

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
    }
}
