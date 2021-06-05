package ex11;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nyles Symonette
 */


import java.util.Scanner;
public class App {

        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);

                double result = 0.0;

                System.out.println("Welcome Currency converter");
                System.out.println("--------------------------");
                System.out.println("How many Euros are you exchanging?");

                double euros = sc.nextDouble();

            System.out.println("What is the exchange rate?");

            double exchangeRate = sc.nextDouble();

            double dollars = currencyConverter(euros, exchangeRate,result);

            System.out.println(euros + "Euros at an Exchange rate of " +exchangeRate + "is");
            System.out.println(dollars + " U.S Dollars ");

            sc.close();
        }

        private static double currencyConverter(double euros, double exchangeRate,double result){
            return result = euros *exchangeRate;
        }

    }

