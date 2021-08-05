package august05;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class GoogleSS {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver googl = new ChromeDriver();
		googl.manage().window().maximize();
		googl.get("https://www.google.com/"); 
		googl.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TakesScreenshot ts = (TakesScreenshot) googl;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		File sss = new File("./ScreenShot/google.png");
		Files.copy(ss, sss);
		

	}

}
