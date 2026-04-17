/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooplab4;


public class Lab04Main {
    public static void main(String[] args) {
    
    UniversityPolicy.showPolicyHeader();
    System.out.println("University: " + UniversityPolicy.UNIVERSITY_NAME);

    Lecturer lec1 = new Lecturer("Dr. nimal siripala", "L001", "COST", 3, 50000.0);
    LabAssistant asst1 = new LabAssistant("Kamal Perera", "A005", "Engineering", 40, 800.0);

    System.out.println("\n--- Staff Estimates ---");
    
    
    double lecPay = lec1.calculateMonthlyPayment();
    System.out.println(lec1.getFullName() + " Bonus: " + UniversityPolicy.calculateBonus(lecPay));

    
    double asstPay = asst1.calculateMonthlyPayment();
    System.out.println(asst1.getFullName() + " Bonus: " + UniversityPolicy.calculateBonus(asstPay));
}

}
 


