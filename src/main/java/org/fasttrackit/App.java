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






    }
}
