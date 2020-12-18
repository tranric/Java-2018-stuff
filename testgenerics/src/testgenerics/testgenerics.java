package testgenerics;

public class testgenerics {

	public static void main(String[] args) {

		Integer[] myints = {3, 5,2,8,6};
		Double[] mydoubles = {4.3, 2.7, 1.8};
		String[] mystrings = {"Red" , "Blue", "Green" , "Purple"};
		//printarray(myints, 2.5);
		//System.out.println();
		//printarray(mydoubles, "Hello");
		//System.out.println();
		//printarray(mystrings, 10);

		System.out.println("The first intrger element: " + printarray(myints, 2.5));
		System.out.println("The first double element: "
		+ printarray(mydoubles, "hello"));
		System.out.println("The first intger element: " +
		printarray(mystrings, 10));

	}

	//erasure - converting the type to the calling type automatically in runtime
	// T E V K
	/*
	public static <T> T printarray(T[] temp){
		return temp[0];
	}
*/

	//public static <T, E> void printarray(T[] temp, E temp1){
		public static <T, E> T printarray(T[] temp, E temp1){
		for(T e: temp){

			System.out.print(e + " ");
		}
		//System.out.println(temp1);
		return temp[0];

	}

		public static <V, E> V printarray( E temp1, V[] temp){
		for(V e: temp){

			System.out.print(e + " ");
		}
		//System.out.println(temp1);
		return temp[0];
		}

		public static Integer printarray( Integer[] temp, Double temp1){
		for(Integer e: temp){

			System.out.print(e + " ");
		}
		//System.out.println(temp1);
		return temp[0];
		}




	public static void printarray(Integer[] temp){

		for(Integer e : temp){
			System.out.print(e + " ");
		}

	}

	public static void printarray(Double[] temp){

		for(Double e : temp){
			System.out.print(e + " ");
		}

	}
	public static void printarray(String[] temp){

		for(String e : temp){
			System.out.print(e + " ");
		}

	}


}
