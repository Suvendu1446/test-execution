package webbrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Withoutclickmethod {

	public static void main(String[] args) 
	
	
	{
		System.setProperty("webdriver.chrome.driver", "C://GUDU//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement un= driver.findElement(By.id("email"));
		un.sendKeys("suvendu");
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("12345");
		WebElement li=driver.findElement(By.xpath("//input[@type='submit']"));
		li.sendKeys(Keys.ENTER);
		
		

	}

}
