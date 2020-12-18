package fileclassdemo;

import java.io.*;

public class fileinputpoutstringdemo {
	public static void main(String[] args) throws IOException {

		FileOutputStream output = new FileOutputStream("Data.dat");

		for(int i=1; i<=10; i++){
			output.write(i);
		}
		output.close();

		FileInputStream input = new FileInputStream("Data.dat");
		int value=0;
		while((value = input.read()) != -1){
			System.out.println(value);
		}

		input.close();



	}
}
