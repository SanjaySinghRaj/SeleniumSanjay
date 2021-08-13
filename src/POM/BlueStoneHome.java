package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlueStoneHome {
      @FindBy(xpath = "//a[@title='Coins']")
      private WebElement coins;
      @FindBy(xpath = "//span[@data-p='gold-coins-weight-20gms,m']")
      private WebElement gms20;
      @FindBy(xpath = "//span[@data-p='gold-coins-weight-50gms,m']")
      private WebElement gms50;
      @FindBy(xpath = "//span[@data-p='l-gold-coins-weight-2gms,m']")
      private WebElement gms2;
      @FindBy(xpath = "//span[@data-p='l-gold-coins-weight-5gms,m']")
      private WebElement gms5;
      @FindBy(xpath = "//span[@data-p='l-gold-coins-weight-10gms,m']")
      private WebElement gms10;
      @FindBy(xpath = "//h1[@class='title-5']")
      private WebElement vtitle;
      
      
      
      
      public BlueStoneHome(WebDriver blue) {
		PageFactory.initElements(blue,this);
	}
	public void coinHover(WebDriver blue) {
    	  Actions ac = new Actions(blue);
    	  ac.moveToElement(coins).perform();
		
	}
      public void gms20Click() {
    	  gms20.click();
		
	}
      public void gms50Click() {
    	  gms50.click();
		
	}
      public void gms2Click() {
    	  gms2.click();
		
	}
      public void gms5Click() {
    	  gms5.click();
		
	}
      public void gms10Click() {
    	  gms10.click();
		
	}
      public String getVTitle() {
    	  return vtitle.getText();
      }
}
