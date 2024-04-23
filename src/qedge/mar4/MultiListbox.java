package qedge.mar4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiListbox {

	public static void main(String[] args) throws Throwable {

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.get("file:///D:/MultiListboxHtmlpage_lyst.html");
    Thread.sleep(5000);
    
    //Store list box into select class
    
    Select multilistbox = new Select(driver.findElement(By.name("multiSelection")));
    //verify list box is multi or sigle selection
    
    boolean value = multilistbox.isMultiple();
    
   System.out.println(value);
   
   //select 0 to 4 items in list box
   for (int i = 0;i<7;i++) {
	   
	   Thread.sleep(3000);
	   multilistbox.selectByIndex(i);
	  	   
	
}
   //deselect items from selecton
   
   multilistbox.deselectByVisibleText("Yellow");
   
   Thread.sleep(3000);
   multilistbox.deselectByIndex(4);
   
   Thread.sleep(3000);
   multilistbox.deselectAll();
   Thread.sleep(3000);
   driver.quit();
   
	}

}
