package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle. please.");
        radius = input.nextDouble();
        input.close();

        double area = Circle.getArea(radius);//(3.1415926) * radius * radius;
        System.out.println("The area of a circle with radius "+ radius+"is: "+ area);
    }
}
