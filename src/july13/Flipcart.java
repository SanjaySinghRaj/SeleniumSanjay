package july13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver flip = new ChromeDriver();
		flip.manage().window().maximize();
		flip.get("https://www.flipkart.com/");

	}

}
