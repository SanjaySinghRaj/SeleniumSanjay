package july13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver ama = new ChromeDriver();
		ama.manage().window().maximize();
		ama.get("https://www.amazon.in/");

	}

}
