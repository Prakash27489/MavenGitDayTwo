package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mailt\\SeleniumMaven\\MavenOne\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("java");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("sele");
		WebElement btnclick = driver.findElement(By.xpath("//input[@value='Log In']"));
		btnclick.click();
		//driver.quit();
	}
}
