package new_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_element {

	static WebDriver launchweb;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url2="https://www.flipkart.com/";
		String otp="registrationNumber";
		String login="_2KpZ6l _2HKlqd _3AWRsL";

		 launchweb= new ChromeDriver();
		 launchweb.get(url2);
		 launchweb.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		 launchweb.manage().window().maximize();
		 try {
		 WebElement rqst_otp=launchweb.findElement(By.name(otp));
		 if(rqst_otp.isDisplayed())
		 {
			 rqst_otp.click();
		 }}
			 catch(Exception e)
			 { System.out.println("button is not visibled");
		 }

			WebElement bag_order=launchweb.findElement(By.className(login));

		 if(bag_order.isEnabled())
		 {
			 bag_order.click();
		 }
			 else
			 { System.out.println("button is not visibled");
		 }

	}

}
