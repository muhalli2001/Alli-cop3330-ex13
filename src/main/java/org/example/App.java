package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args) {

        //get PRINCIPAL (principal)
        Scanner p = new Scanner(System.in);
        System.out.println("What is the principal?");
        float principal = p.nextFloat();
        System.out.println(principal);

        //get RATE (rate)
        Scanner r = new Scanner(System.in);
        System.out.println("What is the rate of interest?");
        float rate = r.nextFloat();
        System.out.println(rate);

        //get TIME (time)
        Scanner t = new Scanner(System.in);
        System.out.println("What is the time in years?");
        float time = t.nextFloat();
        System.out.println(time);

        //get N (num)
        Scanner n = new Scanner(System.in);
        System.out.println("What is the number of times the interest is compounded per year?");
        float num = n.nextFloat();
        System.out.println(num);

        // A = P(1 + r/n)^(n*t)
        float a = (1+((rate/100)/num));
        float b = num*time;
        double A = Math.pow(a, b);
        A = principal *A;
        //rounding
        double roundA = Math.round(A * 100.0) / 100.0;

        //printing
        System.out.printf("After %.2f years at %.2f%%, compounded %.2f times a year, the investment will be worth $%.2f",time,rate,num,roundA);
    }
}
