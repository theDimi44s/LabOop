package com.chnu.oop.lab6;

public class cottage extends house {

        cottage(String typeOfHouse, String typeOfRoof, int rooms, int stages){

            super(typeOfHouse,typeOfRoof,rooms,stages);

        }

    @Override
    public String toString() {
        return "Type of House: "+typeOfHouse+" | Type of Roof: "+typeOfRoof+" | Rooms: "+rooms+ " | Stages "+stages;
    }

}
