package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {
    Animal animal;
    Adopter resquer;
    Vet vet1;
    Dog dog;
    AnimalFood selectedFood;
    Activities selectedActivities;

    private List<AnimalFood> availableFood = new ArrayList<>();
    private Activities[] availableActivities = new Activities[2];

    public Game(Animal animal) {
        this.animal = animal;
    }


    public void start() throws Exception {

        initAnimal();
        initResquer();

        initFood();
        initActivities();
//        displayFood();


        //requireFeeding();
        // requireActivitiy();


//        displayActivities();


        //nameAnimal();


        for (int i = 0; i < 2; i++) {
            String animalName = nameAnimal();
            animal.happinesLevel();
            animal.hangerLevel();

            if (animal.getHangerLevel() < 7) {
                requireFeeding();
                System.out.println(animalName + " is not hungry");

            } else {
                if (animal.getHapinessLevel() > 5) {
                    requireActivitiy();
                    System.out.println(animalName + " is happy");
                }
            }
            System.out.println("next rounde");
        }


    }


    private void initActivities() {
        Activities walk = new Activities();
        walk.setName("Walk");

        availableActivities[0] = walk;

        Activities play = new Activities();
        play.setName("Play");

        availableActivities[1] = play;
    }

    private void displayActivities() {
        System.out.println("Avaible activities");
        for (int i = 0; i < availableActivities.length; i++) {
            if (availableActivities[i] != null) {
                System.out.println(availableActivities[i].getName());
            }
        }

    }


    private void initFood() throws Exception {
        for (int i = 0; i < 2; i++) {
            AnimalFood animalFood = new AnimalFood();
            animalFood.setName(getFoodNameFromUser());
            animalFood.setPrice(10.2);
            animalFood.setQuantity(2);

            availableFood.add(animalFood);
        }
    }

    private String getFoodNameFromUser() throws Exception {
        System.out.println("Please enter food name: ");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextLine();
        } catch (InputMismatchException e) {
            throw new Exception("Enter an valid value : ");
        }

    }

    private void displayFood() {

        System.out.println("The food are :");
        int index = 0;
        for (AnimalFood food : availableFood) {
            if (food != null) {
                System.out.println(index + ". " + food.getName() + " - price : " + food.getPrice()
                        + " - quantity: " + food.getQuantity());
            }
            index++;
        }

    }

    private void initAnimal() {
        dog = new Dog();
        dog.setName("Loby");
        dog.setAge(5);
        dog.setHealth(6);
        dog.setHangerLevel(5);
        dog.setHapinessLevel(8);
        dog.setAnimalFood("pedigree");
        dog.setActivities("play");
        dog.setColor("brown");
    }

    private void initResquer() throws Exception {
        resquer = new Adopter();
        System.out.println("Please enter adopter name :");
        Scanner scanner = new Scanner(System.in);
        try {
            resquer.setName(scanner.nextLine());
        } catch (InputMismatchException e) {
            throw new Exception("Please enter a valid name");
        }
    }

    private String nameAnimal() {
        System.out.println("please enter the animal name");
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        return name1;
    }

    private String selectFood() {
        System.out.println("Please choose a food:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private void requireFeeding() {
        displayFood();
        Integer selectedFoodIndex = Integer.parseInt(selectFood());
        selectedFood = availableFood.get(selectedFoodIndex);
        if (selectedFood == null) {
            System.out.println("Select correct food");
            requireFeeding();
        } else {
            resquer.feed(dog, selectedFood);
        }
    }

    private String selectActivity() {
        System.out.println("Please choise an activity :");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private void requireActivitiy() {
        displayActivities();
        Integer selectedActivitiesIndex = Integer.parseInt(selectActivity());
        selectedActivities = availableActivities[selectedActivitiesIndex];
        if (selectedActivities == null) {
            System.out.println("Select corect activities ");
            requireActivitiy();
        } else {
            resquer.activites(dog, selectedActivities);
        }

    }
}
