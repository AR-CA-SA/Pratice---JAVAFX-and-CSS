package com.example.guicoffeshop;

public class ControlMore {
    int control;
    public ControlMore(int control){
        this.control = control;
    }

    public int SetControlMore(int c){
        control = c;
        System.out.println(control);
        return control;
    }

}
