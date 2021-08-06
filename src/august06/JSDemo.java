package august06;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver googl = new ChromeDriver();
		googl.manage().window().maximize();
		googl.get("https://www.google.com/"); 
		googl.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		googl.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)googl;
		/*js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");*/
		WebElement java = googl.findElement(By.xpath("//h3[.='Java Tutorial | Learn Java Programming - javatpoint']"));
		js.executeScript("arguments[0].scrollIntoView()", java);

	}

}
