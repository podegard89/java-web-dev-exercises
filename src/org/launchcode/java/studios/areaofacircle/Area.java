package org.launchcode.java.studios.areaofacircle;


import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        while (true) {
            boolean validInput = input.hasNextDouble();
            if (validInput) {
                double radius = input.nextDouble();
                if(radius > 0) {
                    double areaOfCircle = Circle.getArea(radius);
                    System.out.println("The area of a circle with radius " + radius + " is: " + areaOfCircle);
                    break;
                } else {
                    System.out.println("Enter a positive number!");
                }
            } else {
                System.out.println("Please enter a valid number for radius.");
                input.next();
            }
        }


    }

//    public static Double getArea(Double radius) {
//        return Math.PI * radius * radius;
//    }
}
