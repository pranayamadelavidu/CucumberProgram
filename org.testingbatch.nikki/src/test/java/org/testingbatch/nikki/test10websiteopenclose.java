package org.testingbatch.nikki;

import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test10websiteopenclose {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.operadriver().setup();  // using web driver manager am settinup browserdriversoftware called edge
		OperaDriver driver = new OperaDriver();  // driver is the object
		driver.get("https://www.britishairways.com");  // launch the website
		Thread.sleep(4000); // wait for 9 seconds
		driver.close(); // close the browser
		System.out.println("British airways website successfully opened and closed");


	}

}
