package com.company;

public class Dog{
    private int height;
    private double weight;
    private String name;

    public Dog(int height, double weight, String name) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void volk(){
         System.out.println("Hi human, I'm " + name);
    }
    public void introd(){
        System.out.println("height " + height + " weight " + weight);
    }
}
