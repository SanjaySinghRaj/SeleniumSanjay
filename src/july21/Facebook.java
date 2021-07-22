package july21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver face=new ChromeDriver();
		face.manage().window().maximize();
		face.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		face.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("hellohibolo");
		face.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123654789");
		face.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
		Thread.sleep(2000);
		String title = face.getTitle();
		
		System.out.println(title);
	}

}
