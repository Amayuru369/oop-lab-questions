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

        
        lec1.changeDepartment("Cyber Security");

        
        StaffMember[] staffMembers = {lec1, lec2, asst1};
        double totalMonthlyPayment = 0;

        System.out.println("\n--- Final Staff Summary ---");
        for (StaffMember staff : staffMembers) {
            staff.displayBasicDetails(); 
            
            double payment = staff.calculateMonthlyPayment(); 
            System.out.println("Monthly Payment: " + payment);
            
            staff.showCommonNotice(); 
            System.out.println("---------------------------------");
            
            totalMonthlyPayment += payment;
        }

        
        System.out.println("Total Monthly University Payout: " + totalMonthlyPayment);
        System.out.println("Total Staff Records Managed: " + StaffMember.getStaffCount());
    }
}


