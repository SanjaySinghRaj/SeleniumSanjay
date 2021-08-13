package TestPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.BlueStoneHome;

public class Bluestone5gm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver blue = new ChromeDriver();
		blue.manage().window().maximize();
		blue.get("https://www.bluestone.com/");
		blue.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BlueStoneHome bs = new BlueStoneHome(blue);
		bs.coinHover(blue);
		bs.gms5Click();
		System.out.println(bs.getVTitle());
		blue.quit();

	}
}
