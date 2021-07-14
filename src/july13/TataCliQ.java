package july13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TataCliQ {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver tata = new ChromeDriver();
		tata.manage().window().maximize();
		tata.get("https://www.tatacliq.com/");

	}

}
