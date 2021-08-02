package july30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ECommerce {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver auto = new ChromeDriver();
		auto.manage().window().maximize();
		auto.get("http://automationpractice.com/index.php");
		auto.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		auto.findElement(By.xpath("//div[@id='block_top_menu']/ul/li/a[text()='T-shirts']")).click();
		Actions ac=new Actions(auto);
		WebElement vi = auto.findElement(By.xpath("//ul[@class='product_list grid row']/li"));
		ac.moveToElement(vi).build().perform();
		
		auto.findElement(By.xpath("//span[.='Add to cart']")).click();
		
		auto.findElement(By.xpath("//span[@title='Close window']")).click();
		
		WebElement sc = auto.findElement(By.xpath("//a[@title='View my shopping cart']"));
		ac.moveToElement(sc).build().perform();
		
		WebElement prod = auto.findElement(By.xpath("//dl[@class='products']/dt"));
		System.out.println(prod.getText());
		WebElement pris = auto.findElement(By.xpath("//span[@class='price cart_block_total ajax_block_cart_total']"));
		System.out.println(pris.getText());
		
		auto.close();

	}

}
/*
T-shirts //div[@id='block_top_menu']/ul/li/a[text()='T-shirts']
product //ul[@class='product_list grid row']/li
add to //span[.='Add to cart']
close //span[@title='Close window']
shopping cart //a[@title='View my shopping cart']
product //dl[@class='products']/dt
final price //span[@class='price cart_block_total ajax_block_cart_total']
*/