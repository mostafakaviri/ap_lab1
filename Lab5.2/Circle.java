package com.company;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Shape{

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /**
     * Calculate and get the perimeter.
     * @return res as perimeter.
     */

    public double gerPerimeter(){
        double res;
        res = 2 * PI * radius;
        return res;
    }

    /**
     * Calculate and getting area.
     * @return res as area.
     */

    public double getArea(){
        double res;
        res = PI*pow(radius,2);
        return res;
    }

    /**
     * Printing object details.
     */

    public void draw(){
        System.out.println("Type : Circle");
        System.out.println("Radius : "+getRadius());
        System.out.println("Area : " + getArea());
        System.out.println("Perimeter : "+gerPerimeter());
    }

    /**
     * check if its equal
     * @param circle for checking.
     * @return true if their equal.
     */
    public boolean equals(Circle circle){
        if (getRadius() == circle.getRadius()){
            return true;
        }
        else return false;
    }

    /**
     * Write in string.
     * @return object to string.
     */

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
