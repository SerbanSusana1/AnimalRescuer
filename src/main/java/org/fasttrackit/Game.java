package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {
    Animal animal;
    Adopter resquer;
    Vet vet1;


    private List<AnimalFood> availableFood = new ArrayList<>();
    private Activities[] availableActivities = new Activities[2];

    public Game(Animal animal) {
        this.animal = animal;
    }


    public void start() throws Exception {

        initFood();
        displayFood();

        initActivities();
        displayActivities();


    }


        private  void initActivities(){
            Activities walk = new Activities();
            walk.setName("Walk");

            availableActivities[0]= walk;

            Activities play = new Activities();
            play.setName("Play");

            availableActivities[1]=play;
        }

        private void displayActivities(){
            System.out.println("Avaible activities");
            for(int i=0; i<availableActivities.length; i++){
                if (availableActivities[i] != null){
                    System.out.println( availableActivities[i].getName());
                }
            }

        }




    private void initFood() throws Exception {
        for(int i = 0; i < 2; i++) {
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
        for (int i = 0; i < availableFood.size(); i++) {
            if (availableFood != null) {
                System.out.println(availableFood.get(i).getName() + "-price : " + availableFood.get(i).getPrice()
                        + "- quantity: " + availableFood.get(i).getQuantity());
            }


        }

    }


}
