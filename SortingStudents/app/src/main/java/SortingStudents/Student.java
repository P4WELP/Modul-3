/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingStudents;

/**
 *
 * @author Admin
 */
public class Student implements Comparable<Student> {
    private int age;
    private double height;
    private String name;
    private String lastName;
    
    public Student(int age, double height, String name, String lastName) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.lastName = lastName;
    }
    
     @Override
    public int compareTo(Student other) {
        int lastNameComparison = this.lastName.compareTo(other.lastName);
        if (lastNameComparison == 0) {
            return Integer.compare(this.age, other.age);
        } else {
            return lastNameComparison;
        }
    }
    
       @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    
}
