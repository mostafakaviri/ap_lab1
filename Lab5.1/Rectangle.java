package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.Math.*;

/**
 * Making rectangle
 * @author Mostafa
 * @version 0.0
 */

public class Rectangle {

    private ArrayList<Double> sides;

    /**
     * making a rectangle.
     * @param a for first side.
     * @param b for other side.
     */

    public Rectangle(double a, double b, double c, double d){

        sides = new ArrayList<>();

        sides.add(a);
        sides.add(b);


    }

    /**
     * get the sides.
     * @return sides.
     */

    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * if is square
     * @return true.
     */

    public boolean isSquare(){
        if (getSides().get(0).equals(getSides().get(1))){
            return true;
        }
        return false;
    }

    /**
     * calculate and get the perimeter.
     * @return res as perimeter.
     */

    public double getPerimeter(){

        double res = 0;
        res = (getSides().get(0) + getSides().get(1)) * 2;
        return res;

    }

    /**
     * calculate and get area.
     * @return rea as area.
     */

    public double getArea(){
        double res = 0;
        res = getSides().get(0) * getSides().get(1);
        return res;
    }

    /**
     * printing figure details
     */

    public void draw(){
        System.out.println("Type : Rectangle");
        System.out.println("Side a : "+sides.get(0)+" Side b : "+sides.get(1)+" Side c : "+sides.get(0)+" Side d : "+sides.get(1));
        System.out.println("Area a : "+getArea());
        System.out.println("Perimeter : "+getPerimeter());
    }

    /**
     * check if equal
     * @param rectangle for check
     * @return true if equal.
     */

    public boolean equals(Rectangle rectangle){
        if ( (rectangle.getSides().get(0).equals(getSides().get(0)) && rectangle.getSides().get(1).equals(getSides().get(1))) || ((rectangle.getSides().get(0).equals(getSides().get(1)) && rectangle.getSides().get(1).equals(getSides().get(0))))){
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
        return "Rectangle{" +
                "sides=" + sides +
                '}';
    }
}
