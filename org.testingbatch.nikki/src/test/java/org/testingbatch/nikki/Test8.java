package org.testingbatch.nikki;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test8 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://brightwonderfulglowinglaugh.neverssl.com/online");
		String x=driver.getCurrentUrl();
		if(x.startsWith("https"))
		{
			System.out.println("Secured site");
		}
		else
		{
			System.out.println("Not secured site");
		}
		driver.close();
			
		}
	}

