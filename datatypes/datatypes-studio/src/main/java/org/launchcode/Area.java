package org.launchcode;

import java.util.Scanner;

import static java.lang.System.in;

public class Area {
    public static void main(String[] args){
        double radius = 0;
        Scanner input;
        input = new Scanner(in);

        try {
            System.out.println("Enter the radius of a circle. please.");
            radius = input.nextDouble();
            input.close();
        } catch (Exception e) {
            System.out.println("Radius must be a number");
            System.exit(0);
        };

        if (radius > 0) {
            double area = Circle.getArea(radius);//(3.1415926) * radius * radius;
            System.out.println("The area of a circle with radius "+ radius+"is: "+ area);
        } else {
            System.out.println("Radius must be a positive number.");

        }



    }
}
