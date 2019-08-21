package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args ) throws Exception
    {
        Animal animal = new Animal();

        animal.setName("Sasha");
        animal.setAge(5);
        animal.setHealth(8);
        animal.setHangerLevel(9);
        animal.setHapinessLevel(8);
        animal.setAnimalFood("pedigre");
        animal.setActivities("play");

        Adopter adopter = new Adopter();

        adopter.setName("Popescu");
        adopter.setMoney(300.5);

         AnimalFood animalFood = new AnimalFood();

         animalFood.setName("Royal Canin");
         animalFood.setPrice(10.5);
         animalFood.setQuantity(10);
         animalFood.setExpirationDate(LocalDate.of(2019 ,10,25));


         animalFood.setStock(15);



        Activities activites = new Activities();

            activites.setName("Play");

        Vet vet = new Vet();
         vet.setName("John");
         vet.setSpeciality("surgeon");

        Animal dog = new Animal();
        dog.setName("Loby");

        Adopter resquer = new Adopter();
         resquer.setName("Ana");

         Vet vet1 = new Vet();
         vet1.setName("Crisan");

         Adopter resquer1 = new Adopter();
         resquer1.setName("john");

        //Dog dog1 =new Dog();


        animal.happinesLevel();
        dog.happinesLevel();
        resquer1.feed(animal,animalFood);
        resquer1.activites(animal,activites);

        Game game= new Game(animal);

        game.start();


    }
}
