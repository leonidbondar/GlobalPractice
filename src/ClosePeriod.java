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
		while (true) {
			int pageNumber = 1; // это номер страницы с периодами

			// перед началом каждого цикла зануляем object reference чтобы
			// учесть возможный переход на другую страницу.
			WebElement element = null;
			// пока не могут найти кнопку закрыть на первой и т.д. страницах, то
			// номера страниц должны
			// увеличиватся
			/*
			while (element == null) {
				
				try {
					driver.findElement(By.linkText(String.valueOf(pageNumber)))
							.click();
				} catch (Exception e) {
					try {
						element = driver.findElement(By.linkText("Закрыть"));
					} catch (Exception exception) {
						pageNumber++;
					}
				}
			}
			*/
			// потом закрывается период, только одна ссылка Закрыть может быть
			// одновременно
			driver.findElement(By.linkText("Закрыть")).click();
			driver.findElement(By.name("saveBonus")).click();
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.name("save")).click();
		}
	}
}
