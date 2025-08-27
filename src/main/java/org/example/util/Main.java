package org.example.util;
import org.example.ui.MainForm;

import java.util.Scanner;
import static org.example.util.ScreenLesson.lessons;
import static org.example.util.ScreenLesson.saveLessonsToFile;
import static org.example.util.ScreenStudent.saveStudentToFile;
import static org.example.util.ScreenStudent.students;
import static org.example.util.ScreenTeacher.saveTeacherToFile;
import static org.example.util.ScreenTeacher.teachers;
public class Main {
    public static void main(String[] args) {
        MainForm mainForm= new MainForm();
        mainForm.createAndShowGUI();
        //
        Scanner input = new Scanner(System.in);
        Screen.showAllInformation();
        while (true) {
            Screen.show();
            int choice = input.nextInt();
            switch (choice) {
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
                    Screen.showAllStudents();
                    Screen.showAllLesson();
                    Screen.showAllTeacher();
                    break;
                case 5:
                    students.clear();
                    saveStudentToFile();
                    break;
                case 6:
                    teachers.clear();
                    saveTeacherToFile();
                    break;
                case 7:
                    lessons.clear();
                    saveLessonsToFile();
                    break;
                case 8:
                    lessons.clear();
                    saveLessonsToFile();
                    students.clear();
                    saveStudentToFile();
                    teachers.clear();
                    saveTeacherToFile();
                    break;
            }
            if (choice == 9) {
                break;
            }
        }
    }
}