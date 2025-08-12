package org.example.util;
import org.example.model.Lesson;
import org.example.model.Student;
import org.example.model.Teacher;
import static org.example.util.ScreenStudent.students;
import static org.example.util.ScreenLesson.lessons;
import static org.example.util.ScreenTeacher.teachers;
public class Screen {
    public static void show() {
        System.out.println("----- Select an Option -----");
        System.out.println("1. Add Student");
        System.out.println("2. Add Teacher");
        System.out.println("3. Add Lesson");
        System.out.println("4. Show All Information");
        System.out.println("----------------------------");
    }
    public static void info() {
        System.out.println("1. New Entry");
        System.out.println("2. All Registered");
        System.out.println("3. Exit");
    }
    public static void showAllStudents() {
        for (Student student : students) {
            System.out.println("-------- Student Information --------");
            System.out.println("First Name: " + student.getFirstName() + "\nLast Name: " + student.getLastName() + "\nAge: " + student.getAge());
        }
    }
    public static void showAllLesson() {
        for (Lesson lesson : lessons) {
            System.out.println("-------- Lesson Information --------");
            System.out.println("Book Name: " + lesson.getBookName() + "\nBook Code: " + lesson.getBookCode());
        }
    }
    public static void showAllTeacher() {
        for (Teacher teacher : teachers) {
            System.out.println("-------- Teacher Information --------");
            System.out.println("First Name: " + teacher.getFirstName() + "\nLast Name: " + teacher.getLastName() + "\nTeacher Code: " + teacher.getTeacherCode());
        }
    }
}