/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooplab4;


public class Lab04Main {
    public static void main(String[] args) {
    // Lecturer from Q2
    Lecturer lec1 = new Lecturer("Dr. nimal siripala", "L001", "Computing", 3, 50000.0);
    
    // Question 3: Create one LabAssistant object
    LabAssistant asst1 = new LabAssistant("Kamal Perera", "A005", "Engineering", 40, 800.0);

    System.out.println("--- Staff Information ---");
    lec1.displayLecturerDetails();
    System.out.println("Monthly Payment: " + lec1.calculateMonthlyPayment());
    
    System.out.println("-------------------------");
    
    asst1.displayLabAssistantDetails();
    System.out.println("Monthly Payment: " + asst1.calculateMonthlyPayment());
}
}

