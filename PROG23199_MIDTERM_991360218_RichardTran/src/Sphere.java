/**
 *
 * @author Richard Tran
 * @since Jun 22, 2018
 */
public class Sphere extends Circle{

	//@Override
	/**
	 * @param _radius - radius of the Sphere
	 * @return Area - Area of the Sphere
	 */
	protected double calculateArea(double _radius){
		double Area=0;
		Area=4 * Math.PI * (_radius * _radius);

		return Area;
	}
	/**
	 *
	 * @param _radius - radius of the Sphere
	 * @return Volume - volume of the Sphere
	 */
	protected double calculateVolume(double _radius){
		double Volume=0;
		Volume = (4 * Math.PI * Math.pow(_radius, 3)) / 3;
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
