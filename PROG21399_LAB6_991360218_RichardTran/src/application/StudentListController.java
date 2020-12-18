package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class StudentListController {

	@FXML private Button BtnAdd;
	@FXML private TextArea TxtAreaList;
	@FXML private TextField TxtFieldName;

    @FXML private void initialize() {
    	load();
    }

    public void addstudent(){

		//PrintWriter writer  =  null;

		// Files.write(Paths.get("myfile.txt"),
		//"the text".getBytes(), StandardOpenOption.APPEND);
		try  {
			//File fileDescriptor  =  new  File("studentlist.txt");
			 PrintWriter writer = new PrintWriter(new FileOutputStream(
			    		new File("studentlist.txt"),
			    	true ));
			/*
			 PrintWriter pw = new PrintWriter(new FileOutputStream(
    		new File("studentlist.txt"),
    	true ));
			 */
			//writer  =  new  PrintWriter(fileDescriptor);
			writer.append(TxtFieldName.getText()+" ");
			writer.close();
		}
		catch  (FileNotFoundException  e)  {
			e.printStackTrace();  //  Add  error  recovery  here  if  needed
		}
		/*
		finally  {
			if  (writer  !=  null)  {
				writer.close();
			}
		}
		*/
		load();
    }

    public void load(){
		Scanner reader = null;
		try {
		File fileDescriptor = new File("studentlist.txt");
		reader = new Scanner(fileDescriptor);
		String data="";
		while (reader.hasNext()) {
		// Now split the string into separate fields...
		String record = reader.nextLine();
		String[] fields = record.split(" ");
			int x=fields.length;
			for(int j=0; j<x; j++){
				//System.out.println(fields[j].toString());
				data=data+fields[j].toString() + "\n";
			}
			TxtAreaList.setText(data);
		//TxtAreaList.setText(fileDescriptor.toString());
		//Person p = new Person(fields[0], fields[1], Integer.parseInt(fields[2]));
		//System.out.println(p.toString());
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
