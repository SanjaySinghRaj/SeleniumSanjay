package july21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver acti=new ChromeDriver();
		acti.get("https://demo.actitime.com/login.do");
		acti.manage().window().maximize();
		WebElement usern = acti.findElement(By.name("username"));
		usern.sendKeys("admin");
		WebElement passw = acti.findElement(By.name("pwd"));
		passw.sendKeys("manager");
		acti.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		String title = acti.getTitle();
		System.out.println(title);
	}

}
/*
 1 Username= //input[@placeholder='Username']
 2 Password= //input[@placeholder='Password']
 3 Keep me logged in = //input[@name='remember']
 4 login = //a[@id='loginButton']
 5 forgit password= //a[@id='toPasswordRecoveryPageLink']
 6 copyrifht = //a[@href='http://www.actitime.com']
  */
