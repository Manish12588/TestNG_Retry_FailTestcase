package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.HomePage;

public class BaseTests {

	private WebDriver driver;
	protected HomePage homePage;
	
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();		
		homePage = new HomePage(driver);
				
		/*
		 * If you want to execute your test with the specific size of window like mobile phone screen than we can use with the below mentioned method
		 * driver.manage().window().setSize(new Dimension(375, 812));
		 * Dimension takes two parameter height and width 
		 * 
		 * */
			
		/* If you want to get all the links or any element which we have more than one on web page than with the 
		 * help of below method we can get that 
		 * 
		 * List<WebElement> links=driver.findElements(By.tagName("a"));
		    System.out.println(links.size());
		 * */	
	}
	
	@AfterClass
	public void tearDown()	{
		driver.quit();
	}
	
	
}
