/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class StudentAverageTest {
    public static void main(String[] args) {
        // Create one StudentAverageCalculator object with 0 students
        StudentAverageCalculator calculator = new StudentAverageCalculator(500, 0);

        try {
            int average = calculator.calculateAverage();
            System.out.println("Average: " + average);
        } catch (ArithmeticException e) {
            // This exception occurs because we are attempting integer division by zero.
            System.out.println("Error: Number of students cannot be zero.");
        } finally {
            System.out.println("Average calculation completed.");
        }

        System.out.println("Program continues...");
    }
}