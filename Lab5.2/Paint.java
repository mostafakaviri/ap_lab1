package com.company;
import java.util.ArrayList;

/**
 * for presenting shape data.
 * @author Mostafa
 * @version 0.0
 */

public class Paint {

    ArrayList<Shape> shapes;

    /**
     * build array list of shape.
     */

    public Paint(){

        shapes = new ArrayList<>();
    }

    /**
     * add shapes to arraylist.
     * @param shape to add.
     */

    public void addShape( Shape shape){
        shapes.add(shape);
    }

    /**
     * drawing object details.
     */

    public void drawAll(){
        for (Shape shape1 : shapes){
            shape1.draw();
        }
    }

    /**
     * drawing object details using toString.
     */

    public void printAll(){
        for (Shape shape1 : shapes){
            System.out.println(shape1.toString());
        }
    }

    /**
     * check if square or equilateral.
     */

    public void describeEqualSides(){
        for (Shape shape1 : shapes){
            if (shape1 instanceof Polygon){
                if (((Polygon) shape1).isEqualSides()){
                    System.out.println(shape1.toString());
                }
            }

        }
    }

}
