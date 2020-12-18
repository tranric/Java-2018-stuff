import java.util.Scanner;
/**
 *
 * @author Richard Tran
 * @since Jun 22, 2018
 * @version 1.0
 */
//Added the bonus cylinder question.
public class GeometryTest {
/**
 *
 * @param c1 - circle object
 * @param s1 - Sphere object
 * @param cylinder1 - cylinder object
 * @param x - holds the user's input
 * @param input - scans the user's input
 */
	public static void main(String[] args) {
		double x=0;
		System.out.print("\nPlease Enter in a "
				+ "radius(Negative values will be set to zero(0)):");
		Scanner input  = new Scanner(System.in);
		x=input.nextDouble();
		Circle c1 = new Circle();
		Sphere s1 = new Sphere();
		c1.set_radius(x);
		s1.set_radius(x);
		System.out.printf("\nCircle:");
		c1.printCharacteristics();
		System.out.printf("\nSphere:");
		s1.printCharacteristics();
		//bonus marks
		Cylinder cylinder1 = new Cylinder();
		cylinder1.set_radius(x);
		System.out.printf("\nCylinder:");
		cylinder1.printCharacteristics();
		input.close();

	}

}
