package webbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver", "C://GUDU//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Desktop/Html/class.html");
		WebElement Listbox=driver.findElement(By.xpath("//select[@name='country']"));
		Select sel=new Select(Listbox);
		//sel.selectByVisibleText("australia");
		//sel.selectByValue("Usd");
		//sel.selectByIndex(3);
		sel.deselectByVisibleText("australia");
		//sel.selectByIndex(5);
				
		
		
		
		

	}

}
