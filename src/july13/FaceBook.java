package july13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver fac = new ChromeDriver();
		fac.manage().window().maximize();
		fac.get("https://www.facebook.com/");

	}

}
