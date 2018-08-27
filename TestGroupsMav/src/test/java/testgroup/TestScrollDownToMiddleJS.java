package testgroup;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestScrollDownToMiddleJS {
	@Test
	public void ScrollDown() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vinod%20J/Desktop/Selenium/HTML%20Files/Test6.html");
		RemoteWebDriver r =(RemoteWebDriver)driver;
		WebElement t1= driver.findElement(By.id("t1"));
		 Point p= t1.getLocation();
		int y= p.getY();
		String c="window.scrollTo(0,"+y+")"; //window.scrollTo(x,y)
		Thread.sleep(2000);
		r.executeScript(c);
	}
}
