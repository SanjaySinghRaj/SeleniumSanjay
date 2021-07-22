package july20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver acti=new ChromeDriver();
		acti.get("https://demo.actitime.com/login.do");
		acti.manage().window().maximize();
		acti.findElement(By.linkText("Forgot your password?")).click();
		String title = acti.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		acti.close();
		
	}

	
}
