import java.util.ArrayList;
import java.util.Collections;

//Lab 2
//Richard Tran
//991360218



public class Main {

	public static void main(String[] args) {

		//making both lists for the questions
		Integer[] li1 = {6,4,1};
		Integer[] li2 = {6,4,2,7,5,5,0,8,8,4,4};

		//converts each array to an arraylist
		ArrayList<Integer> list1 = new ArrayList();
		for(Integer e : li1){
			list1.add(e);
		}
		ArrayList<Integer> list2 = new ArrayList();
		for(Integer e : li2){
			list2.add(e);
		}

		//output for Answer to (i)
		System.out.println("Answer to (i)");
		System.out.println("The List 1 = " + list1);
		System.out.println("The List 2 = " + list2);
		System.out.println("Both Lists together: " + addLists(list1, list2));

		System.out.println();

		//output for Answer to (ii)
		System.out.println("Answer to (ii)");
		System.out.println("List 1 after removing common items:"
				+ removeFromList(list1, list2).size());

		System.out.println();

		//output for Answer to (iii)
		System.out.println("Answer to (iii)");
		countOccurrences(list1, list2);

		System.out.println();

		//output for Answer to (iv)
		System.out.println("Answer to (iv)");
		System.out.println("Sorted List1:" + sortlist(list1));
		System.out.println("Sorted List2:" + sortlist(list2));
		System.out.println("Merged sorted lists:"
		+ mergeSortedLists(list1, list2));


		//The Bonus part
		System.out.println("The Bonus part");

		Student s1 = new Student(1, "John" );
		Student s2 = new Student(5, "Bob");
		Student s3 = new Student(25, "Alice");

		ArrayList<Student> studentlist = new ArrayList();
			studentlist.add(s1);
			studentlist.add(s2);
			studentlist.add(s3);


			System.out.println(findMax(studentlist).getName()
			+ " has the highest ID of: " + findMax(studentlist).getStudentID());


			//System.out.println(findMax(studentlist));
			/*
			int max=0;

			for(int x=0; x < studentlist.size(); x++){

				if(max < studentlist.get(x).getStudentID()){
					max = studentlist.get(x).getStudentID();
					//System.out.println("New Max: " + max);
				}
			}
			for(int x=0; x < studentlist.size(); x++){
				if(studentlist.get(x).getStudentID()==max){
					System.out.println(studentlist.get(x).getName() +
							" has the highest ID of: " +
							studentlist.get(x).getStudentID());
				}
			}
	*/




	}


// answer to (i)
public static <E>   ArrayList<E> addLists(ArrayList<E> list1, ArrayList<E> list2 ){

		ArrayList<E> temp = new ArrayList();

		//adds all of the elements to the temp array from list 1
		temp.addAll(list1);
		//same as above but with list 2
		temp.addAll(list2);
		//returns an arraylist containing both lists combined.
		return temp;

	}

// Answer to (ii)
public static <E extends Comparable<E>> ArrayList<E> removeFromList
(ArrayList<E> list1, ArrayList<E> list2 ){

	ArrayList<E> temp = new ArrayList();
	//goes through each element in the arraylist
	for(E e : list1){
		//checks if an element from list 2 matches with an element of list 1
		if(!(list2.contains(e))){
			//if no elements match from the two lists add to the temp list
			temp.add(e);
		}
	}
	//returns an arraylist  with the common items removed
	return temp;

}

// Answer to (iii)
public static <E extends Comparable<E>> void
 countOccurrences (ArrayList<E> list1, ArrayList<E> list2){

	//creates a temp arraylist to not edit or change the lists we are working with.
	ArrayList<E> temp = (ArrayList<E>)list1.clone();
	int count=0;
	//for loop to go through each element from list 1
	for(int x=0; x < temp.size(); x++){
		//resets the counter for the next element in the arraylist
		count=0;
		//for loop to go through each element from list 2
		for(int y=0; y < list2.size(); y++){
			if(temp.get(x).equals(list2.get(y))){
				//adds to the counter if the element matches with
				//an element from list 2
				count++;
			}
		}
		//prints the count of each element in the arraylist
		System.out.println(temp.get(x) + " of the 1st list occurs " + count
				+ "times in the 2nd list");
	}
}


//Answer to (iv)
public static <E extends Comparable<E>> ArrayList<E>
mergeSortedLists (ArrayList<E> list1, ArrayList<E> list2){
		/*

	Sorted List1: [1, 4, 6]
	Sorted List2: [0, 2, 4, 4, 4, 5, 5, 6, 7, 8, 8]
	Merged sorted lists: [0, 1, 2, 4, 4, 4, 4, 5, 5, 6, 6, 7, 8, 8]
		 */

	//adds both list to a temp array to not edit/change the lists imported
	ArrayList<E> sortedlist1 = (ArrayList<E>)list1.clone();
	ArrayList<E> sortedlist2 = (ArrayList<E>)list2.clone();

	//sorts the lists
	sortedlist1 = sortlist(sortedlist1);
	sortedlist2 = sortlist(sortedlist2);

	//temp array for merging both lists
	ArrayList<E> mergedSortedList = new ArrayList();

	int current1 = 0; // Current index in list1
	int current2 = 0; // Current index in list2
	while(current1 < sortedlist1.size() && current2 < sortedlist2.size()) {

	if(sortedlist1.get(current1).compareTo(sortedlist2.get(current2))<0){
		mergedSortedList.add(sortedlist1.get(current1++));
	}

	else{
		mergedSortedList.add(sortedlist2.get(current2++));
	}
	}
	while (current1 < sortedlist1.size()){
		mergedSortedList.add(sortedlist1.get(current1++));
	}

	while (current2 < sortedlist2.size()){
		mergedSortedList.add(sortedlist2.get(current2++));
	}



	return mergedSortedList;

}

public static <E extends Comparable<E>> ArrayList<E>
sortlist (ArrayList<E> list1){

	ArrayList<E> sortedlist1 = (ArrayList<E>)list1.clone();
	Collections.sort(sortedlist1);

	return sortedlist1;

}

public static <E extends Comparable<E>> E findMax (ArrayList<E> temp){
    E max = temp.get(0);
    for(int x=0; x < temp.size(); x++){
    	 if (max.compareTo(temp.get(x)) < 0){
             max = temp.get(x);
    	 }
    }
/*
    for (E s : temp){
        if (max.compareTo(s) < 0)
            max = s;
}
*/
    return max;
}

public static <E extends Comparable<E>> E findMax2 (ArrayList<E> temp){
    E max = temp.get(0);
    for (E s : temp){
        if (max.compareTo(s) < 0)
            max = s;
}
    return max;
}

}
