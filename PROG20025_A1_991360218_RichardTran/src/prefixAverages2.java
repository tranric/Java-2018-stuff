import java.security.SecureRandom;

//PROG 20025–Algorithm Developmentand Data Structures
//Richard Tran

/*
Input: An n-element array X of numbers.
Output: An n-element array A of numbers such that A [i] is
the average of elements X [O] , . . . , X [i] .
Let A be an array of n numbers.
s <----- 0
for i <----- 0 to n - 1 do
s <----s + X [i]
A [i] <----- sl(i + 1 )
return array A
 */

public class prefixAverages2 {


	public static double[] PrefixAverages2(double[] array, int length){

		double[] arrayaverage = new double[length];
		long start=0, end=0, finish=0;
		SecureRandom random = new SecureRandom();
		//start of runtime in nanoseconds.
		start = System.nanoTime();
		double a=0;
		//runs the loop generating random numbers for each part of the array
		//based the length given
		for(int i=0; i <array.length; i++){
			arrayaverage[i] = random.nextInt(100) +1;

			a=a+arrayaverage[i];
			//calculates the average of the array and
			array[i] = a/(i);
		}
		//the start of the end of the program.
		end = System.nanoTime();
		//calculates the runtime based on the start and end.
		finish = end - start;
		// converts the nanoseconds conversion to milliseconds.
		finish = finish/1000000;

		System.out.println("Time taken for PrefixAverages2 "
				+ "(in mil seconds): " + finish);

		return array;
	}


}
