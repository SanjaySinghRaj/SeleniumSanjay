package august04;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver demoa = new ChromeDriver();
		demoa.manage().window().maximize();
		demoa.get("https://demoqa.com/alerts");
		demoa.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*demoa.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);
		Alert a = demoa.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		demoa.close();*/
		/*demoa.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(2000);
		Alert a = demoa.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		WebElement can = demoa.findElement(By.xpath("//span[@id='confirmResult']"));
		System.out.println(can.getText());*/
		demoa.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(2000);
		Alert a = demoa.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys("hello");
		a.accept();
		WebElement res = demoa.findElement(By.xpath("//span[@id='promptResult']"));
		System.out.println(res.getText());
		Thread.sleep(2000);
		demoa.close();

	}

}
