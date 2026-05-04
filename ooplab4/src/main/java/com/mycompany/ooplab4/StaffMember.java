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

    // Getters
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

  
    

    public void changeDepartment(String newDepartment) {
        if (newDepartment != null && !newDepartment.trim().isEmpty()) {
            this.department = newDepartment;
        }
    }

    
    public final void showCommonNotice() {
        System.out.println("Common Notice: Please submit your monthly reports by the 25th.");
    }

    
}