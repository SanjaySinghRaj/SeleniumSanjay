package july28;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleisDisplayed {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver demo = new ChromeDriver();
		demo.manage().window().maximize();
		demo.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement goog = demo.findElement(By.xpath("//input[@name='q']"));
		Thread.sleep(1000);
		System.out.println(goog.isDisplayed());
		System.out.println(goog.isEnabled());
		goog.sendKeys("hello",Keys.ENTER);

}
}
