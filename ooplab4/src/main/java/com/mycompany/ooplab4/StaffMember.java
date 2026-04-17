/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooplab4;

public abstract class StaffMember {
    private String fullName;      
    private final String staffid; 
    protected String department;  

    public StaffMember(String fullName, String staffid, String department) {
        this.fullName = fullName;
        this.staffid = staffid;
        this.department = department;
    }

    public String getFullName() { return fullName; }
    public String getStaffid() { return staffid; }
    public String getDepartment() { return department; }

    public final void displayBasicDetails() {
        System.out.println("Staff ID: " + staffid + " | Name: " + fullName + " | Dept: " + department);
    }

    public abstract double calculateMonthlyPayment();
}

