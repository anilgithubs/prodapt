import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		futuredate(driver, "26-July-2028", "dd-MMM-yyyy");
	}

	public static void futuredate(WebDriver driver, String targetDate, String dateFormat) {

		// dateFormat = dd-MMM-yyyy
		// targetDate = 26-July-2026

		Calendar calendar = Calendar.getInstance();

		SimpleDateFormat targetDateFormate = new SimpleDateFormat(dateFormat);

		Date formatedTargetDate = null;
		try {
			targetDateFormate.setLenient(false);
			targetDateFormate.parse(targetDate);
			calendar.setTime(formatedTargetDate);
			int targetDay = calendar.get(Calendar.DAY_OF_MONTH);
			int targetMonth = calendar.get(Calendar.MONTH);
			int targetYear = calendar.get(Calendar.YEAR);

			// click the departure calendar
			driver.findElement(By.xpath("//input[@placeholder='C']")).click();
			// get actual date
			String actualDate = driver.findElement(By.xpath("(//div[@class=' col'])[5]")).getText();
			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));
			int actualMonth = calendar.get(Calendar.MONTH);
			int actualYear = calendar.get(Calendar.YEAR);

			while (targetMonth > actualMonth || targetYear > actualYear) {
				// next button click
				driver.findElement(By.xpath("(//span[@class='calender-month-change'])[2]")).click();
				actualDate = driver.findElement(By.xpath("")).getText();
				calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));
				actualMonth = calendar.get(Calendar.MONTH);
				actualYear = calendar.get(Calendar.YEAR);
				driver.findElement(By.xpath("//span[text()='" + targetDay + "']")).click();

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
