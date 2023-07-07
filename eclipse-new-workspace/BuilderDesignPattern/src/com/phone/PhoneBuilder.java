package com.phone;

public class PhoneBuilder {
	private String OS;
	private int ram;
	private String processor;
	private double ScreenSize;
	private int battery;
	
	public PhoneBuilder setOS(String oS) {
		this.OS = oS;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder  setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.ScreenSize = screenSize;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}

	public phone getPhone()
	{
		return new phone(OS, ram, processor, ScreenSize, battery);
	}
}
