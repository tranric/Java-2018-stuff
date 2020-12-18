package fileclassdemo;

import java.io.File;
import java.io.IOException;

public class fileclassdemo {

	public static void main(String[] args) throws IOException {
		File file = new File("test.txt");
		file.createNewFile();
		System.out.println("File exists? " + file.exists());
		System.out.println("File size? " + file.length() + " bytes");
		System.out.println("File readable? " + file.canRead());
		System.out.println("File executes? " + file.canExecute());
		System.out.println("File writes? " + file.canWrite());
		System.out.println("File is a file? " + file.isFile());
		System.out.println("File is a directory? " + file.isDirectory());
		System.out.println("File is hidden? " + file.isHidden());

		File dir = new File("ABC");
		dir.mkdir();
		System.out.println("File exists? " + dir.exists());
		System.out.println("File readable? " + dir.canRead());
		System.out.println("File is a file? " + dir.isFile());
		System.out.println("File is a directory? " + dir.isDirectory());

	}

}
