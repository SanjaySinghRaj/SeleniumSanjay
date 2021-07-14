package july14;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver nauk = new ChromeDriver();
		nauk.manage().window().maximize();
		nauk.get("https://www.naukri.com/");
		String title=nauk.getTitle();
		System.out.println(title);
		System.out.println(nauk.getCurrentUrl());
		Thread.sleep(2000);
		Set<String> wind = nauk.getWindowHandles();//Set<String> sortcut ctrl+1
		for (String id : wind) {
			System.out.println(id);
			nauk.switchTo().window(id);
			Thread.sleep(2000);
			nauk.close();
			
		}
		//nauk.close();



	}

}
