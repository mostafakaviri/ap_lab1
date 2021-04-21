package com.company;

import java.util.ArrayList;

/**
 * For managing figures.
 * @author Mostafa
 * @version 0.0
 */

public class Paint {

    ArrayList<Circle> circles ;
    ArrayList<Triangle> triangles ;
    ArrayList<Rectangle> rectangles ;

    /**
     * Initialising fields.
     */

    public Paint(){
        circles = new ArrayList<>();
        triangles = new ArrayList<>();
        rectangles = new ArrayList<>();
    }

    /**
     * Adding triangle to database.
     * @param triangle to add.
     */

    public void addTriangle(Triangle triangle){
        this.triangles.add(triangle);
    }

    /**
     * Adding rectangle to database.
     * @param rectangle to add.
     */

    public void addRectangle(Rectangle rectangle){
        this.rectangles.add(rectangle);
    }

    /**
     * Adding circle to database.
     * @param circle to add.
     */

    public void addCircle(Circle circle){
        this.circles.add(circle);
    }

    /**
     * draw all of figure.
     */

    public void drawAll(){
        for (int i = 0; i < circles.size(); i++){
            circles.get(i).draw();
        }
        for (int i = 0; i < triangles.size(); i++){
            triangles.get(i).draw();
        }
        for (int i = 0; i < rectangles.size(); i++){
            rectangles.get(i).draw();
        }
    }

    /**
     * get all figure.
     */

    public void printAll(){
        for (int i = 0; i < circles.size(); i++){
            System.out.println(circles.get(i).toString());
        }
        for (int i = 0; i < triangles.size(); i++){
            System.out.println(triangles.get(i).toString());
        }
        for (int i = 0; i < rectangles.size(); i++){
            System.out.println(rectangles.get(i).toString());
        }
    }
}
