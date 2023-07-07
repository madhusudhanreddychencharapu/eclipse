package General_Practice;
import java.util.HashMap;

public class hashmap_practice {

	public static void main(String[] args) {
		HashMap<Integer, String> hp =new HashMap<>();
		
		hp.put(1, "madhu");
		hp.put(2,"sai");
		hp.put(2, "yasf");
		
		System.out.println(hp);
		if(hp.containsKey(1))
		{
			String str=hp.get(1);
			System.out.println(str);
		}

	}

}
