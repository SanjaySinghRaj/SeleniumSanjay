package august03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver cust = new ChromeDriver();
		cust.manage().window().maximize();
		cust.get("file:///D:/java%20programs/selenium/src/file1.html");
		cust.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new WebDriverWait(cust, 10).until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver driver) {
				return cust.findElement(By.xpath("//input[@id='xyz']")).isEnabled();

			}

		});

		cust.findElement(By.xpath("//input[@id='xyz']")).sendKeys("Hello");

	}

}
