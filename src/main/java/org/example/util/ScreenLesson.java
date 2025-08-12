package org.example.util;

import org.example.model.Lesson;

import java.util.ArrayList;
import java.util.Scanner;

import static org.example.util.Screen.showAllLesson;

public class ScreenLesson {
    static ArrayList<Lesson> lessons = new ArrayList<>();

    public static void registerLesson() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Book Name: ");
            String bookName = scanner.nextLine();
            String bookCode;
            while (true) {
                System.out.print("Enter Book Code: ");
                String userInput = scanner.nextLine();
                try {
                    bookCode = userInput;
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Just enter a number!");
                }
            }
            Lesson lesson = new Lesson(bookName, bookCode);
            lessons.add(lesson);
            Screen.info();
            int enter = scanner.nextInt();
            if (enter == 1) {
                continue;
            }
            if (enter == 2) {
                showAllLesson();
                break;
            }
            if (enter == 3) {
                break;
            }
        }
    }
}
