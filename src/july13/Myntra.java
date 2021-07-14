package july13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver myn = new ChromeDriver();
		myn.manage().window().maximize();
		myn.get("https://www.myntra.com/");
	}

}
