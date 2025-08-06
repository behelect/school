package org.example.util;

import org.example.model.Lesson;
import java.util.Scanner;

public class ScreenLesson {

    public static void registerLesson() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Book Name: ");
        String bookName = scanner.nextLine();

        int bookCode;
        while (true) {
            System.out.print("Enter Book Code: ");
            String userInput = scanner.nextLine();
            try {
                bookCode = Integer.parseInt(userInput);
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
    }
}
