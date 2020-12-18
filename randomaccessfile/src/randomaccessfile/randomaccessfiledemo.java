package randomaccessfile;


import java.io.*;

public class randomaccessfiledemo {
	 public static void main(String[] args){

		 try{

			 RandomAccessFile raf = new RandomAccessFile("Data.dat" , "rw");
			 System.out.println("The file size: " + raf.length() + " bytes");
			 System.out.println("position of the file pointer: " +
			 raf.getFilePointer());
			 //raf.writeUTF("Hello");
			 raf.write("Hello".getBytes());
			 for(int i=1; i <= 20; i++ ){
				 raf.writeInt(i);
			 }

			 System.out.println("The file size: " + raf.length() + " bytes");
			 System.out.println("position of the file pointer: " +
					 raf.getFilePointer());

			 raf.seek(0);
			 raf.seek("Hello".length());

			 System.out.println("1st integer: " + raf.readInt());
			 raf.seek(0);
			 raf.seek("Hello".length() + 10*Integer.BYTES);
			 System.out.println("11th integer: " + raf.readInt());
			 raf.seek(raf.length());
			 raf.writeInt(1000);
			 raf.seek(raf.length()- Integer.BYTES);
			 System.out.println("last integer: " + raf.readInt());
			 /*
			 raf.seek(4 * Integer.BYTES);
			 System.out.println("5th integer: " + raf.readInt());
			 raf.seek(14 * Integer.BYTES);
			 System.out.println("15th integer: " + raf.readInt());
			 raf.seek(6 * Integer.BYTES);
			 System.out.println("7th integer: " + raf.readInt());
			 raf.seek(11 * Integer.BYTES);
			 raf.writeInt(100);
			 raf.seek(11 * Integer.BYTES);
			 System.out.println("12th integer: " + raf.readInt());
			*/
			 raf.close();



		 }
		 catch(IOException e){
			 e.printStackTrace();
		 }

	 }
}
