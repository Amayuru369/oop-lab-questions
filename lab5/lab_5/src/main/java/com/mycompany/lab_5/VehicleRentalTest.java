/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_5;

public class VehicleRentalTest {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car("CAR-101", "Toyota", 3, 5000.0);
        Vehicle vehicle2 = new Bike("BIKE-202", "Honda", 4, 800.0);

        vehicle1.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle1.calculateRentalCost());
        System.out.println();

        vehicle2.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle2.calculateRentalCost());

    
    }
}