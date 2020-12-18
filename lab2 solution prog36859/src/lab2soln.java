
import java.util.ArrayList;
import java.util.Collections;

public class lab2soln {

	public static void main(String args[]){
            ArrayList<Integer> myList1 = new ArrayList<Integer>();
            ArrayList<Integer> myList2 = new ArrayList<Integer>();
//		ArrayList<String> myList1 = new ArrayList<String>();
//		ArrayList<String> myList2 = new ArrayList<String>();
//		ArrayList<String> myList3 = new ArrayList<String>();
//		int listSize = 10;
            int listSize1 = (int)(Math.random()*15);
            int listSize2 = (int)(Math.random()*15);

            for(int i = 0; i < listSize1; i++){
                    myList1.add((int)(Math.random()*10));
            }
            for(int i = 0; i < listSize2; i++){
                    myList2.add((int)(Math.random()*10));
            }
//		myList1.add("Sheridan");
//		myList1.add("College");
//		myList2.add("Seneca");
//		myList2.add("College");
//		myList3.add("Hello");
//		myList3.add("World!");
//
            //(Answer to i)
            System.out.println("Answer to (i)");
            System.out.print("The List 1 = ");
            System.out.println(myList1);
            System.out.print("The List 2 = ");
            System.out.println(myList2);
            addLists(myList1, myList2);
            System.out.println();

            //Answer to ii
            System.out.println("Answer to (ii)");
            System.out.println("List 1 after removing common items: " + removeFromList(myList1, myList2));
            System.out.println();

            //Answer to iii
            System.out.println("Answer to (iii)");
            ArrayList<Integer> countArray = countOccurrences(myList1, myList2);
            if (countArray.isEmpty())
                System.out.println("The first list is empty.");
            else
                for (int i = 0; i<myList1.size(); i++){
                    System.out.println(myList1.get(i).toString() + " of the 1st list occurs " + countArray.get(i) + " times in the 2nd list");
                }
            System.out.println();

            //Answer to iv
            System.out.println("Answer to (iv)");
            System.out.println("Merged sorted lists: " + mergeSortedLists(myList1, myList2));
            System.out.println();

            //Bonus
            System.out.println("The Bonus part ");
            Student s1 = new Student(22, "Bob", "Security");
            Student s2 = new Student(20, "Jill", "Networking");
            Student s3 = new Student (25, "Alice", "DB");
            ArrayList<Student> allStudents = new ArrayList(){
            	{add(s1); add(s2); add(s3);}};
            System.out.println(findMax(allStudents).getName() +
            		" has the highest ID of: " + findMax(allStudents).getId());
     //  System.out.println(findMax(allStudents).getId());
          //  findMax(allStudents);
	}

        // Add one list to the end of other
        public static <E> void addLists (ArrayList<E> list1, ArrayList<E> list2){
            ArrayList<E> tempList = new ArrayList<E>();
            tempList = (ArrayList<E>)list1.clone();
            for(E obj: list2){
			tempList.add(obj);
		}
                System.out.println("Both lists together: " + tempList);
        }

        // Sort and merge two lists
        public static <E extends Comparable<E>> ArrayList<E> mergeSortedLists (ArrayList<E> list1, ArrayList<E> list2){
            ArrayList<E> tempList1 = (ArrayList<E>)list1.clone();
            ArrayList<E> tempList2 = (ArrayList<E>)list2.clone();
            Collections.sort(tempList1);
            Collections.sort(tempList2);
            System.out.println("Sorted List1: " + tempList1);
            System.out.println("Sorted List2: " + tempList2);
            ArrayList<E> mergedSortedList = new ArrayList<E>();
            int current1 = 0; // Current index in tempList1
            int current2 = 0; // Current index in tempList2
            while (current1 < tempList1.size() && current2 < tempList2.size()) {
                if (tempList1.get(current1).compareTo(tempList2.get(current2))< 0 )
                    mergedSortedList.add(tempList1.get(current1++));
                else
                    mergedSortedList.add(tempList2.get(current2++));
            }
            while (current1 < tempList1.size())
                mergedSortedList.add(tempList1.get(current1++));
            while (current2 < tempList2.size())
                mergedSortedList.add(tempList2.get(current2++));
            return mergedSortedList;
	}

        // Remove common elements from the first list
        public static <E> ArrayList<E> removeFromList(ArrayList<E> list1, ArrayList<E> list2){
            ArrayList<E> tempArray = (ArrayList<E>)list1.clone();
            for(E object: list2){
                if(tempArray.contains(object))
                    tempArray.remove(object);
		}
            return tempArray;
	}
        // Count the occurrence
        public static <E extends Comparable<E>> ArrayList<Integer> countOccurrences(ArrayList<E> list1, ArrayList<E> list2){
            ArrayList<Integer> tempArray = new ArrayList<Integer>();
            for(int i = 0; i < list1.size(); i++){
                int count = 0;
                for(int j = 0; j < list2.size(); j++)
                    if(list1.get(i).toString().equals(list2.get(j).toString())){
                        count++;
                    }
                tempArray.add(count);
		}
            return tempArray;
	}
        public static <E extends Comparable<E>> E findMax (ArrayList<E> temp){
            E max = temp.get(0);
            for (E s : temp){
                if (max.compareTo(s) < 0)
                    max = s;
		}
            return max;
        }
//
}