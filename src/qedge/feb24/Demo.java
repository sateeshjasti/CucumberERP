package qedge.feb24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {

          //Object instance of Chrome
		
	WebDriver driver  = new ChromeDriver();
	
	//driver.get("https://chrome.com");
	driver.get("http://Yahoo.com");
	
	driver.manage().window().maximize();
	//driver.close();
	
	  //Object instance of firefox
	
	//WebDriver dr = new FirefoxDriver();
	
	//dr.get("http://Firefox.com");
	
	
	}

}
