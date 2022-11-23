package org.testingbatch.nikki;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class select6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement b=driver.findElement(By.name("url"));
		Select s=new Select(b);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByVisibleText("Furniture");
		Thread.sleep(60000);
		s.selectByValue("search-alias-mobile-apps"
				+ "");
		Thread.sleep(6000);
		driver.close();
		s.deselectByValue("search-alias=stripbooks");
		Thread.sleep(6000);
		driver.close();
		
		

	}

}
