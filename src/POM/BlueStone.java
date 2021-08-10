package POM;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlueStone {
	@FindBy(xpath = "//ul[@class='wh-main-menu']/li/a[@title='Rings']")
	private WebElement rings;
	
	@FindBy(xpath = "//ul[@class='two-col']/li/a[@title='Diamond Rings']")
	private WebElement diamond;
	
	@FindBy(xpath = "//img[@alt='The Taissa Ring']")
	private WebElement fRing;
	
	@FindBy(xpath = "//input[@value='Buy Now']")
	private WebElement buyNow;
	 
	@FindBy(xpath = "//div[@class='formErrorContent']")
	private WebElement errorT;
	
	public BlueStone(WebDriver blue) {
		PageFactory.initElements(blue,this);
	}
	
	public void ringHover(WebDriver blue) {
		Actions a = new Actions(blue);
		a.moveToElement(rings).perform();
		
	}
	public void diamondClick() {
		diamond.click();
	}
	public void fRingClick() {
		fRing.click();
	}
	public void switchTab(WebDriver blue) {
		Set<String> tabs = blue.getWindowHandles();
		for (String tab : tabs) {
			blue.switchTo().window(tab);
		}
	}
	public void buyNowClick() {
		buyNow.click();
	}
	public String fetchErrT() {
		return errorT.getText();
		
	}

}
