package com.example.guicoffeshop;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;


public class HelloController{

    //MOST OF THE FUNTIONS ANC EVENTS IN THE PROGRAMS ARE STILL A WORK IN PROGRESS
    //
    //
    // 4/10/2024
    //
    int c = 0;

    ControlMore control = new ControlMore(0);
    int control2;

    ProductCLASS test = new ProductCLASS();
    //Buttons:
    @FXML
    private MenuItem BalanceItem;
    @FXML
    private MenuItem CaloriesItem;
    @FXML
    private MenuItem TotalFat;
    @FXML
    private MenuItem Size;
    @FXML
    private MenuItem Sugar;
    @FXML
    private ListView <String> ShopList;
    @FXML
    private ListView<String> MoreInfoList;
    @FXML
    private MenuItem TaxInfo;
    @FXML
    private MenuButton BShowMore;



    @FXML

    private Label MainLabel;
    @FXML
    private Label MainLabel1;

    @FXML
    //THE FOLLOWING FUNCTIONS CONTROL 'SHOPLIST' LISTVIEW USING DATA FROM 'PRODUCTCLASS'
    protected void viewDrinks() {
        test.getDrinks();
        ShopList.getItems().clear();
        ShopList.getItems().addAll(test.infolist);



        control.SetControlMore(1);
        control2 = control.SetControlMore(1);
        //MenuItems to show more info for drink :
        CaloriesItem.setVisible(true);
        TotalFat.setVisible(true);
        Size.setVisible(true);
        Sugar.setVisible(true);
        TaxInfo.setVisible(true);




        BalanceItem.setVisible(false);
        MoreInfoList.getItems().clear();






    }


    @FXML
    protected void viewMugs() {

        test.getMugs();
        ShopList.getItems().clear();
        ShopList.getItems().addAll(test.infolist);



        control2 = control.SetControlMore(2);

        CaloriesItem.setVisible(false);
        BalanceItem.setVisible(false);
        TotalFat.setVisible(false);
        Size.setVisible(false);
        Sugar.setVisible(false);
        MoreInfoList.getItems().clear();
        TaxInfo.setVisible(true);






    }


    @FXML
    protected void viewGiftCards() {


        test.getGiftCard();
        ShopList.getItems().clear();
        ShopList.getItems().addAll(test.infolist);



        control2 = control.SetControlMore(3);



        BalanceItem.setVisible(true);

        CaloriesItem.setVisible(false);
        TotalFat.setVisible(false);
        Size.setVisible(false);
        Sugar.setVisible(false);
        MoreInfoList.getItems().clear();
        TaxInfo.setVisible(true);





    }

    //THE FOLLOWING FUNCTIONS ARE RELATED TO THE EXTRA OPTIONS
    // THAT THE USER WILL ENCOUNTER WHEN USING "SHOW MORE INFO"


    //THESE FUNCTIONS CAN BE USED FOR THE SAME 3 CLASSES





    @FXML
    protected void ShowPrice(){
        System.out.println(control2);
        if(control2 == 1 ){
            test.getProductPrice(1);
            MoreInfoList.getItems().clear();
            MoreInfoList.getItems().addAll(test.infolist);

            
        } else if (control2 == 2 ) {
            test.getProductPrice(2);
            MoreInfoList.getItems().clear();
            MoreInfoList.getItems().addAll(test.infolist);


        } else if (control2 == 3) {
            test.getProductPrice(3);
            MoreInfoList.getItems().clear();
            MoreInfoList.getItems().addAll(test.infolist);


        }
    }
    @FXML
    protected void PriceAfterTax(){
        System.out.println(control2);
        if(control2 == 1 ){
            test.TAXde(1);
            MoreInfoList.getItems().clear();
            MoreInfoList.getItems().addAll(test.infolist);


        } else if (control2 == 2) {
            test.TAXde(2);
            MoreInfoList.getItems().clear();
            MoreInfoList.getItems().addAll(test.infolist);


        }else if (control2 == 3) {
            test.TAXde(3);
            MoreInfoList.getItems().clear();
            MoreInfoList.getItems().addAll(test.infolist);


        }
    }

    //THE FOLLOWING FUNCTIONS ARE INDIVIDUAL TO EACH ONE OF THEIR CLASSES



    @FXML
    protected void DrinkFat() {
        if (control2 == 1) {
            test.getProductFat(1);
            MoreInfoList.getItems().clear();
            MoreInfoList.getItems().addAll(test.infolist);




        }
    }

    @FXML
    protected void DrinkCalories() {
        if (control2 == 1) {
            test.getProductCalories(1);
            MoreInfoList.getItems().clear();
            MoreInfoList.getItems().addAll(test.infolist);


        }
    }
    @FXML
    protected void DrinkSize() {
        if (control2 == 1) {
            test.getProductSize(1);
            MoreInfoList.getItems().clear();
            MoreInfoList.getItems().addAll(test.infolist);




        }
    }

    @FXML
    protected void DrinkSugar() {
        if (control2 == 1) {
            test.getProductSugar(1);
            MoreInfoList.getItems().clear();
            MoreInfoList.getItems().addAll(test.infolist);



        }
    }
    @FXML
    protected void Balance(){
        if (control2 == 3) {
            test.getBalance(2);
            MoreInfoList.getItems().clear();
            MoreInfoList.getItems().addAll(test.infolist);



        }
    }





}