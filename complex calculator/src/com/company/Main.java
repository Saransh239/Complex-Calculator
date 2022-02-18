package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        String s1 = getInput("Enter first number :");
        String s2 = getInput("Enter first number :");
        String op = getInput("Enter + - * / ");
        double result = 0;
        try {
            switch (op) {
                case "+":
                    result = addValues(s1, s2);
                    break;
                case "-":
                    result = subValues(s1, s2);
                    break;
                case "*":
                    result = mulValues(s1, s2);
                    break;
                case "/":
                    result = divValues(s1, s2);
                    break;
                default:
                    System.out.println(" Unrecognised Operation");
                    return;

            }
            System.out.println("The result is :" + result);
        } catch (Exception e) {
            System.out.println(" Number formatting exception " + e.getMessage());
        }
    }
        private static double addValues(String s1, String s2)
        {
            double d1 = Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2);
            return d1+d2;
        }
        private static double subValues( String s1, String s2)
        {
            double d1 = Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2);
            return d1-d2;
        }
        private static double mulValues( String s1, String s2)
        {
            double d1 = Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2);
            return d1*d2;
        }
        private static double divValues( String s1, String s2)
        {
            double d1 = Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2);
            return d1/d2;
        }
       private static String getInput( String prompt)
        {
            System.out.print(prompt);
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }


    }

