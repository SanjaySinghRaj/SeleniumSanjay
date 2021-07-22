package july21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver urba=new ChromeDriver();
		urba.manage().window().maximize();
		urba.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		urba.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		Thread.sleep(2000);
		urba.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Sofa",Keys.ENTER);
		Thread.sleep(3000);
		urba.findElement(By.xpath("//img[@alt='Weston Half Leather Sofa (Wine Italian Leather)']")).click();
		Thread.sleep(2000);
		urba.findElement(By.xpath("//a[@data-gacategory='Sofa_Prod_Page']")).click();
		Thread.sleep(2000);
		urba.findElement(By.xpath("//button[@data-gacategory='Sofa_Prod_Page']")).click();
		Thread.sleep(2000);
        String title = urba.getTitle();
		System.out.println(title);
		urba.close();

	}

}
