package com.example.guicoffeshop;



public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price  = price;
    }
    public Product(double price){
        this.price =price;
    }
    public double getPrice(){return price;}
    public String getName(){return name;}



}