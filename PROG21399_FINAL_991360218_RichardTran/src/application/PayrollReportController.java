package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PayrollReportController {

	@FXML private TextField TxtFieldName;
	@FXML private TextField TxtFieldHourly;
	@FXML private TextField TxtFieldNumberOfHours;
	@FXML private TextArea TxtAreaEmployeeList;
	@FXML private Button BtnAddEmployee;
	public static Database db = new Database();

    @FXML private void initialize() {
        db.load();
    }

	public void AddEmployee(){
		String Name = "";
		double hourly = 0;
		double number_of_hours= 0;
		Name = TxtFieldName.getText();
		hourly = Double.parseDouble(TxtFieldHourly.getText());
		number_of_hours = Double.parseDouble(TxtFieldNumberOfHours.getText());

		db.AddEmployee(Name, hourly, number_of_hours);

        String display = "";
        display="Employee\t\tHourly Rate\tHoursWorked\tGross Pay\n";
        for (int index = 0; index < db.getSize(); index++) {
            //display += db.getEmployee(index);
        	display+= db.getEmployee(index).toString();
            display += "\n";     // Go to the next line
        }
        display +="\n\t\t\tFinal Total $" + db.gettotal();
       // System.out.println(display);
        TxtAreaEmployeeList.setText(display);


	}



}
