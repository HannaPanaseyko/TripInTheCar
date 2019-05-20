package Lesson5HW;

import java.util.Objects;

public class Util {


    public static void start(Car car) {
        car.getEngine();
        System.out.println("Car is in motion.");
    }


    public static void stop(Car car) {
        car.getEngine();
        System.out.println("\n" + "Car was stopped");
    }

    public static void sitInCar(Car car, Passenger passenger) {
        if (car.getCapacity() > 0 && car.getCapacity() <= car.getPassengers().length) {
            for (int countOfPass = 1; countOfPass < car.getPassengers().length; countOfPass++) {
                if (isPassengerInCar(car,passenger)==false){
                if (car.getPassengers()[countOfPass] == null) {
                    car.getPassengers()[countOfPass] = passenger;
                    System.out.println(passenger + " sit in the car.");
                    break;

                }
            } else {
                    System.out.println(passenger +" is already in the car.");
                    break;
                }
            }
        }
    }

    public static void getOutOfCar(Car car, Passenger passenger) {
        for (int count = 1; count < car.getCapacity(); count++) {
            if (car.getPassengers()[count].equals(passenger)) {
                car.getPassengers()[count] = null;
                System.out.println("This place is free, because" + passenger + " left the car.");
                break;
            }
        }
    }
    public static boolean isPassengerInCar(Car car, Passenger passenger) {
        for (Passenger pass : car.getPassengers()) {
            if (Objects.nonNull(pass) && pass.equals(passenger)) {
                return true;
            }
        }
        return false;
    }
    public static void mealTime(Passenger passenger) {
        passenger.isFood();
        System.out.println(passenger + " is eating food.");
    }
    public static void go(Car car) {
        System.out.println("Mark and model of the car: "+car.getMark()+", "+car.getModel());
    }
    public static double FuelForKm(Engine engine) {
        int horsePow = engine.getHorsePower() ;
        double speedCount = (engine.getSpeed() *0.2) / 1000;
        double fuelSupplements = horsePow * speedCount;
       // System.out.println("An expected fuel supplements for 10 km is " + fuelSupplements);
       // System.out.println(fuelSupplements);
        return fuelSupplements;
    }
    public static void stationForABreak(Car car, Passenger passenger){
        stop(car);
        int count = 0;
        car.getPassengers()[count] = null;
        System.out.println("The car is empty");
        mealTime(passenger);
    }

}
