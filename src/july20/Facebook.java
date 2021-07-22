package july20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver face=new ChromeDriver();
		face.manage().window().maximize();
		face.get("https://www.facebook.com/");
		face.findElement(By.partialLinkText("पासवर्ड")).click();
		String title = face.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		face.close();
		
	}

}
