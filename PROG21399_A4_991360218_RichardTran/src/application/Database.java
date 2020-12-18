package application;

import java.util.ArrayList;

/**
 * This class represents the "model", e.g. list of students in a student database, or list of products in an inventory app.
 * It also contains some additional data items (fields) for passing information between windows.
 */
public class Database {

    private ArrayList<Student> list = new ArrayList<Student>();    // List of items

    // Here you might load the list from a file.
    // This method just creates some list entries for demonstration purposes.
    public void load() {
        list.clear();

    }

    // Get the number of items in the database
    public int getSize() {
        return list.size();
    }

    // Get a list item
    public Student getItem(int index) {
        return list.get(index);
    }

    public void AddStudent(String newName, String newAddress, String newGPA){

        list.add(new Student(newName, newAddress, newGPA));
       // list.add(newName, newAddress, newGPA);

    }

    public void SortList(){
    	int x= list.size();
    	Student temp;
    	System.out.println("List size:" + x);
    	for (int i=0; i< x; i++){
    		for (int y=i+1; y<x; y++){

    			System.out.println("i:" + i);
				System.out.println("y:" + y);
    			if(list.get(i).getFullName().compareTo(list.get(y).getFullName())>0){
    				//System.out.println("list i name:" + list.get(i).getFullName());
    				//System.out.println("list y name:" + list.get(y).getFullName());
    				temp = list.get(i);
    				//System.out.println("list index of i:"+ list.indexOf(i));
    				//list.set(list.indexOf(list.get(i)), list.get(y));
    				//System.out.println("list index of y:"+ list.indexOf(y));
    				//list.set(list.indexOf(list.get(y)), temp);
    				list.set(i, list.get(y));
    				list.set(y, temp);
    				//list.set(index, element)
    				//System.out.println("list i name after:" + list.get(i).getFullName());
    				//System.out.println("list y name after:" + list.get(y).getFullName());
    			}
    		}
    	}
    	/*
    	 logic
    	  for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (names[i].compareTo(names[j])>0)
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
    	 */
    }

}
