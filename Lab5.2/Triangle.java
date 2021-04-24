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

    @Override
    public boolean isEqualSides() {
        return super.isEqualSides();
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
        return super.getPerimeter();
    }

    /**
     * check if equal
     * @param polygon for check
     * @return true if equal.
     */


    @Override
    public boolean equals(Polygon polygon) {
        return super.equals(polygon);
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
