package august05;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver authe = new ChromeDriver();
		authe.manage().window().maximize();
		authe.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");//passing username and Password in popup 
		authe.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}

}
