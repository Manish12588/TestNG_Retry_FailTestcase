package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	/* 1. It's a custom in POM design pattern if your action change the page than you should return the handle to that new page
	 *  
	 * 
	 * */
	
	private WebDriver driver;
	private By formAuthenticationLink = By.linkText("Form Authentication");
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage clickFormAuthentication() {
		driver.findElement(formAuthenticationLink).click();
		return new LoginPage(driver);
	}
	
	
	
	

}
