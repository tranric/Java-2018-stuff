package textfileoperationdemo;

import java.io.*;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class textfileoperationsdemo {
												//or FileNotFoundException
										// throws IOException
	public static void main(String[] args) {
		/*
		Scanner in = new Scanner (System.in);
		int a = in.nextInt();
		String s = in.nextLine();
		System.out.println("a: " + a + " s: " + s);
		*/
		/*
		Scanner in = new Scanner ("20 30");
		System.out.println(in.nextInt() + in.nextInt());
		*/

		try {
				//%n - new line %s string %d digit/int
			Formatter output = new Formatter("data1.txt");
			output.format("%s %d%n", "Tome Hanks" , 10 );
			output.format("%s %d%n", "Bill Gates" , 20 );
			output.close();


		}
		catch (IOException e) {

			e.printStackTrace();
		}

		try{

			Scanner input = new Scanner(Paths.get("data1.txt"));
			while(input.hasNext()){
				System.out.printf("%s %s %d%n", input.next(),
						input.next() , input.nextInt());
			}
			input.close();

		}
		catch(IOException ex){
			ex.printStackTrace();
		}

		/*
		try {

			PrintWriter out  = new PrintWriter("Data.txt");
			out.print("Bob ");
			out.print("st. ");
			out.println(1);
			out.print("Alice ");
			out.print("Wu ");
			out.print(2);
			out.close();


		}
		catch (IOException ex) {

			ex.printStackTrace();
		}


		try {

			Scanner in = new Scanner(new File("Data.txt"));

			while(in.hasNext()){
				String fName = in.next();
				String lName = in.next();
				int id = in.nextInt();
				System.out.println("First Name: " + fName + "Last Name: " +
				lName + "Id: " + id);
			}

		}
		catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		 */
	}


}
