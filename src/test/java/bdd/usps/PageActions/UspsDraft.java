package bdd.usps.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import bdd.utilities.SetupDrivers;

public class UspsDraft {

	
	public void practiceHoverOver() throws InterruptedException{
		
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.get("https://www.usps.com/");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Thread.sleep(500);
		
		Actions actions = new Actions(SetupDrivers.driver);
		WebElement moveonmenu = SetupDrivers.driver.findElement(By.xpath("//a[@class='menuitem'][contains(text(),'Business')]"));
		actions.moveToElement(moveonmenu).perform();
		
		Thread.sleep(500);
		
		WebElement Stamps = SetupDrivers.driver.findElement(By.xpath("//a[contains(text(),'Calculate a Business Price')]"));
		Stamps.click();
		
		Thread.sleep(500);
		
	}
}
