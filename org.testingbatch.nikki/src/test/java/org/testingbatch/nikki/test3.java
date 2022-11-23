package org.testingbatch.nikki;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver d= new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		Thread.sleep(4000);
		d.manage().window().minimize();
		Thread.sleep(3000);
		d.manage().window().maximize();
		

	}

}
