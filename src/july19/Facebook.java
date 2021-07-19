package july19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver face=new ChromeDriver();
		face.get("https://www.facebook.com/");
		face.manage().window().maximize();
		WebElement usern = face.findElement(By.name("email"));
		usern.sendKeys("Harichandra Chaudhari");
		WebElement passw = face.findElement(By.name("pass"));
		passw.sendKeys("123456");
		face.findElement(By.name("login")).click();
		Thread.sleep(8000);
		face.close();
	}

}
