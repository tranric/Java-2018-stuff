/**
 *
 * @author Richard Tran
 * @since Jun 22, 2018
 * @version 1.0
 *
 */


public class Circle {

protected double _radius;
/**
 *
 * @return _radius
 */
protected double get_radius() {
	return _radius;
}

/**
 *
 * @param _radius sets the radius of the circle
 */
protected void set_radius(double _radius) {
	//sets the radius to 0 if a negative number is added.
	if (_radius < 0){
		_radius =0;
	}
	this._radius = _radius;
}
/**
 *
 * @param _radius the radius of the circle
 * @return circumference of the circle - 2 * PI * radius
 */
protected double calculateCircumference(double _radius){
	double circumference=0;
	circumference = 2 * Math.PI * _radius;
	return circumference;
}
/**
 *
 * @param _radius the radius of the circle
 * @return the area of the circle - Pi*(radius^2)
 */
protected double calculateArea(double _radius){
	double Area=0;
	Area = Math.PI * (_radius * _radius);
	return Area;
}

/**
 * Prints the characteristics of the circle;
 * the area circumference and radius.
 */
protected void printCharacteristics(){
	System.out.printf("\nRadius: %f", get_radius());
	System.out.printf("\nCircumference: %f", calculateCircumference(get_radius()));
	System.out.printf("\nArea: %f", calculateArea(get_radius()));

}


}
