import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilePracticeInJava {

	public static void main(String[] args){

		// declariations and &initalizations
		FilePracticeInJava self = new FilePracticeInJava();
		self.loadData();

	}

	public void saveData(){

		Person p1 = new Person("firstname1","lastname1", 1);
		Person p2 = new Person("firstname2","lastname2", 2);
		PrintWriter writer = null;
		try{
			File fileDescriptor = new File("Addressbook.txt");
			writer = new PrintWriter(fileDescriptor);
			writer.println(p1.getfirstname() + ", " + p1.getlastname()
			+ ", " + p1.getIdNumber());
			writer.println(p2.getfirstname() + ", " + p2.getlastname()
			+ ", " + p2.getIdNumber());

		}
		catch(FileNotFoundException e){

		}
		finally {
			if (writer != null){
				writer.close();
			}
		}

	}

	public void loadData(){
		Scanner reader = null;
		try {
		File fileDescriptor = new File("Addressbook.txt");
		reader = new Scanner(fileDescriptor);
		while (reader.hasNext()) {
		// Now split the string into separate fields...
		String record = reader.nextLine();
		String[] fields = record.split(", ");
		Person p = new Person(fields[0], fields[1], Integer.parseInt(fields[2]));
		System.out.println(p.toString());
		}
		}
		catch (FileNotFoundException e) {
		e.printStackTrace(); // Add error recovery here
		}
		finally {
		if (reader != null) {
		reader.close();
		}
		}
	}

}
