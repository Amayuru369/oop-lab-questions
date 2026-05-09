package com.mycompany.lab_05;

public class DeliveryChargeCalculator {
    private static final double DISTANCE_RATE = 100.0;
    private static final double WEIGHT_RATE = 50.0;
    private static final double EXPRESS_RATE = 500.0;

    public double calculateCharge(double baseCharge) {
        return baseCharge;
    }

    public double calculateCharge(double baseCharge, double distanceKm) {
        return baseCharge + (distanceKm * DISTANCE_RATE);
    }

    public double calculateCharge(double baseCharge, double distanceKm, double weightKg) {
        return baseCharge + (distanceKm * DISTANCE_RATE) + (weightKg * WEIGHT_RATE);
    }

    public double calculateCharge(double baseCharge, boolean expressDelivery) {
        return expressDelivery ? baseCharge + EXPRESS_RATE : baseCharge;
    }
}