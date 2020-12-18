package randomarray;

public class Main {

	public static void main(String[] args) {

		int[] a1 = new int[5];
		a1[0] = 5;
		a1[1] = 8;
		a1[2] = 2;
		a1[3] = 9;
		a1[4] = 3;
		int max = a1[0];
		for (int x=0; x < a1.length; x++){

		//System.out.println(a1[x]);
			if (max < a1[x]){
				max = a1[x];
			}
		}
		System.out.println("Max integer from the array list: " + max);


	}

}
