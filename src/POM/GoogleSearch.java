package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearch {
	@FindBy(name="q")
	private WebElement search;
	@FindBy(xpath = "//span[.='Next']")
	private WebElement next;

	public GoogleSearch(WebDriver goog) {
		PageFactory.initElements(goog,this);
	}
	
	public void sendText(String text) {
		search.sendKeys(text,Keys.ENTER);
	}
	public void clicknext() throws InterruptedException {
		int count=0;
		while(next.isDisplayed())
		{
			Thread.sleep(1000);
			next.click();
			count++;
		}
	}
	public void scrollhig(Object goog) {
		JavascriptExecutor js = (JavascriptExecutor)goog;
		js.executeScript("window.scrollTo(document.body.scrollWidth,0)");
	}

}
