package com.company;

public class Tanker implements Boat{
    public int lifting_capacity = 150;
    public String types_of_cargo = "liquid cargo";
    public int length = 550;

    @Override
    public void lifting_capacity() {
        System.out.println("Tanker lifting_capacity =" + this.lifting_capacity);

    }

    @Override
    public void types_of_cargo() {
        System.out.println("Tanker types_of_cargo =" + this.types_of_cargo);

    }

    @Override
    public void length() {
        System.out.println("Tanker length =" + this.length);

    }
}
