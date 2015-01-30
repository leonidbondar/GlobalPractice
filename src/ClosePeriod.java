import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ClosePeriod extends User {
	public static void closePeriods() {
		// В результате работы бонусов получилось много открытых периодов,
		// которые нужно закрывать.
		// Этот метод должен делать это автоматически

		// авторизация на сайте
		User user = new User();
		user.authorization("admin", "123456");
		driver.get(baseUrl + "/admin/bonus/bonus");

		// бесконечный цикл, как сделать конечный не придумал
		// искать будет только на первой странице
		while (true) {
			try {
				driver.findElement(By.linkText("Закрыть")).click();
			} catch (NoSuchElementException e) {
				System.out.println("No period found that could be closed");
				break;
			}
			driver.findElement(By.name("saveBonus")).click();
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.name("save")).click();
		}
	}
}
