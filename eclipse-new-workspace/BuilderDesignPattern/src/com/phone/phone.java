package com.phone;

public class phone {
	private String OS;
	private int ram;
	private String processor;
	private double ScreenSize;
	private int battery;
	public phone(String oS, int ram, String processor, double screenSize, int battery) {
		//super();
		OS = oS;
		this.ram = ram;
		this.processor = processor;
		ScreenSize = screenSize;
		this.battery = battery;
	}
	public static PhoneBuilder phoneBuilder()
	{
		return new PhoneBuilder();
	}
	@Override
	public String toString() {
		System.out.println("this objext"+this);
		return "phone [OS=" + OS + ", ram=" + ram + ", processor=" + processor + ", ScreenSize=" + ScreenSize
				+ ", battery=" + battery + "]";
	}
	

}
