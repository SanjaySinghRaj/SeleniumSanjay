package july30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookMonth {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver demo = new ChromeDriver();
		demo.manage().window().maximize();
		demo.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		 demo.findElement(By.xpath("//a[text()='Create New Account']")).click();
		 Thread.sleep(2000);
		
		 WebElement month = demo.findElement(By.xpath("//select[@aria-label='Month']"));
		 Select s1 = new Select(month);
		 s1.selectByValue("11");
		 List<WebElement> mont = s1.getOptions();
		 for (WebElement mon : mont) {
			System.out.println(mon.getText());
		}
}
}
