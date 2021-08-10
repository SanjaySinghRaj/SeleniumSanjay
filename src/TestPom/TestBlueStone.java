package TestPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.BlueStone;

public class TestBlueStone {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver blue = new ChromeDriver();
		blue.manage().window().maximize();
		blue.get("https://www.bluestone.com/");
		blue.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BlueStone bs = new BlueStone(blue);
		bs.ringHover(blue);
		bs.diamondClick();
		bs.fRingClick();
		bs.switchTab(blue);
		bs.buyNowClick();
		System.out.println(bs.fetchErrT());

	}

}
