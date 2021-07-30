package july29;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleToJavaRobot {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver demo = new ChromeDriver();
		demo.manage().window().maximize();
		demo.get("https://www.google.com/");
		Thread.sleep(2000);
		demo.findElement(By.xpath("//input[@name='q']")).sendKeys("java",Keys.ENTER);
		Thread.sleep(1500);
		String title = demo.getTitle();
		System.out.println(title);
		Actions ac = new Actions(demo);
		WebElement java = demo.findElement(By.xpath("//span[text()='Java']"));
		ac.doubleClick(java).build().perform();
		Robot rc= new Robot();
		rc.keyPress(KeyEvent.VK_CONTROL);
		rc.keyPress(KeyEvent.VK_C);
		Thread.sleep(1500);
		rc.keyPress(KeyEvent.VK_T);
		Thread.sleep(1500);
		rc.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_CONTROL);
		rc.keyRelease(KeyEvent.VK_C);
		rc.keyRelease(KeyEvent.VK_T);
		rc.keyRelease(KeyEvent.VK_V);
		rc.keyRelease(KeyEvent.VK_ENTER);
		String title1 = demo.getTitle();
		System.out.println(title1);
		Thread.sleep(5000);
		demo.quit();
		
		
		

	}

}
/*
java //span[text()='Java']
*/