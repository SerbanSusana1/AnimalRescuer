package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Animal();

        animal.name = "Sasha";
        animal.age = 5;
        animal.health = 8;
        animal.hangerLevel=9;
        animal.mindset = 8;
        animal.animalFood = "pedigre";
        animal.activities ="play";


        Adopter adopter = new Adopter();

        adopter.name="Popescu";
        adopter.money=300.50;

         AnimalFood animalFood = new AnimalFood();

         animalFood.name ="Royal Canin";
         animalFood.price = 10.5;
         animalFood.quantity = 10;
         animalFood.expirationDate= LocalDate.of(2019 ,10,25);


         animalFood.stock = 15;



        Activities activites = new Activities();

            activites.name = "Play";

        Vet vet = new Vet();
         vet.name = "John";
         vet.speciality="surgeon";

        Animal dog = new Animal();
        dog.name = "Loby";

        Adopter resquer = new Adopter();
         resquer.name = "Ana";

         Vet vet1 = new Vet();
         vet1.name = "Crisan";


    }
}
