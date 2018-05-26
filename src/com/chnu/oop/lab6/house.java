package com.chnu.oop.lab6;

public class house {


    protected String typeOfHouse;

    protected int stages;
    protected int rooms;
    protected String typeOfRoof;

    house(){

        this.stages = 0;
        this.rooms = 0;
        this.typeOfRoof = "";

    }
    house(String typeOfHouse, String typeOfRoof,
          int rooms, int stages){

        this.typeOfHouse = typeOfHouse;
        this.typeOfRoof = typeOfRoof;
        this.rooms = rooms;
        this.stages = stages;

    }

    public String toString() {
        return "Type of House: "+typeOfHouse+" | Type of Roof: "+typeOfRoof+" | Rooms: "+rooms+ " | Stages "+stages;
    }

}
