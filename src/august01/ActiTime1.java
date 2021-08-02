package august01;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class ActiTime1 {





		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver acti=new ChromeDriver();
			acti.get("https://demo.actitime.com/login.do");
			acti.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			acti.manage().window().maximize();
			WebElement usern = acti.findElement(By.xpath("//input[@placeholder='Username']"));
			WebDriverWait we = new WebDriverWait(acti, 10);
			usern.sendKeys("admin");
			we.until(ExpectedConditions.textToBePresentInElementValue(usern, "admin"));
			WebElement passw = acti.findElement(By.xpath("//input[@placeholder='Password']"));
			passw.sendKeys("manager");
			WebElement logi = acti.findElement(By.id("loginButton"));
			logi.click();
			we.until(ExpectedConditions.titleContains("Enter"));
			String title = acti.getTitle();
			System.out.println(title);
			acti.findElement(By.id("logoutLink")).click();
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
