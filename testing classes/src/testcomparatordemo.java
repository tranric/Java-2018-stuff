import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testcomparatordemo {

	public static void main(String[] args) {

		Manager m1 = new Manager(2, 70000, "Bob", "Manages everything");
		Manager m2 = new Manager(4, 75000, "Alice", "Manages everything");
		Worker w1 = new Worker(1, 60000, "Bill", "Works weekly");
		Worker w2 = new Worker(3, 63000, "Tim", "Works daily");

		ArrayList<Employee> staff = new ArrayList();
		staff.add(m1);
		staff.add(m2);
		staff.add(w1);
		staff.add(w2);

		Collections.sort(staff, new salarycomparator());
		/*
		 //enhanced for loop
		for(Employee e : staff){
			System.out.println(e.Salary + " " + e.name);
		}
		*/
		//normal for loop
		for(int x=0; x < staff.size(); x++){
			System.out.println(staff.get(x).Salary + " " + staff.get(x).name);
		}

	}


}
