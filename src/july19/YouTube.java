package july19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver yout=new ChromeDriver();
		yout.manage().window().maximize();
		yout.get("https://www.youtube.com/");
		Thread.sleep(1000);
		WebElement search = yout.findElement(By.id("search"));
		search.sendKeys("hello",Keys.ENTER);
		//WebElement enter = yout.findElement(By.id("search-icon-legacy"));
		//enter.click();

	}

}
