package com.company;
import java.util.ArrayList;

public class Paint {

    ArrayList<Shape> shapes;

    public Paint(){

        shapes = new ArrayList<>();
    }

    public void addShape( Shape shape){
        shapes.add(shape);
    }

    public void drawAll(){
        for (Shape shape1 : shapes){
            shape1.draw();
        }
    }

    public void printAll(){
        for (Shape shape1 : shapes){
            shape1.toString();
        }
    }

    public void describeEqualSides(){
        for (Shape shape1 : shapes){
            if (shape1 instanceof Triangle){
                if (((Triangle) shape1).isEquilateral()){
                    System.out.println(shape1.toString());
                }
            }
            if (shape1 instanceof Rectangle){
                if (((Rectangle) shape1).isSquare()){
                    System.out.println(shape1.toString());
                }
            }
        }
    }

}
