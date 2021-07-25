package july23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver urba = new ChromeDriver();
		urba.manage().window().maximize();
		urba.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		urba.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		Thread.sleep(2000);
		List<WebElement> menus = urba.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions ac=new Actions(urba);
		for (WebElement menu : menus) {
			System.out.println(menu.getText());
			ac.moveToElement(menu).build().perform();
			Thread.sleep(1000);
			
		}
		Thread.sleep(2000);
		urba.quit();

	}

}
