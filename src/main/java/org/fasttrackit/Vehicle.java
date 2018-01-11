package org.fasttrackit;

public class Vehicle {

    public static final String controlType = "Radio Control";

    private String name;
    private String color;
    private double currentSpeed;
    private double traveledDistance;
    private double mileage;
    private double fuelLevel;

    public void accelerate(double speed) {
        System.out.println("Accelerate implementation from AutoVehicle.");

        double finalSpeed = getCurrentSpeed() + speed;
        setCurrentSpeed(finalSpeed);

        double traveledDistance = finalSpeed / 60;

        double spentFuel = traveledDistance * mileage / 100;

        double currentFuel = traveledDistance * mileage / 100;

        fuelLevel -= spentFuel;

        traveledDistance += currentSpeed / 60;
//      same as
//      fuelLevel = fuelLevel - spentFuel;

           traveledDistance += currentSpeed / 60;
    }

    public double accelerate(double speed, double time) {
        return 20;

    }


    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
