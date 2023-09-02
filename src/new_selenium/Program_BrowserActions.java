package new_selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_BrowserActions {
	static WebDriver launchbrowser;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="https://www.cilory.com/";
		String url2="https://www.amazon.com/";
		 launchbrowser= new ChromeDriver();
		 launchbrowser.get(url);
		 System.out.println(launchbrowser.getCurrentUrl());
		 System.out.println(launchbrowser.getTitle());
         launchbrowser.manage().window().minimize();
         launchbrowser.manage().window().maximize();
         launchbrowser.manage().window().fullscreen();
         launchbrowser.navigate().to(url2);
         Thread.sleep(5000);

         launchbrowser.navigate().back();
         Thread.sleep(5000);
         launchbrowser.navigate().forward();
launchbrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

         launchbrowser.navigate().refresh();
         launchbrowser.close();


         

	}

}
