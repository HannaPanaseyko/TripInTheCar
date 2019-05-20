package Lesson5HW;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Car extends Agregat {
    private String mark;
    private String model;
    private Engine engine;
    private Passenger[] passengers;
    private int capacity;
    private int quantityOfFuel;

    public Car(int wight, String type, String countryOfCreate, String mark, String model, Engine engine,
               Passenger[] passengers, int capacity, int quantityOfFuel) {
        super(wight, type, countryOfCreate);
        this.mark = mark;
        this.model = model;
        this.engine = engine;
        this.passengers = passengers;
        this.capacity = capacity;
        this.quantityOfFuel = quantityOfFuel;
    }



    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Passenger[] getPassengers() {

        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getQuantityOfFuel() {
        return quantityOfFuel;
    }

    public void setQuantityOfFuel(int quantitiOfFuel) {
        this.quantityOfFuel = quantitiOfFuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return capacity == car.capacity &&
                quantityOfFuel == car.quantityOfFuel &&
                Objects.equals(mark, car.mark) &&
                Objects.equals(model, car.model) &&
                Objects.equals(engine, car.engine) &&
                Arrays.equals(passengers, car.passengers);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(mark, model, engine, capacity, quantityOfFuel);
        result = 31 * result + Arrays.hashCode(passengers);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", passengers=" + Arrays.toString(passengers) +
                ", capacity=" + capacity +
                ", quantityOfFuel=" + quantityOfFuel +
                '}';
    }
}
