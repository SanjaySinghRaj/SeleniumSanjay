package july26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver urba = new ChromeDriver();
		urba.manage().window().maximize();
		urba.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		urba.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		Thread.sleep(2000);
		Actions ac=new Actions(urba);
		WebElement sale = urba.findElement(By.xpath("//li[@class='topnav_item saleunit']"));
		Thread.sleep(2000);
		ac.moveToElement(sale).build().perform();
		Thread.sleep(1000);
		urba.findElement(By.xpath("//li[@class='topnav_item saleunit']/descendant::span[.='Wooden Sofa Sets']")).click();
		Thread.sleep(1000);
		urba.findElement(By.xpath("//a[@href='/products/malabar-wooden-sofa-macadamia-brown?src=listing-wooden-sofas']/descendant::button[.='View Product']")).click();
		Thread.sleep(1000);
		Set<String> sofas = urba.getWindowHandles();
		for (String sofa : sofas) {
			urba.switchTo().window(sofa);
			Thread.sleep(1000);
			
		}
		urba.findElement(By.xpath("//button[@id='add-to-cart-button'] ")).click();
		Thread.sleep(2000);
		urba.findElement(By.xpath("//img[@class='logo-img']")).click();
		Thread.sleep(2000);
		urba.findElement(By.xpath("//div[@id='cart-badge']")).click();
		
	}

}
/*
 sale //li[@class='topnav_item saleunit']
Wooden Sofa Sets //li[@class='topnav_item saleunit']/descendant::span[.='Wooden Sofa Sets']
View Product //a[@href='/products/malabar-wooden-sofa-macadamia-brown?src=listing-wooden-sofas']/descendant::button[.='View Product']
add-to-cart-button //button[@id='add-to-cart-button'] 
logo-img //img[@class='logo-img'] 
cart-badge //div[@id='cart-badge']
 */
 