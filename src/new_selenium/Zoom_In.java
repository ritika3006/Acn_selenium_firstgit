package new_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoom_In {
	static WebDriver launchweb;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url2="https://www.amazon.com/";
		
		 launchweb= new ChromeDriver();
		 launchweb.get(url2);
WebElement firsttag= launchweb.findElement(By.tagName("html"));
launchweb.manage().window().maximize();

   Thread.sleep(5000);

  firsttag.sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD));
  System.out.println("Print");
  firsttag.sendKeys(Keys.chord(Keys.CONTROL, "P"));   
  Thread.sleep(7000);
 
   System.out.println("Find");


 firsttag.sendKeys(Keys.chord(Keys.CONTROL, "f"));   
 Thread.sleep(7000);
 
  
  
	}

}
