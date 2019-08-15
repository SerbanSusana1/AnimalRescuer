package org.fasttrackit;

public class Dog extends Animal {
  private String color;


    @Override
    public void happinesLevel() {
        //super.happinesLevel();
        this.happinesLevel();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
