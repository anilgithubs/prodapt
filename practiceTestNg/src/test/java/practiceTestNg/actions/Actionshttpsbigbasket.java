package practiceTestNg.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionshttpsbigbasket {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		By parentMenu = By.xpath("(//span[text()='Shop by'])[2]");
//	    By secondMenu =  By.xpath("//a[@role='none'][normalize-space()='Beauty & Hygiene']");
//	    By thirdMenu = By.xpath("//a[normalize-space()='Makeup']");
//	    By fourthMenu = By.xpath("//a[normalize-space()='Makeup Accessories']");
		By userName = By.name("username");
//	    
//	    Actions act = new Actions(driver);
//	    Thread.sleep(3000);
//	    
//	    act.click(driver.findElement(parentMenu)).perform();
//	    
//	    act.moveToElement(driver.findElement(secondMenu)).perform();
//	    Thread.sleep(5000);
//	    act.moveToElement(driver.findElement(thirdMenu)).perform();
//	    Thread.sleep(5000);
//	    act.moveToElement(driver.findElement(fourthMenu)).perform();	   
//	   
		Thread.sleep(5000);
		ActionSendkeyswithPause(userName, "success");
	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}

	public static void ActionSendkeyswithPause(By locator, String value) {
		Actions act = new Actions(driver);

		char[] val = value.toCharArray();
		for (char c : val) {
			act.sendKeys(driver.findElement(locator), String.valueOf(c)).pause(1000).perform();
		}

	}

}
