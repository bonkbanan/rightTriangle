package com.company;

public class Main {

    public static void main(String[] args) {
        double leg1=4;
        double leg2=5;
	    right_triangle r1 = new right_triangle(leg1, leg2);
	    r1.gypotenuse();
        System.out.println(r1.toString());
        System.out.println("Площа трикутника: " + r1.getArea());
        System.out.println("Периметр трикутника: " + r1.getPerimetr());
        r1.radius();
        r1.angle();
    }
}
