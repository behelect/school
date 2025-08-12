package org.example.util;
import org.example.model.Teacher;
import java.util.Scanner;
import java.util.ArrayList;
public class ScreenTeacher {
    static ArrayList<Teacher> teachers = new ArrayList<>();
    public static void registerTeacher() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter Teacher Code: ");
            String code;
            while (true) {
                String input = scanner.nextLine();
                try {
                    code = input;
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number!");
                    System.out.print("Enter Teacher Code again: ");
                }
            }
            Teacher teacher = new Teacher(firstName, lastName, code);
            teachers.add(teacher);
            Screen.info();
            int enter = scanner.nextInt();
            scanner.nextLine();
            if (enter == 1) {
                continue;
            } else if (enter == 2) {
                Screen.showAllTeacher();
                break;
            } else if (enter == 3) {
                break;
            }
        }
    }
}