package com.guesthouse.lab08;

public class StudentInsertMain {
    public static void main(String[] args) {
        // Creating a new student with ID 4 to avoid duplicate errors
        Student student4 = new Student(4, "Amila Perera", 88);
        
        // Create the DAO object
        StudentDAO dao = new StudentDAO();
        
        // Add the student to the database
        dao.addStudent(student4);
    }
}