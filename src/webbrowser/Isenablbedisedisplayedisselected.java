package webbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenablbedisedisplayedisselected {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C://GUDU//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement female=driver.findElement(By.id("u_0_6"));
		
		System.out.println(female.isDisplayed());
		System.out.println(female.isEnabled());
		System.out.println(female.isSelected());



	}

}
