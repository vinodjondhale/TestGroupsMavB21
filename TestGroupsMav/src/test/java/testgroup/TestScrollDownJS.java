package testgroup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestScrollDownJS {
@Test
public void ScrollDown() 
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Vinod%20J/Desktop/Selenium/HTML%20Files/Test6.html");
	RemoteWebDriver r =(RemoteWebDriver)driver;
	String c="window.scrollTo(0,document.body.scrollHeight)"; //window.scrollTo(x,y)
	r.executeScript(c);
}
}
