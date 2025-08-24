package org.example.util;
import java.io.*;
import org.example.model.Teacher;
import java.util.Scanner;
import java.util.ArrayList;
public class ScreenTeacher {
    private static final String FILE_NAME = "teacher.ser";
    static ArrayList<Teacher> teachers = loadTeacherFromFile();
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
            Teacher teacher = new Teacher(firstName, lastName,code);
            teachers.add(teacher);
            saveTeacherToFile();
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
    public static ArrayList<Teacher> getTeacher() {
        return teachers;
    }
    static void saveTeacherToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(teachers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static ArrayList<Teacher> loadTeacherFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<Teacher>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}