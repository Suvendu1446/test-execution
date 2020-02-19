package webbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktectlocator {

	public static void main(String[] args) 
	
	{
System.setProperty("webdriver.chrome.driver","C://GUDU//chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgotten account?")).click();
		

	}

}
