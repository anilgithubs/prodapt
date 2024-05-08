package practiceTestNg.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActonsClickandSendKeys {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		Actions act = new Actions(driver);
		WebElement email = driver.findElement(By.name("email"));
		WebElement pwd = driver.findElement(By.name("password"));
		WebElement lognBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		
//		act.sendKeys(email, "anilbhanuchandar@gmail.com").perform();
//		act.sendKeys(pwd, "Newlife@now").perform();
//		act.click(lognBtn).perform();
		
		ActionSendkeys(By.name("email"), "anilbhanuchandar@gmail.com");
		ActionSendkeys(By.name("password"), "Newlife@now");
		ActionClick(By.xpath("//input[@type='submit']"));
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void ActionSendkeys(By locator,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator),value ).perform();
	}
	
	public static void ActionClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
}
