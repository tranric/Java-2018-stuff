import java.security.SecureRandom;

//Assignment No.: 1
//PROG 20025–Algorithm Developmentand Data Structures
//Member 1: Khurram Khan (991474897)
//Member 2: Richard Tran (991360218)
//Submission Date: September 19, 2018
//Instructor’s name: Syed Tanbeer



public class Main {

	public static void main(String[] args) {
		//5 big integers requested for 2-A)
		int x = 100000;
		int x2 = 200000;
		int x3 = 300000;
		int x4 = 400000;
		int x5 = 500000;


		//double[] arrayinput = new double[0];
		double[] array = new double[x];
		double[] array1 = new double[x2];
		double[] array2 = new double[x3];
		double[] array3 = new double[x4];
		double[] array4 = new double[x5];



		//the 50 runtimes using prefix 1
		for(int i=0; i <10; i++){
			System.out.println("x iteration:" + i);
			PrefixAverages1(array, x);
		}
		for(int i=0; i <10; i++){
			System.out.println("x2 iteration:" + i);
			PrefixAverages1(array1, x2);
		}
		for(int i=0; i <10; i++){
			System.out.println("x3 iteration:" + i);
			PrefixAverages1(array2, x3);
		}
		for(int i=0; i <10; i++){
			System.out.println("x4 iteration:" + i);
			PrefixAverages1(array3, x4);
		}
		for(int i=0; i <10; i++){
			System.out.println("x5 iteration:" + i);
			PrefixAverages1(array4, x5);
		}

		//the 50 runtimes of prefix2
		for(int i=0; i <10; i++){
			System.out.println("x iteration:" + i);
			PrefixAverages2(array, x);
		}
		for(int i=0; i <10; i++){
			System.out.println("x2 iteration:" + i);
			PrefixAverages2(array1, x2);
		}
		for(int i=0; i <10; i++){
			System.out.println("x3 iteration:" + i);
			PrefixAverages2(array2, x3);
		}
		for(int i=0; i <10; i++){
			System.out.println("x4 iteration:" + i);
			PrefixAverages2(array3, x4);
		}
		for(int i=0; i <10; i++){
			System.out.println("x5 iteration:" + i);
			PrefixAverages2(array4, x5);
		}



		//get the average for the 50 per prefix - Question 2-B)

		//calculate the rate of growth of time and get the Big-Oh notation
		//of each prefix from the data of #2-B) -  Question 3

		// question 4-A) run the program of prefix 1 with n=50000
		double[] array4a = new double[50000];
		PrefixAverages1(array4a, 50000);

		//question 4-B) guess the amount of time for 5x the size from 4-A)
		//it took 1513 milliseconds for 4-A) so i would guess it
		//will take 7565.

		// question 4-C) run the program of the 50000*5 / 250000
		double[] array4c = new double[250000];
		PrefixAverages1(array4c, (50000*5));
		// it took 29367 milliseconds which is almost 4 times longer
		//then expected.
		//we got 7565 as the eximate by multipling the 1513 from A by 5.

		//question 5-A) run the program of prefix 2 with n=2500000
		double[] array5a = new double[2500000];
		PrefixAverages2(array5a, 2500000);


		//question 5-B) guess the amount of time for 5x the size from 5-A)
		//5-A took 351 ms to run. estimated time is 1755ms

		// question 5-C) run the program of the 2500000*5 / 12500000
		double[] array5c = new double[12500000];
		PrefixAverages2(array5c, (2500000*5));
		//it took 1269ms to run
		//it took a shorter amount of time by almost 30% faster to run the 5 times
		//larger the size amount
		//we got 1755 by multipling the 351 by 5.


	}

	//quadratic time prefix average algorithm.
	public static double[] PrefixAverages1(double[] array1, int x){
		//creates an array. it's size is based on the user given.
		double[] arrayaverage = new double[x];

		double a=0;
		SecureRandom random = new SecureRandom();

		long end=0, finish=0;
		//starts the timer for the run time length of the method
		long start = System.nanoTime();

		//runs the loop based on the size of the array given at the beginning of
		//the method
		for(int i=0; i <arrayaverage.length; i++){
			//adds a random number to each slot of the temp array
			arrayaverage[i] = random.nextInt(100) +1;
			for(int j=0; j<i; j++){
				//calculates the average
				a=a+arrayaverage[j];
			}
			//saves the average into each slot of to the array provided
			array1[i] = a/(i);
		}
		//the end timer for the runtime
		end = System.nanoTime();
		//calculates the runtime of the method based on the start and end
		finish = end - start;

		//print nano time / 1000000
		//converts the runtime from nanoseconds to milliseconds.
		finish = finish/1000000;
		//prints it out to console the milliseconds
		System.out.println("Time taken for PrefixAverages1"
				+ " (in mil seconds): " + finish);
		//returns the array containing the averages of the numbers.
		return array1;
	}

	//linear-time prefix averages algorithm.
	public static double[] PrefixAverages2(double[] array, int length){
		//creates an array. it's size is based on the user given.
		double[] arrayaverage = new double[length];
		long start=0, end=0, finish=0;
		//used to create a random number for using in the average.
		SecureRandom random = new SecureRandom();
		//starts the timer for the run time length of the method
		start = System.nanoTime();
		double a=0;
		for(int i=0; i <array.length; i++){
			//adds a random number to each slot of the temp array
			arrayaverage[i] = random.nextInt(100) +1;
			//calculates the average
			a=a+arrayaverage[i];
			//saves the average into each slot of to the array provided
			array[i] = a/(i);
		}
		//the end timer for the runtime
		end = System.nanoTime();
		//calculates the runtime of the method based on the start and end
		finish = end - start;
		//converts the runtime from nanoseconds to milliseconds.
		finish = finish/1000000;
		//prints it out to console the milliseconds
		System.out.println("Time taken for PrefixAverages2 "
				+ "(in mil seconds): " + finish);

		//returns the array containing the averages of the numbers.
		return array;
	}


}
