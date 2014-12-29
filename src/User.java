import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class User extends TestDrive {
	private String sponsorLogin;
	private String userLogin;
	private int packageButtonNumber;

	public int getPackageButtonNumber() {
		return packageButtonNumber;
	}

	public void setPackageButtonNumber(int packageButtonNumber) {
		this.packageButtonNumber = packageButtonNumber;
	}

	public String getSponsorLogin() {
		return sponsorLogin;
	}

	public void setSponsorLogin(String sponsorLogin) {
		this.sponsorLogin = sponsorLogin;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public void register(String sponsorLogin, String userLogin)
			throws Exception {
		driver.get(baseUrl + "/register/register");
		driver.findElement(By.cssSelector("h3.text-center")).click();
		driver.findElement(By.linkText("Регистрация")).click();
		driver.findElement(By.id("sponsor_login")).click();
		driver.findElement(By.id("sponsor_login")).clear();
		driver.findElement(By.id("sponsor_login")).sendKeys(sponsorLogin);
		// Thread.sleep(500);
		driver.findElement(By.id("Users_username")).clear();
		driver.findElement(By.id("Users_username")).sendKeys(userLogin);
		driver.findElement(By.id("ProfileLang_first_name")).clear();
		driver.findElement(By.id("ProfileLang_first_name")).sendKeys(
				"userFirstName");
		driver.findElement(By.id("ProfileLang_last_name")).clear();
		driver.findElement(By.id("ProfileLang_last_name")).sendKeys(
				"userLastName");
		driver.findElement(By.id("ProfileLang_second_name")).clear();
		driver.findElement(By.id("ProfileLang_second_name")).sendKeys(
				"userMiddleName");
		driver.findElement(By.id("Users_password")).clear();
		driver.findElement(By.id("Users_password")).sendKeys("123456");
		driver.findElement(By.id("Users_password_confirm")).clear();
		driver.findElement(By.id("Users_password_confirm")).sendKeys("123456");
		driver.findElement(By.cssSelector("div.jq-selectbox__select")).click();
		driver.findElement(By.cssSelector("li.selected.sel")).click();
		driver.findElement(By.cssSelector("img.ui-datepicker-trigger")).click();
		driver.findElement(By.cssSelector("select.ui-datepicker-year")).click();
		driver.findElement(By.linkText("6")).click();
		driver.findElement(By.id("Profile_phone")).click();
		driver.findElement(By.id("Profile_phone")).clear();
		driver.findElement(By.id("Profile_phone")).sendKeys("123123123123");
		driver.findElement(By.id("Users_email")).click();
		driver.findElement(By.id("Users_email")).clear();
		driver.findElement(By.id("Users_email")).sendKeys(
				userLogin + "@domain.com");
		driver.findElement(By.id("Profile_form_agree")).click();
		driver.findElement(By.id("Profile_form_agree_payout")).click();
		driver.findElement(By.id("Profile_form_agree_site")).click();
		/*
		driver.findElement(By.name("btn_register")).click();
		driver.findElements(By.name("btn_buy")).get(0).click();
		driver.findElements(By.id("button_buy")).get(1).click();
		driver.findElement(By.name("yt0")).click();
		driver.findElement(By.name("PAYMENT_METHOD")).click();
		driver.findElement(By.name("reply_confirmed_pay")).click();
		*/
	}

	public void payPackage(int packageButtonNumber) throws Exception {
		/*
		driver.findElement(By.linkText("Повысить")).click();
		
		driver.findElement(
		By.xpath("(//input[@name='btn_rise'])[packageButtonNumber]"))
		.click();
		 
		driver.findElements(By.name("btn_rise")).get(packageButtonNumber)
				.click();
		driver.findElement(By.id("button_buy")).click();
		driver.findElement(By.name("yt0")).click();
		*/
		driver.findElement(By.name("btn_register")).click();
		driver.findElements(By.name("btn_buy")).get(packageButtonNumber).click();
		driver.findElements(By.id("button_buy")).get(1).click();
		driver.findElement(By.name("yt0")).click();
		driver.findElement(By.name("PAYMENT_METHOD")).click();
		driver.findElement(By.name("reply_confirmed_pay")).click();
		//driver.findElement(By.linkText("Ссылке")).click();
		try {
			driver.findElement(By.linkText("Перейти в кабинет SIPNET"));
		} catch (NoSuchElementException e) {
			TakeScreenshot.takeScreenshot();
		}
	}

	public void changeLeg(int numberOfProfileGlobalStructureSettingsButton) {
		driver.get(baseUrl + "/office/default/referal");
		driver.findElements(
				By.id("ProfileGlobalStructureSettings_register_leg"))
				.get(numberOfProfileGlobalStructureSettingsButton).click();
		driver.findElement(By.name("btn-save")).click();
	}

	public void authorization(String userLogin, String password) {
		driver.get(baseUrl + "/site/login");
		driver.findElement(By.id("LoginForm_username")).clear();
		driver.findElement(By.id("LoginForm_username")).sendKeys(userLogin);
		driver.findElement(By.id("LoginForm_password")).clear();
		driver.findElement(By.id("LoginForm_password")).sendKeys(password);
		driver.findElement(By.name("yt0")).click();
	}

	public void quit() {
		driver.get(baseUrl + "/site/logout");
	}
}
