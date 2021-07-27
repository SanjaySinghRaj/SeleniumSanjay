package july27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver demo = new ChromeDriver();
		demo.manage().window().maximize();
		demo.get("http://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement right = demo.findElement(By.xpath("//span[.='right click me']"));
		//WebElement ele = demo.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act = new Actions(demo);
		//act.doubleClick(ele).perform();
		act.contextClick(right).perform();

	}

}
