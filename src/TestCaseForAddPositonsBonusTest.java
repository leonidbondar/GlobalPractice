
public class TestCaseForAddPositonsBonusTest extends User {
	public static void registerStructure(String sponsorLogin, String userLogin) throws Exception {
		/*
		String sponsorLogin = new String("12345underadminl");
		String userLogin = new String("underunderadminls");
		*/
		
		int packageButtonNumber = 4;
		int numberOfProfileGlobalStructureSettingsButton = 1;

		MonoRegister.monoRegister(sponsorLogin, userLogin, packageButtonNumber);
		String currentUser = new String(userLogin);
		sponsorLogin = userLogin;
		userLogin = "q"
				+ "" + userLogin;

		WideRegister.wideRegister(sponsorLogin, userLogin, packageButtonNumber,
				0, 30);

		User user = new User();
		user.authorization(currentUser, "123456");
		user.changeLeg(numberOfProfileGlobalStructureSettingsButton);
		user.quit();

		packageButtonNumber = 3;
		WideRegister.wideRegister(sponsorLogin, userLogin, packageButtonNumber,
				30, 60);
		
		numberOfProfileGlobalStructureSettingsButton = 0;
		user.authorization(currentUser, "123456");
		user.changeLeg(numberOfProfileGlobalStructureSettingsButton);
		user.quit();
	}
}
