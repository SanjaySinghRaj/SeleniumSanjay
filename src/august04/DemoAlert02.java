package august04;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoAlert02 {
   public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver demoa = new ChromeDriver();
		demoa.manage().window().maximize();
		demoa.get("https://demoqa.com/alerts");
		demoa.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		demoa.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		WebDriverWait ww = new WebDriverWait(demoa, 10);
		ww.until(ExpectedConditions.alertIsPresent());
		Alert a = demoa.switchTo().alert();
		a.accept();
		Thread.sleep(2000);
		demoa.close();
}
}
