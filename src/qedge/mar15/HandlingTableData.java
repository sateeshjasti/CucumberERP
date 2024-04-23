package qedge.mar15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingTableData {

	public static void main(String[] args) throws Throwable {
	   // Write a script to select Date in Orange HRM
    
		String doj ="2024-Feb-28";
		String temp[]=doj.split("-");
		String date =temp[2];
		String month =temp[1];
		String year =temp[0];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
		driver.findElement(By.xpath("//li[1]//img[1]")).click();
		Thread.sleep(5000);
		//select year from calender
		 new Select(driver.findElement(By.className("ui-datepicker-year"))).selectByVisibleText(year);
		 Thread.sleep(5000);
		 new Select(driver.findElement(By.className("ui-datepicker-month"))).selectByVisibleText(month);
		 WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		 List<WebElement> rows,cols;
		 rows = webtable.findElements(By.tagName("tr"));
		 for (WebElement eachrow : rows) {
			 cols = eachrow.findElements(By.tagName("td"));
			 for (WebElement eachcell : cols) {
				if(eachcell.getText().equals(date))
				{
					Thread.sleep(5000);
					eachcell.click();
				}
			}
			 
		 }
		 
	}
	
}
		

			 
			
	
	
	
	
     
		
		

	
