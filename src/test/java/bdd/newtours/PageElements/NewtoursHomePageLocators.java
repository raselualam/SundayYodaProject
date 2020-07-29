package bdd.newtours.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursHomePageLocators {
	
	//Register Link
	@FindBy(xpath="//a[contains(text(),'REGISTER')]")
    public WebElement lnkRegister;
	
}
