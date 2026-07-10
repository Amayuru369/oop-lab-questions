/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.guesthouse.lab08;

public class StudentSearchUpdateMain {
    public static void main(String[] args) {
        // Create a StudentDAO object
        StudentDAO dao = new StudentDAO();
        
        System.out.println("--- Before Update ---");
        // Call findStudentById for ID 1
        dao.findStudentById(1);
        
        System.out.println("\n--- Updating Mark ---");
        // Call updateStudentMark for ID 1, changing mark to 95
        dao.updateStudentMark(1, 95);
        
        System.out.println("\n--- After Update ---");
        // Call findStudentById for ID 1 again to verify the change
        dao.findStudentById(1);
    }
}