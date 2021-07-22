package july22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urbanladder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver urba = new ChromeDriver();
		urba.manage().window().maximize();
		urba.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		urba.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		Thread.sleep(2000);
		urba.findElement(By.xpath("//a[@href='../../furniture-stores?src=header']")).click();
		Thread.sleep(2000);
		List<WebElement> stores = urba.findElements(By.xpath("//h3[@class='_3JJeW']"));
		for (WebElement store : stores) {
			System.out.println(store.getText());

		}
		Thread.sleep(3000);
		urba.quit();

	}

}
/*
 * stores //a[@href='../../furniture-stores?src=header'] stores
 * //h3[@class='_3JJeW']
 * 
 */