package com.company;

public class Cargoboat implements Boat{
    public int lifting_capacity = 100;
    public String types_of_cargo = "containers";
    public int length = 400;


    @Override
    public void lifting_capacity() {
        System.out.println("Cargoboat lifting_capacity =" + this.lifting_capacity);
    }

    @Override
    public void types_of_cargo() {
        System.out.println("Cargoboat types_of_cargo =" + this.types_of_cargo);

    }

    @Override
    public void length() {
        System.out.println("Cargoboat length =" + this.length);

    }
}