package qedge.mar11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions {

	public static void main(String[] args) throws Throwable {
           
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		
		//Create object for actions class
		
		Actions ac = new Actions(driver);
		//mouse to create account and click
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Create account']")));
		ac.click().perform();
		Thread.sleep(3000);
		
		//Click up arrow for three times
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(3000);
	    
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(3000);
		
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(3000);
		
		//Click enter key
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
