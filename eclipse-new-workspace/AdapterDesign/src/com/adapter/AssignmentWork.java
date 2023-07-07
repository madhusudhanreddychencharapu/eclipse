package com.adapter;


public class AssignmentWork {
	private Pen p;
	public Pen getPen(){
		return p;
	}
	public void setPen(Pen p) {
		this.p=p;
	}
	public void writeAssignment(String str) {
		p.write(str);
		
	}

}
