package com.phone;

public class Shop {

	public static void main(String[] args) {
		//phone p = new phone("Andriod", 2, "Qualcomn", 5.5, 3100);
		
		//System.out.println("I am running");
		//System.out.println(p.toString());
		System.out.println("I am running");
		phone phone=new PhoneBuilder().setOS("Android").setBattery(3500).setProcessor("shakthi").getPhone();
		System.out.println(phone.toString());
		
	}

}
