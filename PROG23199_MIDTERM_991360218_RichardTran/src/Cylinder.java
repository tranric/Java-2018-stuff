/**
 *
 * @author Richard Tran
 * @since Jun 22, 2018
 */
public class Cylinder extends Circle{
	protected double height=1;

	//@Override
	/**
	 * @param _radius - radius of the Cylinder
	 * @return Area - Area of the Cylinder - 2*PI*radius (height + radius)
	 */
	protected double calculateArea(double _radius){
		double Area=0;
		Area=2 * Math.PI * _radius * (height + _radius);

		return Area;
	}
/**
 *
 * @param _radius - radius of the Cylinder
 * @return Volume - volume of the cylinder  - PI *  radius^2 * height
 */
	protected double calculateVolume(double _radius){
		double Volume=0;
		Volume = Math.PI * Math.pow(_radius, 2) * height ;
		return Volume;
	}
	//@Override
	/**
	 * Prints all of the information of the Cylinder
	 */
	protected void printCharacteristics(){
		System.out.printf("\nRadius: %f", get_radius());
		System.out.printf("\nCircumference: %f", calculateCircumference(get_radius()));
		System.out.printf("\nArea: %f", calculateArea(get_radius()));
		System.out.printf("\nVolume: %f", calculateVolume(get_radius()));

	}



}
