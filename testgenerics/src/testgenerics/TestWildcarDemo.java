package testgenerics;
import java.util.ArrayList;

public class TestWildcarDemo {

	public static void main(String[] args) {

		Number[] mynum = {3, 4.7, 7, 9.2, 4};
		ArrayList<Number> allnum = new ArrayList();
		for(Number e : mynum){
			allnum.add(e);
		}
		System.out.println("The sum = " + sum(allnum));


		Integer[] myint = {3, 7, 9, 4};
		ArrayList<Integer> allint = new ArrayList();
		for(Integer e : myint){
			allint.add(e);
		}
		System.out.println("The sum = " + sum(allint));

		Double[] mydouble = {3.1, 7.1, 9.1, 4.1};
		ArrayList<Double> alldouble = new ArrayList();
		for(Double e : mydouble){
			alldouble.add(e);
		}
		System.out.println("The sum = " + sum(alldouble));


		ArrayList<Integer> l1 = new ArrayList();
		ArrayList<Integer> l2 = new ArrayList();
		ArrayList<String> l3 = new ArrayList();
		ArrayList<String> l4 = new ArrayList();

		l1.add(5);
		l1.add(10);
		l2.add(2);
		l2.add(4);
		l3.add("a");
		l3.add("b");
		l4.add("c");
		l4.add("d");

		System.out.println("l1 combined with l2: " + combine(l1, l2));
		System.out.println("l3 combined with l4: " + combine(l3, l4));

	}

	 static <E extends Number> double sum(ArrayList<E> allnum) {
		double sum=0;
		for(Number e : allnum){
			sum += e.doubleValue();
		}
		return sum;
	}

	 static ArrayList combine(ArrayList l1, ArrayList l2){
		 ArrayList temp = new ArrayList();

		 for(int x=0; x < l1.size(); x++){
			 temp.add(l1.get(x));
		 }
		 for(int x=0; x < l2.size(); x++){
			 temp.add(l2.get(x));
		 }

		 return temp;
	 }

	/*
	private static double sum(ArrayList<? extends Number> allnum) {

		double sum=0;

		//regular for loop.
		for(int x=0; x < allnum.size(); x++){
			sum += allnum.get(x).doubleValue();
		}
	*/
		//enhanced for loop.
		/*
		for(Number e : allnum){
			sum += e.doubleValue();
		}
		*/
	/*
		return sum;
	}

	*/



}
