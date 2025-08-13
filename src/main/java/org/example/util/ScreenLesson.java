package org.example.util;

import org.example.model.Lesson;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static org.example.util.Screen.showAllLesson;

public class ScreenLesson {
    private static final String FILE_NAME = "lessons.ser";
    static ArrayList<Lesson> lessons = loadLessonsFromFile();

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
            lessons.add(lesson);

            saveLessonsToFile();

            Screen.info();
            int enter = scanner.nextInt();
            scanner.nextLine();
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

    public static ArrayList<Lesson> getLessons() {
        return lessons;
    }

    static void saveLessonsToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(lessons);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Lesson> loadLessonsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<Lesson>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
