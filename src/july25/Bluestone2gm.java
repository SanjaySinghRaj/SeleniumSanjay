package july25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone2gm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver blue = new ChromeDriver();
		blue.manage().window().maximize();
		blue.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		Actions ac= new Actions(blue);
		WebElement coin = blue.findElement(By.xpath("//a[@title='Coins']"));
		ac.moveToElement(coin).build().perform();
		Thread.sleep(2000);
		blue.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-2gms,m']")).click();
		Thread.sleep(2000);
		String title = blue.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		blue.quit();		

	}

}
