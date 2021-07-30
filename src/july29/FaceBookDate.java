package july29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FaceBookDate {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver demo = new ChromeDriver();
		demo.manage().window().maximize();
		demo.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		 demo.findElement(By.xpath("//a[text()='Create New Account']")).click();
		 Thread.sleep(2000);
		WebElement day = demo.findElement(By.xpath("//select[@aria-label='Day']"));
		Select s1 = new Select(day);
		s1.selectByValue("14");
		 WebElement month = demo.findElement(By.xpath("//select[@aria-label='Month']"));
		 Select s2 = new Select(month);
		 s2.selectByValue("11");
		 WebElement year = demo.findElement(By.xpath("//select[@aria-label='Year']"));
		 Select s3 = new Select(year);
		 s3.selectByVisibleText("1994");

	}

}
/*
//select[@aria-label='Day']/option[@value='14']
//select[@aria-label='Month']/option[@value='11']
//select[@aria-label='Year']/option[@value='1994']
 
 
*/