package august06;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo02 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver googl = new ChromeDriver();	
		googl.get("https://www.bluestone.com/"); 
		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor)googl;
		/*js.executeScript("window.scrollBy(500,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-200,0)");*/
		js.executeScript("window.scrollTo(document.body.scrollWidth,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(-document.body.scrollWidth,0)");

}}
