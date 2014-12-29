import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDrive {
	public static WebDriver driver;
	public static String baseUrl;

	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/home/leonid/Public/chromedriver");
		driver = new ChromeDriver();
		// baseUrl = "http://test9.kostyatatar.d.ukrtech.info";
		baseUrl = "http://test8.kostyatatar.d.ukrtech.info";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws Exception {
		//TestCaseForAddPositonsBonusTest.registerStructure();
		ClosePeriod.closePeriods();
		/*
		String sponsorLogin = new String("12345underadminl");
		String userLogin = new String("underunderadminls");
		*/
		/*
		String sponsorLogin = new String("admin");
		String userLogin = new String("underadminl");
		int packageButtonNumber = 4;
		DeepRegister.deepRegister(sponsorLogin, userLogin, packageButtonNumber, 5, 0);
		*/
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

}
