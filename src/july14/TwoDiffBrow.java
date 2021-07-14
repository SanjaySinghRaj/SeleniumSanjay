package july14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoDiffBrow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver nauk=new ChromeDriver();
		nauk.manage().window().maximize();
		nauk.get("https://www.google.com/");
		String title = nauk.getTitle();
		System.out.println(title);
		System.out.println(nauk.getCurrentUrl());
		nauk.get("https://www.facebook.com/");
		
		String title1 = nauk.getTitle();
		System.out.println(title1);
		System.out.println(nauk.getCurrentUrl());
		nauk.navigate().back();
		Thread.sleep(2000);
		nauk.navigate().forward();
		Thread.sleep(2000);
		nauk.navigate().refresh();
		Thread.sleep(2000);
		nauk.close();
		

	}

}
