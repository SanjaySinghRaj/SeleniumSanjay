package july14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver tata = new ChromeDriver();
		tata.manage().window().maximize();
		/*tata.get("https://www.tatacliq.com/");
		tata.get("https://www.google.com/");
		tata.navigate().back();
		Thread.sleep(2000);
		tata.navigate().forward();
		Thread.sleep(2000);
		tata.navigate().refresh();*/
		tata.get("https://www.youtube.com/");
		tata.findElement(By.id("search")).sendKeys("Hello");
		tata.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(1500);
		tata.findElement(By.id("img")).click();
		
	}

}
