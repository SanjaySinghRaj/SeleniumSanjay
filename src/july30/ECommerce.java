package july30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ECommerce {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver blue = new ChromeDriver();
		blue.manage().window().maximize();
		blue.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		

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