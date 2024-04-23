package qedge.feb27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws Throwable {
		
		//Write a script to capture Gmail link and gmail URL in google page
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
        Thread.sleep(5000);
        
        //Capture gmail text in google page
        
        String gmailtext = driver.findElement(By.linkText("Gmail")).getText();
        
        System.out.println(gmailtext);
        
       
        
        //Capture gmail link URL
        
        String gmailUrl = driver.findElement(By.linkText("Gmail")).getAttribute("href");
        
        System.out.println(gmailUrl);
        
        driver.quit();
        
        
	}

}
