package july30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HtmlSele {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver demo = new ChromeDriver();
		demo.manage().window().maximize();
		demo.get("file:///F:/java%20programs/selenium/src/Select.html");
		Thread.sleep(2000);
		WebElement ele = demo.findElement(By.id("b"));
		Select s1=new Select(ele);
		if(s1.isMultiple()) {
			s1.selectByVisibleText("rosogula");
			s1.selectByIndex(2);
		}
		System.out.println(s1.getFirstSelectedOption().getText());
		System.out.println("======================");
		List<WebElement> s2 = s1.getAllSelectedOptions();
		for (WebElement se : s2) {
			System.out.println(se.getText());
		}
		demo.close();

	}

}
