package Lesson5HW;

import java.util.Objects;
import java.util.Random;

public class Passenger {
    private String name;
    private int age;
    private boolean food;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFood() {
        return food == true;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public Passenger(String name, int age, boolean food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return age == passenger.age &&
                Objects.equals(name, passenger.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }




}
