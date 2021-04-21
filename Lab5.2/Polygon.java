package com.company;
import java.util.ArrayList;

public class Polygon extends Shape {

    private ArrayList<Double> sides;

    public Polygon(double... side){
        sides = new ArrayList<Double>();
        for (double i : side){
            sides.add(i);
        }
    }

    public ArrayList<Double> getSides() {
        return sides;
    }
}
