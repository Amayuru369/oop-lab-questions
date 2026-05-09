/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooplab4;


public class LabAssistant extends StaffMember {
    private int hoursWorked;
    private double hourlyRate;

    public LabAssistant(String fullName, String staffid, String department, int hoursWorked, double hourlyRate) {
        super(fullName, staffid, department); 
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

   
    public double calculateMonthlyPayment() {
        return hoursWorked * hourlyRate; 
    }

    public void displayLabAssistantDetails() {
        displayBasicDetails(); 
        System.out.println("Role: Lab Assistant | Hours: " + hoursWorked + " | Rate: " + hourlyRate);
    }
}