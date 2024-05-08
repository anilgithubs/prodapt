package practiceTestNg.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions act = new Actions(driver);
		
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.DOWN).perform();
		
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
		
		Thread.sleep(2000);
		
		act.scrollToElement(driver.findElement(By.xpath("//a[text()='Home Services']"))).click(driver.findElement(By.xpath("//span[text()='Experienced Pros']"))).perform();
	}

}
