package testgroup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JStypeJSclick {
@Test
public void testGoogle()
{
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
WebElement srchTxtBx=driver.findElement(By.name("q"));
((JavascriptExecutor)driver).executeScript("arguments[0].value ='"+"Selenium"+"'", srchTxtBx);
WebElement srchBtn = driver.findElement(By.name("btnK"));
((JavascriptExecutor)driver).executeScript("arguments[0].click()", srchBtn);
driver.close();
}

}
