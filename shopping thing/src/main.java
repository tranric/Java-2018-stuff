import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		customer c1 = new customer(1, "Bob");
		customer c2 = new customer(2, "Alice");
		customer c3 = new customer(3, "John");
		customer c4 = new customer(4, "Tim");
		customer c5 = new customer(5, "Ed");
		customer c6 = new customer(6, "Jill");

		// put all customers into a list
		ArrayList<customer> allcustomers = new ArrayList();
		allcustomers.add(c1);
		allcustomers.add(c2);
		allcustomers.add(c3);
		allcustomers.add(c4);
		allcustomers.add(c5);
		allcustomers.add(c6);


		item i1 = new item(1, "Milk");
		item i2 = new item(2, "Apple");
		item i3 = new item(3, "Butter");
		item i4 = new item(4, "Sugar");
		item i5 = new item(5, "Grapes");

		//put all items into an arraylist
		ArrayList<item> allitems = new ArrayList();

		allitems.add(i1);
		allitems.add(i2);
		allitems.add(i3);
		allitems.add(i4);
		allitems.add(i5);

		purchase p1 = new purchase(1, c1, i1);
		purchase p2 = new purchase(2, c2, i1);
		purchase p3 = new purchase(3, c4, i4);
		purchase p4 = new purchase(4, c5, i3);
		purchase p5 = new purchase(5, c2, i4);
		purchase p6 = new purchase(6, c2, i1);

		System.out.println("allitems customers: " + 
		allitems.get(0).getListofcustomers().size());


		System.out.println("1. Customer by items");
		for(item i: allitems){
			if(i.getListofcustomers().isEmpty()){
				System.out.println("Item " + i.getName() + " was not purchased.");
			}
			else{
				System.out.println("Item:" + i.getName() + "\nCustomers:");
				for(String s : i.getListofcustomers()){
					System.out.println(s);
				}
				System.out.println("");
			}
		}

		System.out.println("");

		System.out.println("2. items by customer");
		for(customer i: allcustomers){
			if(i.getListofitems().isEmpty()){
				System.out.println("Customer " + i.getName()
				+ " did not purchase anything.");
			}
			else{
				System.out.println("Customer:" + i.getName() + "\nItems:");
				for(int x=0; x < i.getListofitems().size(); x++){
					System.out.println(i.getListofitems().get(x));
				}
				System.out.println("");
			}
		}
		System.out.println("");
		System.out.println("3. number of items bought by customer");
		for(customer i: allcustomers){
			if(i.getListofitems().isEmpty()){
				System.out.println("Customer " + i.getName()
				+ " did not purchase anything.");
			}
			else{
				System.out.println("Customer:" + i.getName() +
						"\nItems:" + i.getListofitems().size());
				System.out.println("");
			}
		}
		System.out.println("");
		System.out.println("4. number of customers per item");
		for(item i: allitems){
			if(i.getListofcustomers().isEmpty()){
				System.out.println("Item " + i.getName() +
						" was not purchased by any customers.");
			}
			else{
				System.out.println("Item:" + i.getName() + "\nCustomers:" +
			i.getListofcustomers().size());

				System.out.println("");
			}
		}



		Scanner input = new Scanner(System.in);
		System.out.print("\nInput customer name: ");
		String customername = input.next();
		System.out.print("\nInput item name: ");
		String itemname = input.next();
		int y=0;

		//System.out.println("Searching for matching customer and item");

		for(customer c : allcustomers){
			if(c.getName().equals(customername)){
				if(c.getListofitems().contains(itemname)){
					System.out.println("YES: Customer " + customername +
							" has purchased item " + itemname);
				}
				else{
					System.out.println("NO: Customer " + customername +
							" has not purchased item " + itemname);
				}
			}

		}

		/*
		for(int x=0; x < allitems.size(); x++){
			if(allitems.get(x).getName().contains(itemname)){
				System.out.println("Item found. searching for matching customer.");
				y=x;
				break;
			}
		}
		for(int x=0; x<allitems.get(y).getListofcustomers().size(); x++){
			if(allitems.get(y).getListofcustomers().get(x).contains(customername)){
				System.out.println("The customer " + customername +
						" has bought item " + itemname);
				break;
			}
			else{
				System.out.println("The customer " + customername +
						" has NOT bought item " + itemname);
				break;
			}
		}
		*/
		input.close();

		/*
		//p1.allcustomerspurcahseditem(i1);
		System.out.println("Customers for item: "+ i1.getName());
		for(String s : i1.getListofcustomers()){
			System.out.println(s);
		}

		System.out.println("Customers for item: "+ i2.getName());
		for(String s : i2.getListofcustomers()){
			System.out.println(s);
		}

		System.out.println("Customers for item: "+ i3.getName());
		for(String s : i3.getListofcustomers()){
			System.out.println(s);
		}

		System.out.println("Customers for item: "+ i4.getName());
		for(String s : i4.getListofcustomers()){
			System.out.println(s);
		}

		System.out.println("Customers for item: "+ i5.getName());
		for(String s : i5.getListofcustomers()){
			System.out.println(s);
		}
		*/

		//alternative for loop
		/*
		for(int x=0; x< i1.getListofcustomers().size(); x++){
			System.out.println(i1.getListofcustomers().get(x));

		}
		*/
	}

}
