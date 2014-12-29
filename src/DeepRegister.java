public class DeepRegister extends User {
	
	public static void deepRegister (String sponsorLogin, String userLogin,
			int packageButtonNumber, int i, int n) throws Exception {
		// int numberOfProfileGlobalStructureSettingsButton = 1;
		for (i = 5; i >= n; i--) {
			MonoRegister.monoRegister(sponsorLogin, userLogin,
					packageButtonNumber);
			sponsorLogin = userLogin;
			userLogin = i + userLogin;
		}
	}
}