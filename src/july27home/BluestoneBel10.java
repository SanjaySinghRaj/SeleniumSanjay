package july27home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneBel10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver blue = new ChromeDriver();
		blue.manage().window().maximize();
		blue.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		blue.findElement(By.xpath("//input[@name='search_query']")).sendKeys("RINGS",Keys.ENTER);
		Thread.sleep(1500);
		Actions ac = new Actions(blue);
		WebElement price = blue.findElement(By.xpath("//span[text()='Price']"));
		ac.moveToElement(price).build().perform();
		Thread.sleep(1500);
		WebElement count = blue.findElement(By.xpath("//span[@data-displayname='below rs 10000']/descendant::span[@class='items-count']"));
		Thread.sleep(1500);
		System.out.println("Total Number Below Rs 10000 "+count.getText());
		Thread.sleep(1500);
		blue.close();
}
}
/*
search  //input[@name='search_query'] 
price //span[text()='Price']
belo 10 //span[@data-displayname='below rs 10000']/descendant::span[@class='items-count']
 
*/