package integratedassingnment1;

public class Methodoveriding {
	public static void main(String [] args) {
		int mon=3;
		String newStr;
		String str=new String("2022-MAR-15");
		String[] str1=str.split("-");
		str1[1]=Integer.toString(mon);
		System.out.println(str1[1]);
		newStr=String.join("-",str1);
		System.out.println(newStr);
;	
}
}
