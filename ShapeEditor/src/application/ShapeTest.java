package application;

import java.util.ArrayList;

import javafx.scene.effect.Light.Point;
import javafx.scene.paint.Color;

public class ShapeTest {
   public static void main (String args[]){
	// create and initialize 3 objects
	// TODO: add the rectangle object
	    Line line = new Line("Line 1", Color.BLUE,new Point(5,5,0, Color.BLUE), new Point(7,7,0, Color.BLUE));
	    Circle circle =  new Circle("Circle 1", Color.BEIGE, new Point (2,2,0, Color.BEIGE),5.5);
        line.paint();
        circle.paint();

        //TODO: add the created rectangle object to list
        ArrayList<Shape> list =new ArrayList<Shape>();
        list.add(line);
        list.add(circle);



        System.out.println("\n**This is the drawing**");
        Drawing drawingOne = new Drawing ("Drawing 1",Color.DARKRED, list);
        drawingOne.paint();

   }


}
