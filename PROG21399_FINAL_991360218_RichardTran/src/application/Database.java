package application;

import java.util.ArrayList;

public class Database {

    private ArrayList<Employee> list = new ArrayList<Employee>();    // List of items

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
    public Employee getEmployee(int index) {
        return list.get(index);
    }

    public void AddEmployee(String newName, double hourly, double hoursworked){

        list.add(new Employee(newName, hourly, hoursworked));
       // list.add(newName, newAddress, newGPA);

    }

    public double gettotal(){
    		int x=list.size();
    		double grosspay=0;
    		for (int i=0; i<x; i++){
    			grosspay=grosspay+list.get(i).calcSalary();
    		}
    		return grosspay;
    }


}
