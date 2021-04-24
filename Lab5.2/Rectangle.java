package com.company;

public class Rectangle extends Polygon{

    /**
     * making a rectangle.
     * @param a for first side.
     * @param b for other side.
     */

    public Rectangle(double a, double b, double c,double d){
        super(a,b,c,d);
    }

    /**
     * if is square
     * @return true.
     */

    @Override
    public boolean isEqualSides() {
        return super.isEqualSides();
    }

    /**
     * printing figure details
     */

    @Override
    public void draw() {
        System.out.println("Type : Rectangle");
        System.out.println("Side a : "+getSides().get(0)+" Side b : "+getSides().get(1)+" Side c : "+getSides().get(0)+" Side d : "+getSides().get(1));
        System.out.println("Area a : "+getArea());
        System.out.println("Perimeter : "+getPerimeter());

    }

    /**
     * calculate and get area.
     * @return rea as area.
     */

    @Override
    public double getArea() {
        double res = getSides().get(0) * getSides().get(1);
        return res;
    }

    /**
     * calculate and get the perimeter.
     * @return res as perimeter.
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
        return "Rectangle{" +
                "sides=" + getSides() +
                '}';
    }
}
