public class WideRegister {

	public static void wideRegister(String sponsorLogin, String userLogin,
			int packageButtonNumber, int i, int n) throws Exception {

		while (i < n) {
			MonoRegister.monoRegister(sponsorLogin, userLogin + i,
					packageButtonNumber);
			i++;
		}
	}
}