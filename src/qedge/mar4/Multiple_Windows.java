package qedge.mar4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Windows {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		
		//Get gmail window id
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		//Click three links
		
	
		
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		
		//get collection of all three window ids
		
		Set <String> allwins  = driver.getWindowHandles();
		System.out.println(allwins);
		
		for (String each : allwins) {
			
			//parent id should not equal to child id's
			
			if (!parent.equals(each)) {
				
				String pagetitle = driver.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				
				Thread.sleep(5000);
				driver.close();
				
			}
			
			//Switch to parent
			
			driver.switchTo().window(parent);
			
	
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
			
		  driver.findElement(By.name("identifier")).sendKeys("jastisateesh");
		  Thread.sleep(5000);
		  driver.quit();
			
			
			
		}
		
		

	}

}
