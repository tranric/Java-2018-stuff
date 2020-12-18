package application;
import javafx.scene.paint.Color;
public abstract class Shape  implements Comparable<Shape>{
	protected String _name;
    protected Color _color;


    public Shape(String name, Color color)
    {
        _name = name;
        _color = color;

    }

    /**
     * Paint method, must be implemented in each subclass.
     */
    public abstract void paint();
    @Override
    public int compareTo(Shape other) {
    	return this._name.compareTo(other._name);
    }

}
