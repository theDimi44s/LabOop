package com.chnu.oop.lab5;

import java.util.ArrayList;
import java.util.List;

public class lab5 {
    public static void main(String[] args) {
        System.out.println("OK");
        OneLinkedList oneLinkedList = new OneLinkedList(10);

        List<Integer> list= new ArrayList<>();
        System.out.println(oneLinkedList);
        oneLinkedList.invert();
        System.out.println(oneLinkedList);
        oneLinkedList.removeLast();
        System.out.println(oneLinkedList);
        oneLinkedList.sort();
        System.out.println(oneLinkedList);
    }
}
