package qedge.feb26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		// Write a script to print title and URL along with length for firefox
		
		//Create Instance object
		
		WebDriver driver = new FirefoxDriver();

		driver.get("http:/tatacliq.com");
		Thread.sleep(5000);
		
		//Print title and length of title
		
		String pagetitle = driver.getTitle();
		
		
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		
		
		//Print URL and length of URL
		
		String Strurl = driver.getCurrentUrl();
		
		System.out.println(Strurl);
		System.out.println(Strurl.length());
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
