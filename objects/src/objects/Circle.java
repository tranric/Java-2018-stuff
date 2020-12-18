package objects;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius = 1.5, perimeter=0, input=0;
		Circle object1 = new Circle();
		// calculate the perimeter (2 * PI * r)
		perimeter = 2 * Math.PI * radius;
		System.out.printf("The perimeter of the circle is: %.2f", perimeter);
		System.out.print("\nPlease enter the radius:");
		Scanner userinput = new Scanner(System.in);
		//input = userinput.nextDouble();
		//perimeter = 2 * Math.PI * input;
		//perimeter = calcperimeter(userinput.nextDouble());
		;
		System.out.printf("The perimeter of the circle is: %.2f", object1.calcperimeter(userinput.nextDouble()));

		userinput.close();


	}

	public static double calcperimeter(double rad){
		double perimeter=0;

		perimeter = 2 * Math.PI * rad;

		return perimeter;

	}



}


