package org.git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Git {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\FIRSTGIT\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("satham4all@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("nagercoil");
				
	}

	}
			




