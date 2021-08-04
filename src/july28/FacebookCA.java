package july28;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCA {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver demo = new ChromeDriver();
		demo.manage().window().maximize();
		demo.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		 demo.findElement(By.xpath("//a[text()='Create New Account']")).click();
		 Thread.sleep(2000);
		 //WebElement face = demo.findElement(By.xpath("//label[text()='Male']"));
		 WebElement face = demo.findElement(By.xpath("//input[@value='2']"));
		 face.click();
		 System.out.println(face.getAttribute("name"));
		 System.out.println(face.getCssValue("color"));
		 Point loc = face.getLocation();
		 System.out.println("Location of X "+loc.getX()+"  "+"Location of Y "+loc.getY());
		 Thread.sleep(2000);
		 System.out.println(face.isSelected());
		 demo.close();
		

}
}
/*
 //a[text()='Create New Account']
   //label[text()='Male']
  
 
 */