/*
 * Description for MainController
 * is controller for Main.fxml
 */

package application;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {
	@FXML private Button _btnAddEmployee;
	@FXML private TextField _txtName;
	@FXML private TextField _txtHourlyPay;
	@FXML private TextField _txtHoursWorked;
	@FXML private TextArea _txtEmployeeInformation;
	static ArrayList<Employee> _employeeList = new ArrayList<Employee>();

	@FXML private void initialize()
	{
		// leave empty
	}

	@FXML private void handleAddEmployeeButton()
	{

		// @param display the employee info in text area
		String display = "Employee\tHourly Rate\tHours Worked\tGross Pay\n";

		try {
		// Declarations & Initializations
		// @param name name of employee read from text field
		String name = _txtName.getText();
		// @param hourlyPay pay per hour for employee read from text field
		double hourlyPay = Double.parseDouble(_txtHourlyPay.getText());
		// @param hoursWorked hours worked by employee read from text field
		int hoursWorked = Integer.parseInt(_txtHoursWorked.getText());


		// @param employee a Employee class object
		// with name, hourlyPay, and hoursWorked as parameters
		Employee employee = new Employee(name, hourlyPay, hoursWorked);

		// add an employee's info to the employee list
		_employeeList.add(employee);
		}
		catch (NumberFormatException e){
			e.printStackTrace();
			System.out.println("Invalid Entry");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Invalid Entry");
		}
		finally {

		// clear all text fields
		_txtName.clear();
		_txtHourlyPay.clear();
		_txtHoursWorked.clear();

		// loop cycle through all employees in employeeList
		for (int index = 0; index < _employeeList.size(); index++) {
			display += _employeeList.get(index).getName();
			display += "\t\t\t";
			display += _employeeList.get(index).getHourlyPay();
			display += "\t\t\t";
			display += _employeeList.get(index).getHoursWorked();
			display += "\t\t\t\t$";
			display += _employeeList.get(index).calcSalary();
			display += "\n";
		}
		double sum = 0;

		for (int index = 0; index < _employeeList.size(); index++) {
			sum += _employeeList.get(index).calcSalary();
		}

		display += "\t\t\t\t\t\t\t\t\tFinal Total $" + sum;

		// sets the text in _txtEmployeeInformation
		_txtEmployeeInformation.setText(display);
	}

}
}
