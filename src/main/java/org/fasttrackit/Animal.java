package org.fasttrackit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Animal {

    private String name;
    private double age;
    private double health;
    private double hangerLevel;
    private double hapinessLevel;
    private String animalFood;
    private String activities;

    public void happinesLevel() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese enter happiness: ");

        String happines = scanner.nextLine();  // Read user input
        System.out.println(getName() + " is :" + happines);

    }


    public Animal() {
        this.setName("Loby");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHangerLevel() {
        return hangerLevel;
    }

    public void setHangerLevel(double hangerLevel) {
        this.hangerLevel = hangerLevel;
    }

    public double getHapinessLevel() {
        return hapinessLevel;
    }

    public void setHapinessLevel(double hapinessLevel) {
        this.hapinessLevel = hapinessLevel;
    }

    public String getAnimalFood() {
        return animalFood;
    }

    public void setAnimalFood(String animalFood) {
        this.animalFood = animalFood;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }
}
