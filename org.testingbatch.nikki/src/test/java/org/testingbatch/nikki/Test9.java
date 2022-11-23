package org.testingbatch.nikki;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test9 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/index.php");
		 WebElement e1=driver.findElement(By.id("Username"));
	        e1.sendKeys("pranaya111@gmail.com");
	        Thread.sleep(2000);
	        WebElement e=driver.findElement(By.name("password"));
	        e.sendKeys("Baakybaby88");
	        Thread.sleep(7000);
	        WebElement e2=driver.findElement(By.name("login"));
	        driver.close();
		
		

	}

}
