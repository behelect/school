package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Screen.show();
            Scanner input = new Scanner(System.in);
            switch (input.nextInt()) {
                case 1:
                    ScreenStudent.registerStudent();
                    break;
                case 2:ScreenTeacher.registerTeacher();
                    break;
                case 3:ScreenLesson.registerLesson();
                    break;
            }
        }
    }
}