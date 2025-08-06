package org.example.util;

import java.util.Scanner;

import static org.example.util.ScreenLesson.printLessonInfo;
import static org.example.util.ScreenStudent.printStudentInfo;
import static org.example.util.ScreenTeacher.printTeacherInfo;


public class Main {
    public static void main(String[] args) {
        while (true) {
            Screen.show();
            Scanner input = new Scanner(System.in);
            switch (input.nextInt()) {
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
                    printStudentInfo();
                    printLessonInfo();
                    printTeacherInfo();
                    break;
            }
        }
    }
}