package org.eugen;

public class Vehicle {

    //instance variables

    String name;
    double fuelLevel;
    double mileage;
    double totalTraveledDistance;
    double maxSpeed;

    boolean damaged;
    String color;

    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + "is accelerationg with " + speed + "km/h for " + durationInHours + "h");

        //local variable
        double distance = speed * durationInHours;

        totalTraveledDistance = totalTraveledDistance + distance;

        //same results as the statement above
        //totalTraveledDistance += distance;

        System.out.println("Total traveled distance for vehicle " + name + ": " + totalTraveledDistance);

        double usedFuel = distance + mileage/100;

        fuelLevel -= usedFuel;
        System.out.println("remaining fuel for vehicle " + name + ": " + fuelLevel);

        return distance;
    }

}
