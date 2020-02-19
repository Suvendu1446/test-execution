package webbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Classlocator {
@Test()
	public void main(String[] args) 
	
	
	{
		System.setProperty("webdriver.chrome.driver","C://GUDU//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.className("inputtext")).sendKeys("suvendu.com@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Suv@1446");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		

	}

}
