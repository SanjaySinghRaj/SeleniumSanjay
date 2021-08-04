package august04;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Guru99 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver guru = new ChromeDriver();
		guru.manage().window().maximize();
		guru.get("http://demo.guru99.com/test/upload/");
		guru.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		guru.findElement(By.xpath("//div[@id='file_wraper0']")).click();
		Thread.sleep(2000);
		Runtime r=Runtime.getRuntime();
		r.exec("D:\\upload.exe");
		

	}

}
