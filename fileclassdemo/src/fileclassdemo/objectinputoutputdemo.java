package fileclassdemo;
import java.io.*;
public class objectinputoutputdemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException{

		Student s1 = new Student(1, "Bob" , 3.5);


		ObjectOutputStream output =
				new ObjectOutputStream (new FileOutputStream("data.dat"));

		output.writeObject(s1);

		output.close();

		ObjectInputStream input =
				new ObjectInputStream (new FileInputStream("data.dat"));

		Student temp;
		temp = (Student)input.readObject();

		int readid = temp.getId();
		String readname = temp.getName();
		double readgrade = temp.getGrade();

		System.out.println(readid + " " + readname + " " + readgrade);
		input.close();


		/*
		output.writeInt(10);
		output.writeDouble(2.5);
		output.writeObject(new java.util.Date());

		output.close();

		ObjectInputStream input =
				new ObjectInputStream (new FileInputStream("data.dat"));

		int value=input.readInt();
		double doublevalue = input.readDouble();
		java.util.Date date = (java.util.Date)(input.readObject());
		*/
		/*
		System.out.println(input.readInt());
		System.out.println(input.readDouble());
		System.out.println(input.readObject());
		*/

		/*
		System.out.println(value + " " + doublevalue + " " + date);
		input.close();
		*/


	}

}
