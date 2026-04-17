/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooplab4;

public abstract class StaffMember {
    private String fullName;
    private final String staffid;
    protected String department;
    
    
    private static int staffCount = 0;

    public StaffMember(String fullName, String staffid, String department) {
        this.fullName = fullName;
        this.staffid = staffid;
        this.department = department;
        staffCount++; 
    }

    
    public String getFullName() { return fullName; }
    public String getStaffid() { return staffid; }
    public String getDepartment() { return department; }

    
    public final void displayBasicDetails() {
        System.out.println("ID: " + staffid + " | Name: " + fullName + " | Dept: " + department);
    }

    
    public abstract double calculateMonthlyPayment();
    
    
    public static void showSystemName() {
        System.out.println("--- Campus Staff Payment System ---");
    }
    
    public static int getStaffCount() { return staffCount; }
}