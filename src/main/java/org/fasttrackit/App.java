package org.fasttrackit;

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

    }
}
