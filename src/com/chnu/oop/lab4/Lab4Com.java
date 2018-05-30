package com.chnu.oop.lab4;

import java.math.*;
import java.util.Scanner;


public class Lab4Com {


        static Scanner scn = new Scanner(System.in);
        static BigInteger ind;
        static int myAnsw;
        public static int count=0;

        public static void main(String [] args){

            System.out.println("\tЛабораторная работа 4\n" +
                    "\t\tВиберите действие:\n" +
                    "\t\t1. BigInteger факториал\n" +
                    "\t\t2. Алгоритм вычисления корней\n" +
                    "\t\t3. Экстремумы");


            switch (myAnsw = scn.nextInt()) {
                case 1:
                    System.out.println("Добро пожаловать в Big Integer рекурсию!\n" +
                            "Введите число: ");
                    factorial(scn.nextBigInteger());
                    System.out.println("Результат: " + ind);
                    break;
                case 2:
                    System.out.println("Алгоритм вычисления корней\n" +
                            "Результат = "+solve(-10,10,0.1));
                    break;
                case 3:
                    System.out.println("Экстремумы функции\n" +
                            "Максимумы функции = "+maxValueOfFunction(-10,10,0.1)+
                            "\nМинимумы функции = "+minValueOfFunction(-10,10,0.1));
                    break;
                default:
                    System.out.println("Ошибка! Перезапустите программу!");
            }


        }

        public static BigInteger factorial(BigInteger n){

            if (n.equals(BigInteger.ZERO))
                return BigInteger.valueOf(1);
            else
                return ind = n.multiply(factorial(n.subtract(BigInteger.ONE)));

        }

        public static double function(double x)
        {
            return (-2)*Math.pow(x,3)+3*x-4;
        }
        public static double defFunction(double x)
        {
            return (-6)*Math.pow(x,2)+3;
        }
        public static double def2Function(double x)
        {
            return (-12)*x;
        }
        public static double solve(double a, double b,  double eps)
        {
            double x0;
            double x1=0;
            if(function(a)*function(b)>0)
            {
                System.out.println("Erorr!");
            }
            else {
                if (function(a) * def2Function(a) > 0) {
                    x0 = a;
                } else {
                    x0 = b;
                }

                x1 = x0 - (function(x0) / defFunction(x0));
                while (Math.abs(x1 - x0) < eps) {
                    x0 = x1;
                    x1 = x0 - (function(x0) / defFunction(x0));
                }
            }
            return x1;
        }

        public static double maxValueOfFunction(double begin, double end,double step)
        {
            double max=(-2)*Math.pow(begin,3)+3*begin-4;
            double temp;
            for(double i=begin+step;i<=end;i+=step)
            {
                temp=(-2)*Math.pow(i,3)+3*i-4;
                if(temp>max)
                {
                    max=temp;
                }
            }
            return max;
        }

        public static double minValueOfFunction(double begin, double end, double step)
        {
            double min=(-2)*Math.pow(begin,3)+3*begin-4;
            double temp;
            for(double i=begin;i<=end;i+=step)
            {
                temp=(-2)*Math.pow(i,3)+3*i-4;
                if(temp<min)
                {
                    min=temp;
                }
            }
            return min;
        }

}


