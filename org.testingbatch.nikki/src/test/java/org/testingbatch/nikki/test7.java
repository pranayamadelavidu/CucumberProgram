package org.testingbatch.nikki;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test7 {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.gmail.com");
	Thread.sleep(6000);
	WebElement e=driver.findElement(By.name("identifier"));
	e.sendKeys("AutomationTesting");
	Thread.sleep(4000);
	e.clear();
	

	}

}
