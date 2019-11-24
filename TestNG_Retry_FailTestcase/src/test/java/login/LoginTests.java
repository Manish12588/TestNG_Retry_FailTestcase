package login;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTests;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests{

	LoginPage loginPage;
	@BeforeClass
	public void LoginTests1() {
		// TODO Auto-generated constructor stub\
		loginPage=homePage.clickFormAuthentication();
	}
	
	@Test (priority = 1)
	public void testSuccessfulLogin() {
		loginPage.setUsername("tomsmith");
		loginPage.setPassword("SuperSecretPassword!");
		SecureAreaPage secureAreaPage=loginPage.clickLoginButton();
		assertTrue(secureAreaPage.getAlertText()
				.contains("You logged into a secure area!"),
				"Alert text is incorrect");
		secureAreaPage.clickLogoutButton();
			
	}
		
	@Test (priority = 2)
	public void testUnsuccessfulLogin() {
		loginPage.setUsername("tomsmith");
		loginPage.setPassword("SuperSecretPassword");
		SecureAreaPage secureAreaPage=loginPage.clickLoginButton();
		assertTrue(secureAreaPage.getAlertText()
				.contains("You logged into a secure area!"),
				"Alert text is incorrect");
		
	}
	
}
