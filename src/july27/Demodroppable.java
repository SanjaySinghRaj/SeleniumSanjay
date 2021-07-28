package july27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demodroppable {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver demo = new ChromeDriver();
		demo.manage().window().maximize();
		demo.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		WebElement frame = demo.findElement(By.xpath("//iframe[@class='demo-frame']"));
		demo.switchTo().frame(frame);
		Thread.sleep(2000);
		WebElement elem = demo.findElement(By.xpath("//div[@id='draggable']"));
		WebElement elem2 = demo.findElement(By.xpath("//div[@id='droppable']"));
		System.out.println(elem2.getCssValue("background-color"));
		Actions ac = new Actions(demo);
		ac.dragAndDrop(elem, elem2).perform();
		System.out.println(elem2.getCssValue("background-color"));
		System.out.println(elem2.getText());

	}

}
