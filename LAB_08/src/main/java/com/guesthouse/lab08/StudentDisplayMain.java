/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.guesthouse.lab08;

public class StudentDisplayMain {
    public static void main(String[] args) {
        // Create the DAO object
        StudentDAO dao = new StudentDAO();
        
        // Call the method to display all records
        dao.displayAllStudents();
    }
}