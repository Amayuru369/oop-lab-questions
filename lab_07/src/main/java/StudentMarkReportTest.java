/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class StudentMarkReportTest {
    public static void main(String[] args) {
        String[] marks = {"78", "82", "absent", "90"};
        StudentMarkReport report = new StudentMarkReport(marks);

        // Part B: Test an Invalid Array Index
        try {
            int mark1 = report.getMarkAt(6);
            System.out.println("Mark: " + mark1);
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Error: Selected mark position does not exist.");
        } finally {
            System.out.println("Array access checking completed.");
        }

        
        try {
            int mark2 = report.getMarkAt(2);
            System.out.println("Mark: " + mark2);
        } catch (NumberFormatException e) {
            
            System.out.println("Error: Selected mark is not a valid number.");
        } finally {
            System.out.println("Number conversion checking completed.");
        }

        System.out.println("Report checking completed.");
    }
}