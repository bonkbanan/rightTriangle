package com.company;/*
@USER: dench
@DATE: 19.03.21
@NAME: right_triangle
@TIME: 19:53
*/

public class right_triangle {
    private double leg1;
    private double leg2;
    private double gypotenuse;

    public right_triangle(double leg1, double leg2) {
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    public double getLeg1() {
        return leg1;
    }

    public void setLeg1(double leg1) {
        this.leg1 = leg1;
    }

    public double getLeg2() {
        return leg2;
    }

    public void setLeg2(double leg2) {
        this.leg2 = leg2;
    }

    public double gypotenuse(){
        double x1 = Math.sqrt(Math.pow(leg1,2) + Math.pow(leg2,2));
        this.gypotenuse = x1;
        return x1;
    }

    public double getArea(){
        return (leg1 * leg2) / 2;
    }

    public double getPerimetr(){
        return leg1 + leg2 + gypotenuse;
    }

    public void angle(){
        double x1 = leg1 / leg2;
        double x2= leg2 / leg1;
        x1=(( Math.atan (leg2 / leg1) ) * 180 ) / Math.PI ;
        x2=(( Math.atan (leg1 / leg2) ) * 180 ) / Math.PI;
        System.out.println("Перший кут " + x1 + ", другий кут " + x2 );
    }
    public void radius(){
        double x1 = (leg1 * leg2)/(leg1 + leg2 + gypotenuse);
        System.out.println("Радіус вписаного кола " + x1);
        double x2 = gypotenuse/2 * 100;
        System.out.println("Радіус описаного кола " + x2);
    }

    @Override
    public String toString() {
        return "right_triangle {" +
                "leg1=" + leg1 +
                ", leg2=" + leg2 +
                ", gypotenuse=" + gypotenuse +
                '}';
    }
}
