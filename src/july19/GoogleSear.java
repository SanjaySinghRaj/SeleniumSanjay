package july19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.javac.util.Context.Key;

public class GoogleSear {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver goog=new ChromeDriver();
		goog.get("https://www.google.com/");
		goog.manage().window().maximize();
		WebElement search = goog.findElement(By.name("q"));
		search.sendKeys("hello",Keys.ENTER);
		
		

	}

}
