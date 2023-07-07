import java.util.regex.Pattern;

import javax.swing.plaf.synth.SynthScrollPaneUI;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
public class RegexDemo {
	
	public static void main(String [] args)
	{
//		String phn="Madhu@2001";
//		String pattern="(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$";
//		
//		Pattern pt=Pattern.compile(pattern);
//		Matcher mt=pt.matcher(phn);
//		
//		
//		boolean result=mt.matches();
//		System.out.println(result);
		
		List<Integer> arr=new ArrayList<>();
		arr.add(05);
		arr.add(10);
		arr.add(15);
		arr.add(20);
		arr.add(25);
		
		System.out.println("Array size is "+arr.size());
		
		for(int n:arr)
		{
			System.out.println(n);
		}
				
	}

}
