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
}
