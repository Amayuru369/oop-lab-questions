/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooplab4;

public class Lab04Main {
    public static void main(String[] args) {
        
        StaffMember.showSystemName();
        UniversityPolicy.showPolicyHeader();

        
        Lecturer lec1 = new Lecturer("Dr. nimal siripala", "L001", "COST", 3, 50000.0);
        Lecturer lec2 = new Lecturer("Ms. ruwanthi", "L002", "COSC", 2, 45000.0);
        LabAssistant asst1 = new LabAssistant("Kamal Perera", "A005", "Engineering", 40, 800.0);

        System.out.println("\n--- Staff Count Information ---");
        
        System.out.println("Total Staff Records Created: " + StaffMember.getStaffCount());
    }
}
 


