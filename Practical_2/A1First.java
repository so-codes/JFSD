// Write a Java program using Lambda Expression to calculate the following:
// a. Convert Fahrenheit to Celsius b. Convert Kilometers to Miles.

package Practical_2;

import java.util.Scanner;
import java.util.function.Function;

public class A1First {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Function<Double, Double> fahrenheitToCelsius = fahrenheit -> (fahrenheit - 32) * 5 / 9;

        System.out.print("Enter Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = fahrenheitToCelsius.apply(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius");

        Function<Double, Double> kilometersToMiles = kilometers -> kilometers * 0.621371;

        System.out.print("Enter Kilometers: ");
        double kilometers = sc.nextDouble();
        double miles = kilometersToMiles.apply(kilometers);
        System.out.println(kilometers + " Kilometers is equal to " + miles + " Miles");

        sc.close();
    }
}