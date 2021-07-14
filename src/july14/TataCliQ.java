package july14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TataCliQ {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver tata = new ChromeDriver();
		tata.manage().window().maximize();
		tata.get("https://www.tatacliq.com/");
		String title=tata.getTitle();
		System.out.println(title);
		System.out.println(tata.getCurrentUrl());
		Thread.sleep(2000);
		//tata.close();
		
		tata.quit();
	}
	
}
