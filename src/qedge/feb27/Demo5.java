package qedge.feb27;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws Throwable {
		// Create instance object
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://orangehrm.qedgetech.com");
		
		Thread.sleep(5000);
		//Store username text box into web element
		
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		
		// Clear text in user name test box
		
		username.clear();
		username.sendKeys("Admin3");
		
		//Capture username value
		
		String element = username.getAttribute("value");
		
		//Store password text box into web element
		
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		
		
		// Clear text in password test box
		
		password.clear();
		//send password
		password.sendKeys("Qedge123!@#");
		
		//Capture password value
		
		String element1 = password.getAttribute("value");
		
		System.out.println(element+"     "+element1);
		
		
		//Click login button
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(5000);
		
		String Expected = "Dashboard";
	    String Actual = driver.getCurrentUrl();
	    
	    if (Actual.contains(Expected));
	    
	    {
	    	
		System.out.println("valid username & password::"+Expected+"   "+Actual);
		
	    }
	  
	    //else
	    	
	
	    {
	  
			//Capture error message
			
			String Error_messsage = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
	    
	       System.out.println(Error_messsage+"    "+Expected+"  " +Actual);
	       
	}
	
	driver.quit();
	
}
	
}
	    

	

		
	
	    	
	    
	
	
	
	
	
	


