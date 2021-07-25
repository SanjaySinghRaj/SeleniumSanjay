package july23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver blue=new ChromeDriver();
		blue.manage().window().maximize();
		blue.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		List<WebElement> menus = blue.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		Actions ac=new Actions(blue);
		for (WebElement menu : menus) {
			System.out.println(menu.getText());
			ac.moveToElement(menu).build().perform();
			Thread.sleep(1000);
			
		}
		Thread.sleep(2000);
		blue.quit();
		

	}

}
