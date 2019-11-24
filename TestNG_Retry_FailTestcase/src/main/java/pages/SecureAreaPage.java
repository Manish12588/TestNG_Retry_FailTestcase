package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
	private WebDriver driver;

	private By statusAlert = By.cssSelector("#flash");
	private By logoutButton= By.xpath("//i[text()=' Logout']/..");
	

	public SecureAreaPage(WebDriver driver) {
		this.driver= driver;
	}

	public String getAlertText() {
		return driver.findElement(statusAlert).getText();

	}

	public void clickLogoutButton() {
		driver.findElement(logoutButton).click();

	}
	
}
