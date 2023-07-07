package com.madhu.circulardependancydemo;

public class ClassA {
	
	private ClassB B;

	public ClassB getB() {
		return B;
	}

	@Autowired
	public void setB(ClassB b) {
		B = b;
	}
	
	
	

}
