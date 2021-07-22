package july19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver inst=new ChromeDriver();
		inst.manage().window().maximize();
		inst.get("https://www.instagram.com/");	
		Thread.sleep(2000);
		WebElement user = inst.findElement(By.name("username"));
		user.sendKeys("hellohappy");
		WebElement pass = inst.findElement(By.name("password"));
		pass.sendKeys("12345678",Keys.ENTER);
	}

}
