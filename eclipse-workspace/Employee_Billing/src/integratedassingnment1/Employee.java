package integratedassingnment1;
//lex_auth_0130008620764692481835
//do not modify the above line

//package integratedassignment1;

abstract public class Employee {
	
	String employeeId;
	String employeeName;
	double salary;
	static int contractidCounter;
	static int permenantIdCounter;
	static {
		contractidCounter=10000;
		permenantIdCounter=10000;
	}
	public Employee()
	{
		
	}
	public Employee(String employeename)
	{
		this.employeeName=employeename;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeid(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		if(employeeName.contains(" "))
		{
			String str1=employeeName.substring(0,employeeName.indexOf(" "));
			String str2=employeeName.substring(employeeName.indexOf("")+1,employeeName.length());
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			if(str1.length()==2 && str2.length()==2)
			{
				if(ch1[0]>=65 &&ch1[0]<92)
				{
					if(ch2[0]>=65 &&ch2[0]<92)
					{
						this.employeeName = employeeName;
					}
					}
				}
			}
		}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static int getContractidCounter() {
		return contractidCounter;
	}
	public static void setContractidCounter(int contractidCounter) {
		Employee.contractidCounter = contractidCounter;
	}
	public int getPermenantIdCounter() {
		return permenantIdCounter;
	}
	public void setPermenantIdCounter(int permenantIdCounter) {
		this.permenantIdCounter = permenantIdCounter;
	}
	
	abstract void calculateSalary() throws InvalidExperienceException;
	
	//Implement your code here
	
	//Uncomment the code given below after implementing the class
	//Do not modify the code given below
	/*@Override
	public String toString() {
		return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName();
	}*/
}