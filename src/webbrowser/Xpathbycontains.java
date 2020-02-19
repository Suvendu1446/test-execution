package webbrowser;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbycontains {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C://GUDU//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("suvendu");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("iamrocky");
	driver.findElement(By.xpath("//input[contains(@data-testid, 'royal_login_button')]")).click();
	

	}

}
