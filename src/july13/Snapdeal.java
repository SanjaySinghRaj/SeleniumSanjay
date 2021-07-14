package july13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver sna = new ChromeDriver();
		sna.manage().window().maximize();
		sna.get("https://www.snapdeal.com/");

	}

}
