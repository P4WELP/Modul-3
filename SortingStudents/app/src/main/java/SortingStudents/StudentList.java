/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingStudents;


import java.util.Collections;
import java.util.List;

/**
 *
 * @author Admin
 */
public class StudentList {
    private List<Student> students;
    
    public StudentList(List<Student> students){
        this.students = students;
    }
    
    public void displayList(String message){
        System.out.println(message);
        for (Student student : students) {
            System.out.println(student);
        }
    }
    
    public void sortStudents() {
    Collections.sort(students);
    }
}