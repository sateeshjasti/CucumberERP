package qedge.mar4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_alerts {

	public static void main(String[] args) throws Throwable {
		// write a scriot to handle alert in primus page
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com");
	    Thread.sleep(5000);
	    
        driver.findElement(By.name("txtuId")).sendKeys("Admin");
        
        driver.findElement(By.name("txtPword")).sendKeys("Admin567");
        
        driver.findElement(By.name("login")).click();
        //get alert text
        String alerttext = driver.switchTo().alert().getText();
        System.out.println(alerttext);
        Thread.sleep(5000);
        //click ok to alert
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        driver.quit();
        
        
        
	}

}
