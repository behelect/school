package org.example.util;
import org.example.model.Lesson;
import org.example.model.Student;
import org.example.model.Teacher;
public class Screen {
    public static void show() {
        System.out.println("------------------- Select an Option -------------------");
        System.out.println("1_Add Student" + "           " + "5_Delete all students"+ "      " + "9_Exit");
        System.out.println("2_Add Teacher" + "           " + "6_Delete all Teacher");
        System.out.println("3_Add Lesson" + "            " + "7_Delete all Lesson" );
        System.out.println("4_All Registrations" + "     " + "8.All Cleared");
    }

    public static void info() {
        System.out.println("1_New Entry");
        System.out.println("2_All Registered");
        System.out.println("3_Exit");
    }

    public static void showAllStudents() {
        for (Student student : ScreenStudent.getStudents()) {
            System.out.println("--Student--");
            System.out.println(student);
        }
    }
    public static void showAllLesson() {
        for (Lesson lesson : ScreenLesson.getLessons()) {
            System.out.println("--Lesson--");
            System.out.println(lesson);
        }
    }
    public static void showAllTeacher() {
        for (Teacher teacher : ScreenTeacher.getTeacher()) {
            System.out.println("--Teacher--");
            System.out.println(teacher);
        }
    }
    public static void showAllInformation() {
        System.out.print("__Registered Students\n");
        Screen.showAllStudents();
        System.out.print("__Registered Teachers\n");
        Screen.showAllTeacher();
        System.out.println("__Registered Lesson");
        Screen.showAllLesson();
    }
}