package webbrowser;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listwebelements {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C://GUDU//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/Html/notepad/webelelement.html");
		//  List<WebElement> link = driver.findElements(By.xpath("//a"));
		// System.out.println(link.size());
		 //link.get(1).click();
		// System.out.println(link.get(1).getText());
		 List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		 //System.out.println(checkbox.size());
		 checkbox.get(0).click();
		 System.out.println(checkbox.get(0 ).getText());
		 
		
		

	}

}
