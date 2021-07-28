package july27home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneMP {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver blue = new ChromeDriver();
		blue.manage().window().maximize();
		blue.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		blue.findElement(By.xpath("//input[@name='search_query']")).sendKeys("RINGS",Keys.ENTER);
		Thread.sleep(1500);
		Actions ac = new Actions(blue);
		WebElement metal = blue.findElement(By.xpath("//span[text()='Metal']"));
		ac.moveToElement(metal).build().perform();
		Thread.sleep(1500);
		WebElement count = blue.findElement(By.xpath("//span[@data-displayname='platinum']/descendant::span[@class='items-count']"));
		Thread.sleep(1500);
		System.out.println("Total Platinum  "+count.getText());
		Thread.sleep(1500);
		blue.close();

}
}
/*
Metal //span[text()='Metal']
platinum //span[@data-displayname='platinum']/descendant::span[@class='items-count']
*/