package application;
import javafx.scene.effect.Light.Point;
import javafx.scene.paint.Color;
public class Circle extends Shape {
	private Point _center;
    private double _radius;


    public Circle(String name, Color color,  Point center, double radius) {
        super(name, color);

        _center = center;
        _radius = radius;
    }

    public void paint(){

    	System.out.println("Circle " + _name + " colour " + _color +
                           "Radius" +_radius+
    			" center (" + _center.getX() + "," + _center.getY() +
                ")");



    }
}
