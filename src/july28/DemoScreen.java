package july28;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class DemoScreen {
	
	public static void demoScreenS(Object driver ,String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		File sss = new File("./ScreenShot/name.png");
		Files.copy(ss, sss);
	}

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver googl = new ChromeDriver();
		googl.manage().window().maximize();
		googl.get("https://www.google.com/"); 
		googl.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		demoScreenS(googl,"hello");

	}

}
