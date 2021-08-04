package august04;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeAbout {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver acti=new ChromeDriver();
		acti.get("https://demo.actitime.com/login.do");
		acti.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		acti.manage().window().maximize();
		WebElement usern = acti.findElement(By.xpath("//input[@placeholder='Username']"));
		usern.sendKeys("admin");
		WebElement passw = acti.findElement(By.xpath("//input[@placeholder='Password']"));
		passw.sendKeys("manager");
		WebElement logi = acti.findElement(By.id("loginButton"));
		logi.click();
		acti.findElement(By.xpath("//div[@onclick='openHelpAndSupportMenu(event)']")).click();
		acti.findElement(By.xpath("//a[.='About your actiTIME']")).click();
		WebElement about = acti.findElement(By.xpath("//span[@class='productVersion']"));
		System.out.println(about.getText());
		Thread.sleep(2000);
		acti.close();
		
	}
}
/*
?  //div[@onclick='openHelpAndSupportMenu(event)']
about //a[.='About your actiTIME']
//span[@class='productVersion']
 
 */

