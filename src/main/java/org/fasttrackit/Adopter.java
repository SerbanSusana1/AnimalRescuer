package org.fasttrackit;

public class Adopter {

   private String name;
   private double money;


   public void feed(Animal animal, AnimalFood food){
       System.out.println(getName() + " just gave some  " + food.getName() + " food to "+animal.getName());

       System.out.println(animal.getHangerLevel());
       animal.setHangerLevel(animal.getHangerLevel() + 1);
       System.out.println(animal.getHangerLevel());


   }

   public void activites(Animal animal, Activities activities){
       System.out.println(getName()+" "+ activities.getName() +" with "+ animal.getName());
       System.out.println(animal.getHapinessLevel());
       animal.setHapinessLevel(animal.getHapinessLevel() - 1);
       System.out.println(animal.getHapinessLevel());
   }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
