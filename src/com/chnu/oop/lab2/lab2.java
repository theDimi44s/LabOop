package com.chnu.oop.lab2;

import java.util.Scanner;

public class lab2 {

    public static void main(String[]args){

        Scanner read = new Scanner(System.in);
        {
            int a = 10;
            int b = 5;
            int c = a ^ b;
            System.out.printf("a = %s\nb = %s\na ^ b = %s\n",
                    Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

            System.out.print("Введите размерность = ");

            int length = read.nextInt();
            double[] arr = new double[length];
            arr[0] = 1.0;
            double sum = arr[0];
            for (int i = 1; i < length; i++) {
                arr[i] = arr[i - 1] + (i / (i + 1.0));
            }
            for (int i = 1; i < 10; i++) {
                sum += arr[i];
            }
            System.out.print("[");
            for (int i = 0; i < length; i++)
                System.out.printf("%.2f ", arr[i]);
            System.out.printf("]\nSum : %.2f\n", sum);
        }

    }




}
