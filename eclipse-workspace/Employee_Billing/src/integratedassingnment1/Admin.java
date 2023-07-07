//lex_auth_0130008620764692481835
//do not modify the above line

package integratedassingnment1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Admin {
	public void generateSalarySlip(Employee[] employees,float[] salaryFactor) {
		PermanentEmployee per=null;
		int i=0;
		for(Employee emp:employees)
		{
			if (emp instanceof PermanentEmployee) { 
				per=(PermanentEmployee)emp;
				
			try {
				per.calculateSalary(salaryFactor[i++]);
			} catch (InvalidExperienceException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());}
			}
			else {
				if(emp instanceof ContractEmployee) {
				ContractEmployee ce=(ContractEmployee)emp;
				ce.calculateSalary(salaryFactor[i++]);
				}
			}
		}
		
	}
	public int generateAssetsReport(Employee[] employees,String lastDate)
	{
		int count=0;
		String str[]=lastDate.split("-");
		str[1]=Integer.toString(Resources.getMonth(str[1]));
		String date_rx=String.join("-",str);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
		
		PermanentEmployee per;
		for(Employee emp:employees)
		{
			if(emp instanceof PermanentEmployee) {
			per=(PermanentEmployee) emp;
			Asset[] ash=per.assets;
			for(Asset ash_temp:ash)
			{
				String[] str1=ash_temp.assetExpiry.split("-");
				str1[1]=Integer.toString(Resources.getMonth(str1[1]));
				String date_org=String.join("-",str1);
				Date date1=null;
				try {
					date1 = sdf.parse(date_org);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
				Date date2=null;
				try {
					date2 = sdf.parse(date_rx);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				if(date1.compareTo(date2) > 0)   
				{  
						
				}   
				else if(date1.compareTo(date2) < 0)   
				{  
					count++;
				}   
				else if(date1.compareTo(date2) == 0)   
				{  
						count++;
				}  
			}}}
		return count;
	}
	public String[] generateAssetsReport(Employee[] employees,char assetcategory )
	{
		//System.out.println("This is the asset category:"+assetcategory);
		
		String[] ash_id=new String[10];
		int i=0;
		for(Employee emp:employees)
		{
			if (emp instanceof PermanentEmployee) {
				
			PermanentEmployee per=(PermanentEmployee)emp;
			Asset[] arr= per.assets;
			for(Asset ash:arr)
			{
				//System.out.println(ash.assetId);
				if(ash.assetId.charAt(0)==assetcategory)
				{
					
					ash_id[i++]=ash.assetId;
				}
			}}
		}
		return ash_id;
	}
}