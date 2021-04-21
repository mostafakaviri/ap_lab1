package com.company;
/**
 * Making triangle
 * @author Mostafa
 * @version 0.0
 */

public class Triangle extends Polygon{

    /**
     * to build a triangle.
     * @param a for 1st side
     * @param b for 2nd side
     * @param c for 3th side
     */
    public Triangle(double a, double b, double c){
        super(a,b,c);
    }

    /**
     * if equilateral
     * @return true.
     */

    public boolean isEquilateral(){
        if (getSides().get(0).equals(getSides().get(1)) && getSides().get(0).equals(getSides().get(2))){
            return true;
        }
        return false;
    }

    /**
     * print figure information
     */

    @Override
    public void draw() {
        System.out.println("Type : Triangle");
        System.out.println("Side a : "+getSides().get(0)+" Side b : "+getSides().get(1)+" Side c : "+getSides().get(2));
        System.out.println("Area a : "+getArea());
        System.out.println("Perimeter : "+getPerimeter());

    }

    /**
     * calculate and get area.
     * @return rea as area.
     */

    @Override
    public double getArea() {
        double s, res;
        s = (getSides().get(0)+getSides().get(1)+getSides().get(2))/2;
        res = Math.sqrt( s * ( s-getSides().get(0) ) * ( s-getSides().get(1) ) * ( s-getSides().get(2) ) );
        return res;
    }

    /**
     * get perimeter of triangle.
     * @return perimeter of triangle.
     */

    @Override
    public double getPerimeter() {
        double res = 0;
        for (Double i : getSides()){
            res += i;
        }
        return res;
    }

    /**
     * check if equal
     * @param triangle for check
     * @return true if equal.
     */


    public boolean equals(Triangle triangle){

        if (getSides().get(0).equals(triangle.getSides().get(0)) && getSides().get(1).equals(triangle.getSides().get(1)) && getSides().get(2).equals(triangle.getSides().get(2))){
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
                "sides=" + getSides() +
                '}';
    }
}
