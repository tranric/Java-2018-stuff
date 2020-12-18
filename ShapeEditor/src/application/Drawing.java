package application;

import java.util.ArrayList;
import java.util.Collections;

import javafx.scene.paint.Color;

public class Drawing extends Shape {
   private ArrayList<Shape> _shapeList = new ArrayList<Shape>();

   public Drawing (String name, Color color,ArrayList<Shape> list){
	     super (name, color);
	     //copy list to _shapeList using the copy method
	     //from the Arrays class
	       _shapeList.addAll(list);
   }

   //develop the paint method

   public void paint(){
	   Collections.sort(_shapeList);
	   for (int index =0; index< _shapeList.size(); index++){
		   _shapeList.get(index).paint();




	   }
   }


}
