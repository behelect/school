package org.example.util;

import org.example.model.Lesson;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ScreenLesson {
    private static List<String> lessonInfoLines = new ArrayList<>();

    public static List<String> printLessonInfo() {
        System.out.println("\nLesson Info");
        for (String infoLine : lessonInfoLines) {
            System.out.println(infoLine);
        }
        System.out.println("------------------------");
        return lessonInfoLines;
    }

    public static void registerLesson() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
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

            System.out.println("-------- Lesson Info --------");
            System.out.println("Book Name: " + lesson.getBookName());
            System.out.println("Book Code: " + lesson.getBookCode());
            System.out.println("-----------------------------");

            String lessonInfoLine = "Book Name: " + bookName + "   Book Code: " + bookCode;
            lessonInfoLines.add(lessonInfoLine);

            System.out.println("Exit Enter (1)");
            System.out.println("Show Info (2)");
            System.out.println("New Lesson Enter (3)");
            int userChoice = scanner.nextInt();
            scanner.nextLine();

            if (userChoice == 1) {
                break;
            }
            if (userChoice == 2) {
                printLessonInfo();
                break;
            }
            if (userChoice == 3) {
                continue;
            }
            System.out.println("------------------------");
        }
    }
}
