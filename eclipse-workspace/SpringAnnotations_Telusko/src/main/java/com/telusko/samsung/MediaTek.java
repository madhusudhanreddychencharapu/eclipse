package com.telusko.samsung;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor {

	public void process() {
	
		System.out.println("2nd Best CPU, i am in  the MediaTek");

	}

}
