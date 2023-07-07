//lex_auth_0130008620764692481835
//do not modify the above line

package integratedassingnment1;

public class PermanentEmployee extends Employee {
	public PermanentEmployee(String employeename) {
		super(employeename);
		this.employeeId="C"+Integer.toString(++permenantIdCounter);
		System.out.println("I am hear recognize:"+this.employeeId);
	}
	public PermanentEmployee(String employeename, double basicPay, String[] salaryComponenStrings,
			Asset[] assets) {
		super(employeename);
		this.basicPay = basicPay;
		this.salaryComponentStrings = salaryComponenStrings;
		//this.experience = experience;
		this.assets = assets;
		this.employeeId="c"+Integer.toString(++permenantIdCounter);
		System.out.println("I am hear recognize:"+this.employeeId);
	}
	double basicPay;
	String[] salaryComponentStrings;
	float experience;
	Asset[] assets;
	
	
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public String[] getSalaryComponenStrings() {
		return salaryComponentStrings;
	}
	public void setSalaryComponenStrings(String[] salaryComponentStrings) {
		this.salaryComponentStrings = salaryComponentStrings;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	public Asset[] getAssets() {
		return assets;
	}
	public void setAssets(Asset[] assets) {
		this.assets = assets;
	}
	public PermanentEmployee()
	{
	}
	
	
	//Implement your code here
	
	//Uncomment the code given below after implementing the class
	//Do not modify the code given below
	@Override
	public String toString() {
		return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName()+", Basic Pay: "+getBasicPay()+", Salary Components: "+getSalaryComponenStrings()+", Assets: "+getAssets();
	}
	public double calculateBonus(float experience) throws InvalidExperienceException
	{
		if(experience<2.5)
		{
			System.out.println("code execution is coming here");
//			
			throw new InvalidExperienceException("Experience is less than 2.5 years");
		}
		else if(experience>=2.5 && experience<4)
		{
			return 2550;
		}
		else if(experience>=4 && experience<8)
		{
			return 5000;
		}
		else if(experience>=8 && experience<12)
		{
			return 8750;
		}
		else {
			return 13000;
		}
		
	}
	public void calculateSalary(float experince) throws InvalidExperienceException
	{
		double DA=0,HRA=0;
		int i=0;
		int[] arr=new int[2];
		String[] salaryComponenStrings;
		for(String str:salaryComponentStrings) {
			String [] str1=str.split("-");
			 arr[i++]=Integer.parseInt(str1[1]);
			}
		DA=(basicPay*arr[0])/100;
		HRA=(basicPay*arr[1])/100;
		
		salary=basicPay+DA+HRA+this.calculateBonus(experince);
		
	}
	public String[] getAssetsByDate(String Date)
	{
		return salaryComponentStrings;
}
}