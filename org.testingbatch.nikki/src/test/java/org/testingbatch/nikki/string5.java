package org.testingbatch.nikki;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class string5 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String x= driver.getWindowHandle();
		System.out.println(x);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		Set<String> s = driver.getWindowHandles();
		System.out.println(s);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(7000);
		Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		driver.close();
		
				
		
				

	}

}
