package mercurytours;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckTitle {


	WebDriver driver;
	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chrom\\chromedriver.exe"); 
		// System.setProperty("webdriver.gecko.driver",
		// "C:\\eclipse\\chrom\\geckodriver.exe");
		driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.newtours.demoaut.com/");
		
	} 

	@Test
	public void title() {
		String title = driver .getTitle();
		System .out.println(title); 
		Assert.assertEquals(title, "Welcome: Mercury Tours", "title is not mached");

	}	 
}
