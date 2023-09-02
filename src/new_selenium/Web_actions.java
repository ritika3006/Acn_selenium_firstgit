package new_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_actions {
	static WebDriver launchweb;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url2="https://www.cilory.com/";
		String searchbox="search";
		 launchweb= new ChromeDriver();
		 launchweb.get(url2);
		 launchweb.manage().window().maximize();
		 launchweb.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		 
		 WebElement search_actions=launchweb.findElement(By.id(searchbox));
		 search_actions.sendKeys("Tunics for women");
		 search_actions.sendKeys(Keys.ENTER);
		 System.out.println(" item searched");
		

	}

}
