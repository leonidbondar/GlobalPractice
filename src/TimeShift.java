import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TimeShift extends User {
	public static void shiftTime(int addMonth, int addDay) {

		User user = new User();
		user.authorization("admin", "123456");
		driver.get(baseUrl + "/admin/default/timesettings");

		WebElement monthCount = driver.findElement(By.id("offset_month"));
		WebElement daysCount = driver.findElement(By.id("offset_day"));
		Integer monthValueInt = new Integer(Integer.parseInt(monthCount
				.getAttribute("value").toString()));
		Integer daysValueInt = new Integer(Integer.parseInt(daysCount
				.getAttribute("value").toString()));

		monthValueInt = monthValueInt + addMonth;
		daysValueInt = daysValueInt + addDay;

		monthCount.clear();
		monthCount.sendKeys(monthValueInt.toString());
		daysCount.clear();
		daysCount.sendKeys(daysValueInt.toString());

		driver.findElement(By.name("btn_save")).click();
		ArrayList<WebElement> list = (ArrayList<WebElement>) driver
				.findElements(By.className("alert_success"));
		if (list.isEmpty()) {
			System.out.println("Changes not saved!");
		}

	}
}
