package com.mycompany.lab_05;

public class DeliveryChargeTest {
    public static void main(String[] args) {
        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        System.out.println("Base charge: " + calculator.calculateCharge(1000.0));
        System.out.println("With distance: " + calculator.calculateCharge(1000.0, 5.0));
        System.out.println("With distance and weight: " + calculator.calculateCharge(1000.0, 5.0, 10.0));
        System.out.println("With express delivery: " + calculator.calculateCharge(1000.0, true));

        
    }
}