package com.example.guicoffeshop;

import java.util.ArrayList;

//4/10/2024 PRODUCT CLASS WILL CONTAIN AN ARRAYLIST THAT WILL SAVE ALL THE SUB-CLASSES FROM THE PARENT CLASS "PRODUCTS", THIS DATA WILL BE LATER DISPLAY ON SCREEN

public class ProductCLASS {

    ArrayList<String> infolist = new ArrayList<>();
    //THIS ARRAYLIST WILL SAVE THE DATA FROM THE SUB-CLASSES OF THE PARENT CLASS PRODUCTS

    ArrayList<Product> Products = new ArrayList<>();
    public ProductCLASS(){

        Products.add(new Drink("Mocha", 12.90, "tall", 180, 0.5, 40/*price*/));
        Products.add(new Drink("Caramel Macchiato", 15.90, "short", 100, 1, 15/*price*/));
        Products.add(new Drink("Strawberries & Cream", 19.90, "tall", 170, 0.1, 38/*price*/));

        Products.add(new GiftCard(10.00, 10.00, "You are the best!"));
        Products.add(new GiftCard(25.00, 25.00, "I'm proud of you!"));
        Products.add(new GiftCard(50.00, 50.00, "You will always be on my mind!"));


        Products.add(new mug("St. Ride Day Branded-Mug", 75.00));
        Products.add(new mug("McMARKINB Branded-Mug", 75.00));
    }
    //THE FOLLOWING FUNCTIONS ITERATES  OVER PRODUCTS AND IDENTIFIES THE PRODUCTS  THAT ARE INSTANCE OF
    //THE "DRINK" SUBCLASS ADDING THE DATA INTO "INFOLIST" WHICH WILL LATER BE USE ON "SHOPLIST" AND "MOREINFOLIST"
    public String getDrinks() {

        infolist.clear();

        for (Product each : Products) {
            if (each instanceof Drink drink) {

                infolist.add(drink.getName());



            }

        }


        return infolist.toString();

    }

    public String getMugs(){
        //labelBuilder.setLength(0);
        infolist.clear();
        for (Product each : Products) {
            if (each instanceof mug mug) {
                //labelBuilder.append(mug.getName()).append("\n\n");
                infolist.add(mug.getName());
                //System.out.println(labelBuilder);


            }

        }
        //System.out.println(labelBuilder);
        //return labelBuilder.toString();
        return infolist.toString();


    }

    public String getGiftCard(){
        infolist.clear();

        for (Product each : Products) {
            if (each instanceof GiftCard giftcard) {
                //labelBuilder.append("Gift Card : " + giftcard.getSpecialMessage()).append("\n\n");

                //System.out.println(labelBuilder);
                infolist.add("Gift Card : " + giftcard.getSpecialMessage());


            }

        }
        //System.out.println(labelBuilder);
        return infolist.toString();
    }

    //SECOND SET OF FUNCTIONS FOR MOREINFOLIST (SECOND LISTVIEW):

    //THE FOLLOWING FUNCTION POPULATES THE "MOREINFOLIST" BASED ON USER INTERACTION
    //FIRST, THE FUNCTION TAKES AS AN INTEGER PARAMETER CALLED "CONTROL INFO" WHICH CORRESPONDS TO ONE OF THE THREE BUTTONS IN THE SCENE

    //THE IF STATEMENT WILL LATER CHECK IF THE VARIABLE IS ANY OF THE 3 POSSIBLE VALUES (1 - 2 - 3) EACH OF THESE
    //VALUES REPRESENTS THE 3 BUTTONS IN THE SCENE (DRINK , MUG, GIFTCARD).


    public String getProductPrice(int controlInfo){
        infolist.clear();

        if(controlInfo == 1) { //THIS WILL CONTROL THE OBJECT INFO, EX : IF CONTORL IS 1 IT WILL SHOW THE PRICE OF DRIBK AND IF IT IS 2 IT WILL SHOW THE PRICE OF THE GFT CARD
            for (Product each : Products) {
                if (each instanceof Drink drink) {

                    infolist.add("Price : " + drink.getPrice());
                }

            }

        }else if(controlInfo ==2 ){
            for(Product each: Products){
                if (each instanceof mug mug) {

                    infolist.add("Price : " + mug.getPrice());
                }
            }
        }else if(controlInfo ==3){
            for(Product each: Products){
                if (each instanceof GiftCard GC ) {

                    infolist.add("Price : " + GC.getPrice());

                }
            }
        }

        return infolist.toString();
    }

    //DRINK RELATED FUNCTIONS (GETTERS)

    public String getProductCalories(int controlInfo){
        infolist.clear();
        if(controlInfo == 1) {
            for (Product each : Products) {
                if (each instanceof Drink drink) {
                    infolist.add("Calories : " + drink.getCalories());
                }

            }

        }
        return infolist.toString();


    }

    public String getProductFat(int controlInfo){
        infolist.clear();

        if(controlInfo == 1) {
            for (Product each : Products) {
                if (each instanceof Drink drink) {

                    infolist.add("Fat : " + drink.getFAT());
                }

            }

        }
        return infolist.toString();


    }



    public String getProductSize(int controlInfo){
        infolist.clear();
        if(controlInfo == 1) {
            for (Product each : Products) {
                if (each instanceof Drink drink) {
                    infolist.add("Size : " + drink.getSize());
                }

            }

        }
        return infolist.toString();

    }

    public String getProductSugar(int controlInfo){
        infolist.clear();
        if(controlInfo == 1) {
            for (Product each : Products) {
                if (each instanceof Drink drink) {
                    infolist.add("Sugar : " + drink.getSUGAR());
                }

            }

        }
        return infolist.toString();


    }
    public String getBalance(int controlInfo){
        infolist.clear();
        if(controlInfo == 2) {
            for (Product each : Products) {
                if (each instanceof GiftCard gc) {
                    infolist.add("Balance : " + gc.getBalance());
                }

            }

        }
        return infolist.toString();

    }



    Double afterTaxPrice = 0.0;

    //PRICE AFTER TAX FUNCTION


    public String TAXde(int controlInfo){
        infolist.clear();

        if(controlInfo == 1) {
            for (Product each : Products) {
                if (each instanceof Drink drink) {
                    //OPERATION TO GET THE VALUE OF A PRODUCT AFTER TAXES
                    afterTaxPrice = (drink.getPrice() * 0.06)  + drink.getPrice();
                    afterTaxPrice = afterTaxPrice %100;

                    String formattedPrice = String.format("%.2f", afterTaxPrice);




                    infolist.add("Price after taxes : " + formattedPrice);
                    afterTaxPrice = 0.0;
                }

            }

        }else if(controlInfo == 2) {
            for (Product each : Products) {
                if (each instanceof mug mug) {
                    afterTaxPrice = (mug.getPrice() * 0.06)  + mug.getPrice();
                    afterTaxPrice = afterTaxPrice %100;
                    String formattedPrice = String.format("%.2f", afterTaxPrice);




                    infolist.add("Price after taxes : " + formattedPrice);
                    afterTaxPrice = 0.0;
                }

            }

        }else if(controlInfo == 3) {
            for (Product each : Products) {
                if (each instanceof GiftCard GC) {
                    afterTaxPrice = (GC.getPrice() * 0.06)  + GC.getPrice();
                    afterTaxPrice = afterTaxPrice %100;
                    String formattedPrice = String.format("%.2f", afterTaxPrice);




                    infolist.add("Price after taxes : " + formattedPrice);
                    afterTaxPrice = 0.0;
                }

            }

        }
        return infolist.toString();

    }











}




