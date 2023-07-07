package com.madhu;

import com.phone.*;

public class FactoryMain {

	public static void main(String[] args) {
		OperatingSystemFactory osf=new OperatingSystemFactory();
		OS obj=osf.getInstance("oldest");
		obj.spec();
	}

}
