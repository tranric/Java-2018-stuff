package application;
// Represents the information for an employee
public class Employee
{
	private String _fullName; //represents name of employee
	private double _hourlyPayRate; //represents amount paid per hour
	private double _hoursWorked; //represents number of hours worked

	//nondefault constructor
	public Employee(String newName, double newPay, double newHours)
	{
		this._fullName = newName;
		this._hourlyPayRate = newPay;
		this._hoursWorked = newHours;
	}

	//getters and setters for name
	public String getName()
	{
		return this._fullName;
	}

	public void setName(String newName)
	{
		this._fullName = newName;
	}

	//getters and setters for _hourlyPayRate
	public double getHourlyPay()
	{
		return this._hourlyPayRate;
	}

	public void setHourlyPay(double newHourlyPay)
	{
		this._hourlyPayRate = newHourlyPay;
	}

	//getters and setters for _hoursWorked
	public double getHoursWorked()
	{
		return this._hoursWorked;
	}

	public void setHoursWorked(double newHoursWorked)
	{
		this._hoursWorked = newHoursWorked;
	}

	// TODO: Add the method for calculating salary
	public double calcSalary()
	{

		double salary=0;
		if(_hoursWorked < 40){
			salary = _hourlyPayRate * _hoursWorked;
		}
		else{
			salary = (_hourlyPayRate * 1.5) * _hoursWorked;
		}

		return salary;
		//return 0;
	}
	public String toString(){
		   return (_fullName+ "\t\t\t$"+ _hourlyPayRate + "\t\t" + _hoursWorked+"\t\t\t$"+calcSalary());
		  }
}
