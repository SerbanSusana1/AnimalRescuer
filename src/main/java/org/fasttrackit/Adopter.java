package org.fasttrackit;

public class Adopter {

   private String name;
   private double money;

   public void feed(String animal,String food){
       System.out.println("John just gave some  "+food +" food to "+animal);
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
