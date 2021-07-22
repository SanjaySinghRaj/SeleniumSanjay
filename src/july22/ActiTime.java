package july22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver acti=new ChromeDriver();
		acti.manage().window().maximize();
		acti.get("https://demo.actitime.com/login.do");
		WebElement username = acti.findElement(By.xpath("//b[text()='admin']"));
		WebElement usern = acti.findElement(By.xpath("//input[@placeholder='Username']"));
		Thread.sleep(2000);
		usern.sendKeys(username.getText());
		WebElement password = acti.findElement(By.xpath("//b[text()='manager']"));
		WebElement passw = acti.findElement(By.xpath("//input[@placeholder='Password']"));
		Thread.sleep(2000);
		passw.sendKeys(password.getText());
		acti.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);

	}

}
/*
1 Username= //input[@placeholder='Username']
2 Password= //input[@placeholder='Password']
3 Keep me logged in = //input[@name='remember']
4 login = //a[@id='loginButton']
*/
