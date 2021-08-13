package august12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Bluestone {
	WebDriver blue;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		blue = new ChromeDriver();
		blue.manage().window().maximize();
		blue.get("https://www.bluestone.com/");
		blue.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		Actions ac= new Actions(blue);
		WebElement coin = blue.findElement(By.xpath("//a[@title='Coins']"));
		ac.moveToElement(coin).build().perform();
		Reporter.log("BeforeMethod", true);
	}
	@AfterMethod
	public void close() {
		String title = blue.getTitle();
		System.out.println(title);
		Reporter.log("AfterMethod", true);
		blue.quit();	
	}
	@Test
	public void sc01() {
		blue.findElement(By.xpath("//span[@data-p='gold-coins-weight-20gms,m']")).click();
		Reporter.log("sc01", true);
	}
	@Test
	public void sc02() {
		blue.findElement(By.xpath("//span[@data-p='gold-coins-weight-50gms,m']")).click();
		Reporter.log("sc02", true);
	}
	@Test
	public void sc03() {
		blue.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-2gms,m']")).click();
		Reporter.log("sc03", true);
	}
	@Test
	public void sc04() {
		blue.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-5gms,m']")).click();
		Reporter.log("sc04", true);
	}
	@Test
	public void sc05() {
		blue.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-10gms,m']")).click();
		Reporter.log("sc05", true);
	}

}
