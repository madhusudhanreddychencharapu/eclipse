package com.adapter;

import com.madhu.PilotPen;

public class PenAdapter implements Pen{

	PilotPen pp=new PilotPen();
	@Override
	public void write(String str) {
		pp.mark(str);
		
	}
	
//	
//
//	public void write(String str) {
//		
//		pp.mark(str);
//	}


}
