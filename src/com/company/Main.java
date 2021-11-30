package com.company;

public class Main {

    public static void main(String[] args) {
        Cargoboat cargoboat = new Cargoboat();
        Tanker tanker = new Tanker();
        Outputinterface(cargoboat);
        Outputinterface(tanker);

        Outputinterface1(cargoboat);
        Outputinterface1(tanker);

        Outputinterface2(cargoboat);
        Outputinterface2(tanker);

    }
    public static void Outputinterface(Boat boat){
        boat.lifting_capacity();
    }

    public static void Outputinterface1(Boat boat){
        boat.types_of_cargo();
    }
    public static void Outputinterface2(Boat boat){
        boat.length();
    }

}


