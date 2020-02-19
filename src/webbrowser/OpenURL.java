package webbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {
	static
	{
		System.setProperty("webdriver.chrome.driver","C://GUDU//chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		
		
		
		driver.navigate().back();
		
		
		
		//driver.close();
		
			
		

	}

}
