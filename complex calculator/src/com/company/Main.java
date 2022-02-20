package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        String s1 = getInput("Enter first number :");
        String s2 = getInput("Enter second number :");
        String s3 = getInput("Enter + - * / ");
        double result = 0;
        try {
            switch (s3) {
                case "+":
                    result = add(s1, s2);
                    break;
                case "-":
                    result = sub(s1, s2);
                    break;
                case "*":
                    result = mul(s1, s2);
                    break;
                case "/":
                    result = div(s1, s2);
                    break;
                default:
                    System.out.println(" Unrecognised Operation");
                    return;

            }
            System.out.println("The result is :" + result);
        } catch (Exception e) {
            System.out.println(" Formatting exception " + e.getMessage());
        }
    }
        private static double add(String s1, String s2)
        {
            double d1 = Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2);
            return d1+d2;
        }
        private static double sub( String s1, String s2)
        {
            double d1 = Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2);
            return d1-d2;
        }
        private static double mul( String s1, String s2)
        {
            double d1 = Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2);
            return d1*d2;
        }
        private static double div( String s1, String s2)
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

