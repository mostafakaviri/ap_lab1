package com.company;
import java.util.ArrayList;

/**
 * represent a shape
 * @author Mostafa
 * @version 0.0
 */

public class Polygon extends Shape {

    private ArrayList<Double> sides;

    /**
     * build a polygon
     * @param side for sides of polygon.
     */

    public Polygon(double... side){
        sides = new ArrayList<Double>();
        for (double i : side){
            sides.add(i);
        }
    }

    /**
     * getter for sides
     * @return
     */

    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * to get perimeter of a polygon.
     * @return perimeter of polygon.
     */

    @Override
    public double getPerimeter(){
        double res = 0;
        for (double side : sides){
            res += side;
        }
        return res;
    }

    /**
     * checking equal sides.
     * @return true if sides equal.
     */

    public boolean isEqualSides(){
        double test = sides.get(0);
        for (double side : sides){
            if (side != test){
                return false;
            }
        }
        return true;
    }

    /**
     * for checking if sides have special value;
     * @param intSide for check.
     * @return true if contains.
     */

    public boolean contains(double intSide){
        for (double side : sides){
            if (intSide == side){
                return true;
            }
        }
        return false;
    }

    /**
     * check if equals.
     * @param polygon for check.
     * @return true if equal.
     */

    public boolean equals(Polygon polygon){
        boolean flag = true;
        for (double side : polygon.sides){
            if (!getSides().contains(side)){
                flag = false;
            }
        }
        return flag;
    }
}
