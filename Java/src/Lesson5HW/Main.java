package Lesson5HW;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Which fuel supplements the car has?");
        Util util = new Util();
        Scanner scanner = new Scanner(System.in);
        int fuelInTheCar = scanner.nextInt();

        Random random = new Random();
        int passengers = random.nextInt(7);
        int distance = random.nextInt(1000);
        int stopKm = random.nextInt(distance);

        Engine engine = new Engine(150, 600);
        Car car = new Car(2000, "Auto", "Japan", "Toyota", "Capry", new Engine(150, 600), new Passenger[passengers], passengers, 50);

        double fuelS = Util.FuelForKm(engine);
        double neededFuel = (100 * fuelS) / distance;

        if (fuelInTheCar >= neededFuel) {
            System.out.println("Car should reach the right destination!");
            Util.go(car);
            Util.start(car);
            car.getPassengers();
            System.out.println("\n" + "Quantity of places in the car is " + passengers + "\n");

            if (passengers == 0) {
                System.out.println("This car is broken.");
            } else {
                System.out.println("One place is for a car's driver.");
            }

            Passenger passenger1 = new Passenger("Andy", 20,false);
            Passenger passenger2 = new Passenger("KimChenIn", 20,false);
            Passenger passenger3 = new Passenger("Donald", 20, false);

            Util.sitInCar(car, passenger1);
            Util.sitInCar(car, passenger2);
            Util.stop(car);
            System.out.println("Destination for " + passenger2 + "is on the " + stopKm + " km. That is why we stopped.");
            Util.getOutOfCar(car, passenger2);
            Util.sitInCar(car, passenger3);
            Util.start(car);
            System.out.println(passenger2 + "Asked to leave the car, he changed his mind about destination.");
            Util.stop(car);
            Util.getOutOfCar(car, passenger1);
            Util.start(car);
            System.out.println("Passenger and the driver decided to take a break for a meal.");
            Util.stationForABreak(car, passenger3);
            Util.start(car);
            System.out.println("We reached the destination!");
            Util.stop(car);

        } else {
            Util.stop(car);
            System.out.println("Car cannot reach the right destination! Fuel would be finished.");
        }

        System.out.println("\n" + car.toString());
    }

}
