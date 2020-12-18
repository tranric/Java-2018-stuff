package testgenerics;

import java.util.ArrayList;

public class listoperationdemo {

	public static void main(String[] args) {

		Integer[] li1 = {3, 5, 6, 8, 2};
		Integer[] li2 = {14, 15, 16, 18, 12};

		ArrayList<Integer> list1 = new ArrayList();
		for(Integer e : li1){
			list1.add(e);
		}
		ArrayList<Integer> list2 = new ArrayList();
		for(Integer e : li2){
			list2.add(e);
		}

		String[] li3 = {"a", "b", "c", "d"};
		String[] li4 = {"e", "f", "g", "h"};

		ArrayList<String> list3 = new ArrayList();
		for(String e : li3){
			list3.add(e);
		}
		ArrayList<String> list4 = new ArrayList();
		for(String e : li4){
			list4.add(e);
		}



		System.out.println("l1 combined with l2: " + combine(list1, list2));
		System.out.println("l3 combined with l4: " + combine(list3, list4));

		Integer[] li5 = {2, 5, 7, 3, 9};
		Integer[] li6 = {3, 4, 5, 1};

		ArrayList<Integer> list5 = new ArrayList();
		for(Integer e : li5){
			list5.add(e);
		}
		ArrayList<Integer> list6 = new ArrayList();
		for(Integer e : li6){
			list6.add(e);
		}

		//System.out.println("l5 uncommon with l6: " + uncommon(list5, list6));
		System.out.print("l5 uncommon with l6:");
		uncommon(list5, list6);


	}

	static <E>   ArrayList<E> combine(ArrayList<E> list1, ArrayList<E> list2 ){

		//ArrayList<E> temp = new ArrayList();

		//alternatively -

		ArrayList<E> temp = (ArrayList<E>)list1.clone();
		for(E e : list2){
		temp.add(e);
		}

		//another version.
		/*
		 for(int x=0; x < list1.size(); x++){
			 temp.add(list1.get(x));
		 }
		 for(int x=0; x < list2.size(); x++){
			 temp.add(list2.get(x));
		 }
		*/
		/*
		temp.addAll(list1);
		temp.addAll(list2);
		*/
		return temp;
	}
	//static <E>  ArrayList<E> uncommon(ArrayList<E> list1, ArrayList<E> list2 ){
	static <E>   void uncommon(ArrayList<E> list1, ArrayList<E> list2 ){
		/*
		ArrayList<E> temp = (ArrayList<E>)list1.clone();

		for(int x=0; x < temp.size(); x++){
			for(int y=0; y < list2.size(); y++){
				if(temp.get(x).equals(list2.get(y))){
					temp.remove(x);
				}
			}
		}
		*/

		ArrayList<E> temp = new ArrayList();

		for(E e : list1){
			if(!(list2.contains(e))){
				temp.add(e);
			}
		}
		System.out.println(temp);

		//return temp;
	}

}
