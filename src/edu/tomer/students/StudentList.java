package edu.tomer.students;

import java.util.ArrayList;

/**
 * Created by hackeru on 06/02/2017.
 */
public class StudentList {
    ArrayList<Student> students = new ArrayList<>();

    public StudentList(){
        Student s = new Student();
        s.whatYourName();
    }
}
