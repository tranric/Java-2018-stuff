package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Window;

public class MainController {

	@FXML
	private Button _btnSave;
	@FXML
	private Button _btnLoad;
   //declare an array list of person
	ArrayList<Person> _contacts = new ArrayList<Person>();


	// TODO: show the data in the text area
	@FXML
	private TextArea _txtAreaShow;

	@FXML
	private void onSave() {
		FileChooser chooser = new FileChooser();
		// Make chooser show only .txt files by default (optional)
		FileChooser.ExtensionFilter extFilter =
		new FileChooser.ExtensionFilter("TEXT files", "*.txt");
		chooser.getExtensionFilters().add(extFilter);
		Window win = _btnSave.getScene().getWindow(); // _btn can be any control
		File fileDescriptor = chooser.showSaveDialog(win);
		if (fileDescriptor != null) {
		// ** Add code to write file here **

			//** loading the ArrayList
			_contacts.add(new Person("Mel", "Gibson", 1234));
			_contacts.add(new Person("Richard", "Gere", 7861));
			_contacts.add(new Person("Meryl", "Streep", 3421));


			PrintWriter writer  =  null;
			try  {
				//The user chooses the file name (from Open Dialog)
				//File fileDescriptor  =  new  File("addressBook.txt");
				//System.out.println(c.getName());
				writer  =  new  PrintWriter(fileDescriptor);
                // writing the ArrayList into the file
				for(Person person : _contacts){
					writer.println(person.getName()  +  ","  + person.getSurname()  +  ","  + person.getIdNumber());
				}



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





		} else {
		System.out.println("No file selected"); // handle error here
		}





	}
	@FXML
	private void onLoad() {


		FileChooser chooser = new FileChooser();
		// Make chooser show only .txt files by default (optional)
		FileChooser.ExtensionFilter extFilter =
		new FileChooser.ExtensionFilter("TEXT files", "*.txt");
		chooser.getExtensionFilters().add(extFilter);
		Window win = _btnLoad.getScene().getWindow(); // _btn can be any control
		File fileDescriptor = chooser.showOpenDialog(win);
		if (fileDescriptor != null) {
		// ** Add code to read file here **

			Scanner reader  =  null;
			try  {
				//File fileDescriptor  =  new  File("addressBook.txt");
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





		} else {
		System.out.println("No file selected"); // handle error here
		}





	}



}
