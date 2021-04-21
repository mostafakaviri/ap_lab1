package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.Math.*;

/**
 * Making triangle
 * @author Mostafa
 * @version 0.0
 */

public class Triangle {

    private ArrayList<Double> sides;

    /**
     * to build a triangle.
     * @param a for 1st side
     * @param b for 2nd side
     * @param c for 3th side
     */

    public Triangle(double a, double b, double c){

        sides = new ArrayList<>();

        sides.add(a);
        sides.add(b);
        sides.add(c);
    }

    /**
     * if equilateral
     * @return true.
     */

    public boolean isEquilateral(){
        if (sides.get(0).equals(sides.get(1)) && sides.get(0).equals(sides.get(2))){
            return true;
        }
        return false;
    }

    /**
     * get side array list.
     * @return sides.
     */

    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * get perimeter of triangle.
     * @return perimeter of triangle.
     */

    public double getPerimeter(){

        double res;
        res = sides.get(0) + sides.get(1) + sides.get(2);
        return res;
    }

    /**
     * calculate and get area.
     * @return rea as area.
     */

    public double getArea(){
        double s, res;
        s = (sides.get(0)+sides.get(1)+sides.get(2))/2;
        res = Math.sqrt( s * ( s-sides.get(0) ) * ( s-sides.get(1) ) * ( s-sides.get(2) ) );
        return res;
    }

    /**
     * print figure information
     */

    public void draw(){
        System.out.println("Type : Triangle");
        System.out.println("Side a : "+sides.get(0)+" Side b : "+sides.get(1)+" Side c : "+sides.get(2));
        System.out.println("Area a : "+getArea());
        System.out.println("Perimeter : "+getPerimeter());
    }

    /**
     * check if equal
     * @param triangle for check
     * @return true if equal.
     */

    public boolean equals(Triangle triangle){

        if (sides.get(0).equals(triangle.getSides().get(0)) && sides.get(1).equals(triangle.getSides().get(1)) && sides.get(2).equals(triangle.getSides().get(2))){
            return true;
        }
        return false;
    }

    /**
     * return object information
     * @return
     */

    @Override
    public String toString() {
        return "Triangle{" +
                "sides=" + sides +
                '}';
    }
}
