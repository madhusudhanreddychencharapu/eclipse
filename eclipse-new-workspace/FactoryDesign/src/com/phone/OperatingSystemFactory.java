package com.phone;

public class OperatingSystemFactory {
	public OS getInstance(String str)
	{
		if(str.equals("secure")){
			return new IOS();}
		else if (str.equals("powerful")){
			return new Android();
		}
		else if (str.equals("oldest")) {
			return new Symbian();
		}
		else {
			return new Windows();
		}
	}

}
