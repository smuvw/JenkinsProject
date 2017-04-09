package com.learnautomationselenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoMaven {
	
	@Test
	public void Login(){
		
		System.out.println("Welcone to MAVEN ");
		System.out.println(10/0);
		System.out.println("Welcone to java ");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}

}
