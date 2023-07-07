package com.madhu;

import java.util.ArrayList;
import java.util.List;

public class Singleton {
	
	public static int count;

	private  Singleton() {
		count++;
	}

    private static class SingletonHolder {
        public static final Singleton instance = new Singleton();
        public static final Singleton instance1= new Singleton();
    }

    public static List<Singleton> getInstance() {
    	List<Singleton> str = new ArrayList<>();
    	str.add(SingletonHolder.instance);
    	str.add(SingletonHolder.instance1);
        return str;
    }
  
}
public interface tom{
	
}
