//lex_auth_0130008620764692481835
//do not modify the above line

package integratedassingnment1;

public class ContractEmployee extends Employee {
	public ContractEmployee(String employeename) {
		super(employeename);
		this.employeeId="E"+Integer.toString(++contractidCounter);
		System.out.println("I am hear recognize:"+this.employeeId);// TODO Auto-generated constructor stub
	}
	public ContractEmployee(String employeeName,double wageperhour)
	{
		super(employeeName);
		this.employeeName=employeeName;
		this.wagePerHour=wageperhour;
		this.employeeId="E"+Integer.toString(++contractidCounter);
		System.out.println("I am hear recognize:"+this.employeeId);
	}

	double wagePerHour;
	//Implement your code here

	public double getWagePerHour() {
		return wagePerHour;
	}
	public void setWagePerHour(double wagePerHour) {
		this.wagePerHour = wagePerHour;
	}
	
	
	public void calculateSalary(float hoursWorked)
	{
		if(hoursWorked>=190)
		salary=wagePerHour*hoursWorked;
		else {
			double temp=((190-hoursWorked)*(wagePerHour/2));
			salary=wagePerHour*hoursWorked-temp;
			
		}
	}

	//Uncomment the code given below after implementing the class
	//Do not modify the code given below
	/*@Override 
	public String toString() { 
	  	return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName()+", Wage Per Hour: "+getWagePerHour(); 
	}*/
}