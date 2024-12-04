package com.adivaclm.Generic;

import java.util.Set;

public class WebdriverUtils extends BaseClass{
	
	public void lookup() {
		
		String wh = driver.getWindowHandle();
		Set<String> whs = driver.getWindowHandles();
		for(String s1 : whs)
		{
			driver.switchTo().window(s1);
		}
	}

}
