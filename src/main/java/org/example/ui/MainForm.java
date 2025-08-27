package org.example.ui;

import javax.swing.*;

public class MainForm {
    public MainForm() {
        //createAndShowGUI();
    }

    public void createAndShowGUI() {
        JFrame frame = new JFrame("My Main GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 600);
        frame.setLocationRelativeTo(null);
        JMenuBar menuBar=createMenu();
        frame.setJMenuBar(menuBar);

        JButton button = new JButton("Hello To All!");
        button.setSize(10, 10);
        button.setLocation(10, 10);
        frame.getContentPane().add(button);

        frame.setVisible(true);

    }

    public JMenuBar createMenu()
    {
        JMenuBar menuBar = new JMenuBar();
        //
        JMenu systemMenu = new JMenu("System Menu");
        JMenuItem createUser =new JMenuItem ("Create User");
        systemMenu.add(createUser);
        JMenuItem  createLesson =new JMenuItem ("Create Lesson");
        systemMenu.add(createLesson);
        JMenuItem createTeacher = new JMenuItem ("Create Teacher");
        systemMenu.add(createTeacher);
        JMenuItem createStudent = new JMenuItem ("Create Student");
        systemMenu.add(createStudent);
        //
        menuBar.add(systemMenu);
        //
        JMenu lessonMenu = new JMenu("Lesson");
        JMenuItem  teacherLesson =new JMenuItem ("Assign Lesson");
        lessonMenu.add(teacherLesson);
        menuBar.add(lessonMenu);
        //
        JMenu teacherMenu = new JMenu("Teacher");
        JMenuItem scoreTeacher = new JMenuItem ("Enter Score");
        teacherMenu.add(scoreTeacher);
        menuBar.add(teacherMenu);
        //
        JMenu studentMenu = new JMenu("Student");
        JMenuItem myScoreStudent = new JMenuItem ("My Score");
        studentMenu.add(myScoreStudent);
        menuBar.add(studentMenu);
        return menuBar;
    }
}
