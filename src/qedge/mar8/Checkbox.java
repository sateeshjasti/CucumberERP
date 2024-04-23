package qedge.mar8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws Throwable {
		// 
		


		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/checkbox_list.html");
		Thread.sleep(5000);
		
		//Get collection of all checkboxes
		
		List<WebElement> all_checkbox = driver.findElements(By.xpath("//*[@type='checkbox']"));
		
	   System.out.println("No of checkboxes are::"  +all_checkbox.size());
	   
	   for (WebElement each : all_checkbox) {
		   
		 //verify each check box is true or false
		   
		   boolean value = each.isSelected();
		   
		   //Get each box name and print
		   
		   String checkboxname = each.getAttribute("value");
				   
		  System.out.println(checkboxname+"============="+value);
		  
			//if check box already selected uncheck it if not selected check it
			Thread.sleep(5000);
			each.click();
			
		}
		Thread.sleep(5000);
		driver.quit();
		
	}
		
		

	}


