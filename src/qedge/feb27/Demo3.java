package qedge.feb27;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws Throwable {
		// Write a script to verify expected title with actual title
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://google.com");
		Thread.sleep(5000);
		
		String Expected = "facebook";
		
		String Actual = driver.getTitle();
		
		if (Expected.equalsIgnoreCase(Actual)) {
			
			System.out.println("Title is match::"+"Expected   "    +"Actual");
		}
			
			
			else
				
			{
			System.out.println("Title is not match::" +"Expeted   "  +"Actual" );	
				
			}
		
		   driver.quit();
			
		}
		

	}


