import java.security.SecureRandom;

//PROG 20025–Algorithm Developmentand Data Structures
//Richard Tran

/*

Input: An n-element array X of numbers.
Output: An n-element array A of numbers such that A [i] is
the average of elements X [O] , . . . ,X [i] .
Let A be an array of n numbers.
for i +-- 0 to n - 1 do
a +-- 0
for j +-- 0 to i do
a +-- a + X [j]
A [i] +--a/(i + l )
return array A


 */

public class PrefixAverages1 {

	public static double[] PrefixAverages1(double[] array1, int x){

		double[] arrayaverage = new double[x];
		double a=0;
		SecureRandom random = new SecureRandom();
		long end=0, finish=0;
		long start = System.nanoTime();

		for(int i=0; i <arrayaverage.length; i++){
			arrayaverage[i] = random.nextInt(100) +1;
			for(int j=0; j<i; j++){
				a=a+arrayaverage[j];
			}

			array1[i] = a/(i);
		}
		end = System.nanoTime();
		finish = end - start;
		finish = finish/1000000;
		System.out.println("Time taken for PrefixAverages1"
				+ " (in mil seconds): " + finish);
		return arrayaverage;
	}

}
