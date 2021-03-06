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
		//baseUrl = "http://globalpractice.eu";
		baseUrl = "http://test8.kostyatatar.d.ukrtech.info";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws Exception {
		
		String sponsorLogin = new String("admin");
		String userLogin = new String("registereleven");
		int packageButtonNumber = 0;
		MonoRegister.monoRegister(sponsorLogin, userLogin, packageButtonNumber);
		//TestCaseForAddPositonsBonusTest.registerStructure(sponsorLogin, userLogin);
		
		//ClosePeriod.closePeriods();
		
		/*
		String sponsorLogin = new String("admin");
		String userLogin = new String("testbrokenlimitsinmulti");
		
		int packageButtonNumber = 4;
		DeepRegister.deepRegister(sponsorLogin, userLogin, packageButtonNumber, 5, 0);
		
		sponsorLogin = "12345" + userLogin;
		userLogin = "under" + userLogin;
		
		TestCaseForAddPositonsBonusTest.registerStructure(sponsorLogin, userLogin);
		
		TimeShift.shiftTime(0, 14);
		//ClosePeriod.closePeriods();
		*/
		//ClosePeriod.closePeriods();
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
