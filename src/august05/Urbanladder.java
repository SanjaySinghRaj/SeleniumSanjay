package august05;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import july28.DemoScreen;

public class Urbanladder {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver urba = new ChromeDriver();
		urba.manage().window().maximize();
		urba.get("https://www.urbanladder.com/");
		urba.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		urba.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		
		List<WebElement> menus = urba.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions ac=new Actions(urba);
		for (WebElement menu : menus) {
			String man = menu.getText();
			System.out.println(man);
			ac.moveToElement(menu).build().perform();
			DemoScreen.takeSnap(urba, man);
			Thread.sleep(1000);
			
			
		}
		Thread.sleep(2000);
		urba.quit();

	}


}
