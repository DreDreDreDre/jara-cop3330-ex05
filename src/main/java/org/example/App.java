package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andre Jara
 */
public class App 
{
    public static void main( String[] args )
    {
        double number1;
        double number2;

        String input1;
        String input2;

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the first number? ");
        input1 = sc.nextLine();

        System.out.print("What is the second number? ");
        input2 = sc.nextLine();

        number1 = Double.parseDouble(input1);
        number2 = Double.parseDouble(input2);

        System.out.println(input1 + "+" + input2 + "=" + (number1 + number2));
        System.out.println(input1 + "-" + input2 + "=" + (number1 - number2));
        System.out.println(input1 + "*" + input2 + "=" + (number1 * number2));
        System.out.println(input1 + "/" + input2 + "=" + (number1 / number2));

        sc.close();
    }
}
