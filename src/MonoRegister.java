public class MonoRegister {

	public static void monoRegister(String sponsorLogin, String userLogin,
			int packageButtonNumber) throws Exception {

		User user = new User();
		user.setSponsorLogin(sponsorLogin);
		user.setUserLogin(userLogin);
		user.setPackageButtonNumber(packageButtonNumber);

		user.register(sponsorLogin, userLogin);
		user.payPackage(packageButtonNumber);
		user.quit();
	}
}