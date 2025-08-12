package org.example.util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            Screen.show();
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    ScreenStudent.registerStudent();
                    break;
                case 2:
                    ScreenTeacher.registerTeacher();
                    break;
                case 3:
                    ScreenLesson.registerLesson();
                    break;
                case 4:
                    Screen.showAllStudents();
                    Screen.showAllLesson();
                    Screen.showAllTeacher();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}