package com.example.guicoffeshop;

public class Drink extends Product {
    final String size;

    double calories;
    double totalFat;
    double sugar;

    //setters
    public Drink( String name,double price, String size, double c, double t, double s){
        super(name,price);

        this.size =size;
        this.calories = c;
        this.totalFat = t;
        this.sugar = s;





    }
    //getters

    public String getSize(){
        return size;
    }
    public double getCalories(){
        return calories;
    }
    public double getFAT(){
        return totalFat;
    }
    public double getSUGAR(){
        return sugar;
    }



}
