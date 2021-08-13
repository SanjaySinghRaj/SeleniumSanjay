package august10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.findElement(By.name("firstname")).sendKeys("Sanjay");
		driver.findElement(By.name("lastname")).sendKeys("Singh");
		WebElement gender = driver.findElement(By.cssSelector("input[value='Male']"));
		gender.click();
		WebElement Experience = driver.findElement(By.cssSelector("input[value='1']")); 
	    Experience.click();
	    driver.findElement(By.id("datepicker")).sendKeys("13-10-2020");
	    WebElement Profession = driver.findElement(By.cssSelector("input[value='Manual Tester']"));
	    Profession.click();
	    java.util.List<WebElement> checkboxes = driver.findElements(By.xpath("//span[.='Automation Tools']/following-sibling::input"));
	    for(WebElement we : checkboxes)
	    {
	    	we.click();
	    }
	    	    
	    //WebElement Automation = driver.findElement(By.cssSelector("input[value='Selenium Webdriver']"));
	    //Automation.click();
	    
	    WebElement E = driver.findElement(By.name("continents"));

		Select s = new Select(E);
		s.selectByVisibleText("Europe");
		
		WebElement E2 = driver.findElement(By.id("selenium_commands"));
		Select s2=new Select(E2);
		s2.selectByVisibleText("Browser Commands");
		s2.selectByVisibleText("Navigation Commands");
		s2.selectByVisibleText("Switch Commands");
		
		driver.findElement(By.id("photo")).sendKeys("D:\\Eclipse project\\Test.png");
	    
	   driver.findElement(By.id("submit")).click();
	   Thread.sleep(6000);
	   //driver.quit();

	}

}
