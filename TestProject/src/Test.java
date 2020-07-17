

	
	
	
	

	
	public class Login {
		public static WebDriver driver;

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
			driver.get("http://www.habeshaschool.com/");      

		}

		@Test(priority = 1)
		public void Login1() {
			driver.findElement(By.name("userName")).sendKeys("A");
			driver.findElement(By.name("password")).sendKeys("a");
			driver.findElement(By.name("login")).click();

		}

		@Test(priority = 2) 
		public void Radio() {

			
			// driver.findElement(By.xpath("//input[@type='radio' and
			// @value='oneway']")).click();
			/*
			 * WebDriverWait d=new WebDriverWait (driver, 20);
			 * d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
			 * "//input[@name='tripType']"))).click();
			 */
			
			/*int count = driver.findElements(By.xpath("//input[@name='tripType']")).size();
	git ub version control for biggenerr navven brunch master 





	Avatar image
	GIT Basics - My First Repo In GIT || PUSH & PULL In GIT
			for (int i = 0; i < count; i++) {

				driver.findElements(By.xpath("//input[@name='tripType']")).get(i).click();*/
			}

			/*
			 * WebElement RoundTrip =
			 * driver.findElement(By.xpath("//input[@type='radio' and @value='roundtrip']"))
			 * ; WebElement OneWay =
			 * driver.findElement(By.xpath("//input[@type='radio'and@value='oneway']"));
			 * 
			 * String RoundTripToBeSelecte = " RoundTrip"; if
			 * (RoundTripToBeSelecte.equalsIgnoreCase("RoundTrip")) { RoundTrip.click();
			 * 
			 * } else if (RoundTripToBeSelecte.equalsIgnoreCase("OneWay")) {
			 * 
			 * OneWay.click(); }
			 */

		

	// Select class only 
		@Test(priority = 3)
		public void Dropddown() {
			Select s = new Select(driver.findElement(By.name("passCount")));
			s.selectByValue("2");

			Select s1 = new Select(driver.findElement(By.name("fromPort")));
			s1.selectByValue("London");
			System.out.println(driver.findElement(By.name("fromPort")).getText());

			Select s3 = new Select(driver.findElement(By.name("fromMonth")));
			s3.selectByValue("3");
			System.out.println(driver.findElement(By.name("fromMonth")).getText());

			Select s4 = new Select(driver.findElement(By.name("fromDay")));
			s4.selectByValue("8");
			System.out.println(driver.findElement(By.name("fromDay")).getText());

			Select s2 = new Select(driver.findElement(By.name("toPort")));
			s2.selectByValue("Portland");
			System.out.println(driver.findElement(By.name("toPort")).getText());

			Select s5 = new Select(driver.findElement(By.name("toMonth")));
			s5.selectByValue("4");
			System.out.println(driver.findElement(By.name("toMonth")).getText());

			Select s6 = new Select(driver.findElement(By.name("toDay")));
			s6.selectByValue("10");
			System.out.println(driver.findElement(By.name("toDay")).getText());

		}

		@Test(priority = 4)

		public void Reference() throws InterruptedException {
			Thread.sleep(2000);

			driver.findElement(By.xpath("//input[@name='servClass' and @value='Business']")).click();
			driver.findElements(By.xpath("//input[@name='servClass']")).size();

		} 

		@Test(priority = 6)
		public void Airline() throws InterruptedException {
			Thread.sleep(5000);

			Select s7 = new Select(driver.findElement(By.name("airline")));
			s7.selectByVisibleText("Blue Skies Airlines"); 

			driver.findElement(By.name("findFlights")).click();

		}
		@Test(priority  =8)
		
		public void Depart() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='outFlight' and @value='Blue Skies Airlines$361$271$7:10']")).click();
			
			
			
			
			
			int count = driver.findElements(By.xpath("//input[@name='outFlight']")).size();
			for (int i = 0; i < count; i++) {
				System.out.println(i);

				driver.findElements(By.xpath("//input[@name='outFlight']")).get(i).click();
				
		}	
			
		}

		@Test(priority = 9)
		
		public void Return() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='inFlight' and @value='Blue Skies Airlines$631$273$14:30']")).click();
			driver.findElement(By.name("reserveFlights")).click();
			
			
		}
		public void close() {
			driver.quit();
		}
	}


}
