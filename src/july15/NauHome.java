package july15;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NauHome {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver nauk=new ChromeDriver();
		nauk.manage().window().maximize();
		nauk.get("https://www.naukri.com/");
		String title = nauk.getTitle();
		System.out.println(title);
		System.out.println(nauk.getCurrentUrl());
		Set<String> wind = nauk.getWindowHandles();
		System.out.println(wind.getClass());
		ArrayList<String> ali=new ArrayList<>(wind);
		for (int i = ali.size()-1; i >=0; i--) {
			String id=ali.get(i);
			nauk.switchTo().window(id);
			Thread.sleep(2000);
			nauk.close();
		}
		
		
		/*for (String id : wind) {
			System.out.println(id);
			nauk.switchTo().window(id);
			Thread.sleep(2000);
			nauk.close();
		}*/
		

	}

}
