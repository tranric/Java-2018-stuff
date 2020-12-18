//richard tran

import java.util.*;


public class BMI_calc {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double weightpounds=0;
		double heightfeet=0;
		double BMI=0;

		//asks the user to enter the weight and height in the
		//respective formats of pounds and feet.
		System.out.print("\nPlease enter your weight in pounds:");
		weightpounds = scan.nextDouble();
		//safeguard for ensuring the user enters a number above 0
		while (weightpounds < 0){
			System.out.println("Incorrect input please"
					+ " enter a number above zero (0).");
			System.out.print("\nPlease enter your weight in pounds:");
			weightpounds = scan.nextDouble();
		}

		System.out.print("\nPlease enter your height in feet:");
		heightfeet = scan.nextDouble();
		//safeguard for ensuring the user enters a number above 0
		while(heightfeet < 0){
		System.out.println("Incorrect input please"
					+ " enter a number above zero (0).");
		System.out.print("\nPlease enter your height in feet:");
		heightfeet = scan.nextDouble();
		}

		//conversion of pounds to kilogram for the user
		//the ratio is 1 pound to 0.453 kilograms
		weightpounds = weightpounds * 0.453;

		//conversion of feet to meters for the user
		//the ratio is 1 foot to 0.304 meters
		heightfeet = heightfeet * 0.304;

		//calculates the BMI
		BMI = weightpounds / (heightfeet * heightfeet);

		//prints the table and user's BMI and class.
		printBmiDescription(BMI);

		scan.close();
	}


	public static void printBmiDescription(double BMI){
		//prints the BMI scale as well as the user's BMI spot on
		//the scale
		String Class="";
		//to identity the class based on the BMI for the user
		if (BMI < 18.5){
			Class = "Underweight";
		}
		else if (BMI < 24.9){
			Class = "Normal";
		}
		else if (BMI < 29.9){
			Class = "Overweight";
		}
		else{
			Class = "Obese";
		}
		//prints the user's class and BMI
		System.out.printf("\nYour BMI is: %.2f, and your class is:"
				+ "%s\n", BMI, Class);

		//prints the table for the user to understand how and why the
		//class system is setup as well as why the user is in
		//his or her class.
		System.out.println("\tBMI\t\tInerpretation");
		System.out.println("\tBelow 18.5\tUnderweight");
		System.out.println("\t18.5-24.9\tUNormal");
		System.out.println("\t25.0-29.9\tOverweight");
		System.out.println("\t30 and above\tObese");

	}



}
