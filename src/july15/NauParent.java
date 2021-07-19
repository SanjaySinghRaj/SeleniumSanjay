package july15;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NauParent {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver nauk=new ChromeDriver();
		nauk.manage().window().maximize();
		nauk.get("https://www.naukri.com/");
		String title = nauk.getTitle();
		System.out.println(title);
		System.out.println(nauk.getCurrentUrl());
		Set<String> wind = nauk.getWindowHandles();
		System.out.println(wind.getClass());
		String parent=nauk.getWindowHandle();
		wind.remove(parent);
		for (String id : wind) {
			nauk.switchTo().window(id);
			Thread.sleep(1000);
			nauk.close();
			
		}

	}

}
