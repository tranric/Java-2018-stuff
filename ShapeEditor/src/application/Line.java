package application;
import javafx.scene.effect.Light.Point;
import javafx.scene.paint.Color;
public class Line extends Shape{

	 private Point _start;
	    private Point _end;

	    public Line(String name, Color color, Point start, Point end) {
	        super(name, color);

	        _start = start;
	        _end = end;
	    }

	    @Override
	    public void paint() {
	        System.out.println("Line " + _name + " colour " + _color +
	                           " from (" + _start.getX() + "," + _start.getY() +
	                           ") to (" + _end.getX() + "," + _end.getY() + ")");
	    }



}
