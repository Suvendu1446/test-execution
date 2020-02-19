package webbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C://GUDU//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElements(By.xpath(""));

	}

}
