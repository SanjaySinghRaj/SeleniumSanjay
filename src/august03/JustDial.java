package august03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JustDial {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver just = new ChromeDriver(co);
		just.manage().window().maximize();
		just.get("https://www.justdial.com/");
		just.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
