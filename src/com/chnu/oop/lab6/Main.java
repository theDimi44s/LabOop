package com.chnu.oop.lab6;

public class Main {

      /*
    Створити базовий клас «Будинок» та його підкласи «Індивідуальний будинок»,
    «Багатоквартирний будинок», «Котедж».
    Основні характеристики будинків – кількість поверхів, тип даху,
    кількість кімнат (квартир).
     */


    public static void main(String[]args){

        house h = new house("House","typical",1,1);
        System.out.println(h);
        indHouse i = new indHouse("Individual House","typical",10,2);
        System.out.println(i);
        apartHouse a = new apartHouse("Apartment House","non-typical",4,9);
        System.out.println(a);
        cottage c = new cottage("Cottage","non-typical",10,3);
        System.out.println(c);

    }
}
