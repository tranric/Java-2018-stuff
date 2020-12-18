package arraylistdemo;

import java.util.ArrayList;

public class demothing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an arraylist for holding integer values
		ArrayList<Integer> intvalue = new ArrayList();
		//ArrayList<Integer> intvalue1 = new ArrayList<Integer>();
		//ArrayList intvalue2 = new ArrayList();
		//add values to our intvalues
		intvalue.add(5);
		intvalue.add(5);
		intvalue.add(5);
		intvalue.add(40);
		System.out.println("Size of the array:" + intvalue.size());
		System.out.println("index of 40:" + intvalue.indexOf(40));
		/*
		for (int x=0; x < intvalue.size(); x++){
			System.out.println(intvalue.get(x));


		}
		*/
		/*
		for(Integer e: intvalue){
			System.out.println(e);

			//System.out.println();
		}
		intvalue.add(2, 900);

		for(Integer e: intvalue){
			System.out.println(e);

		}
		*/




	}

}
