package org.example.util;

import org.example.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static org.example.util.Screen.showAllStudents;

public class ScreenStudent {
    private static final String FILE_NAME = "student.ser";
    static ArrayList<Student> students = loadStudentFromFile();

    public static void registerStudent() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter Date of Birth (yyyy-MM-dd): ");
            String birthDate = scanner.nextLine();
            Student student = new Student(firstName, lastName,birthDate);
            students.add(student);

            saveStudentToFile();

            Screen.info();
            int enter = scanner.nextInt();
            scanner.nextLine();
            if (enter == 1) {
                continue;
            } else if (enter == 2) {
                showAllStudents();
                break;
            } else if (enter == 3) {
                break;
            }
        }
    }
    public static ArrayList<Student> getStudents() {
        return students;
    }

    static void saveStudentToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Student> loadStudentFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}