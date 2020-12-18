package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilePracticeOne {


	public static void main(String[] args) {


		FilePracticeOne f1 = new FilePracticeOne();
		f1.saveData();
		//f1.loadData();
	}

	public void saveData() {

		Person p1 = new Person("Mel", "Gibson", 1234);
		Person p2 = new Person("Richard", "Gere", 7861);
		Person p3 = new Person("Meryl", "Streep", 3421);


		PrintWriter writer  =  null;
		try  {
			File fileDescriptor  =  new  File("addressBook.txt");
			//System.out.println(c.getName());
			writer  =  new  PrintWriter(fileDescriptor);
			writer.println(p1.getName()  +  ","  + p1.getSurname()  +  ","  + p1.getIdNumber());
			writer.println(p2.getName()  +  ","  + p2.getSurname()  +  ","  + p2.getIdNumber());
			writer.println(p3.getName()  +  ","  + p3.getSurname()  +  ","  + p3.getIdNumber());
			System.out.println("*****Data Saved Succesfuly****");
		}
		catch  (FileNotFoundException  e)  {
			e.printStackTrace();  //  Add  error  recovery  here  if  needed
		}
		finally  {
			if  (writer  !=  null)  {
				writer.close();
			}
		}
	}










	public void loadData() {
		Scanner reader  =  null;
		try  {
			File fileDescriptor  =  new  File("addressBook.txt");
			reader  =  new  Scanner(fileDescriptor);
			while  (reader.hasNext())  {
				String  record  =  reader.nextLine();
				String[]  fields  =  record.split(",");
				Person p = new Person(fields[0], fields[1], Integer.parseInt(fields[2]));
				System.out.println(p.toString());
			}
		}
		catch  (FileNotFoundException  e)  {
			e.printStackTrace();  //  Add error recovery  here
		}
		finally  {
			if  (reader  !=  null)  {
				reader.close();
			}
		}
	}




}
