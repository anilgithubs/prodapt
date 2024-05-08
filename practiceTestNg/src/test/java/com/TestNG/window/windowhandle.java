package com.TestNG.window;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement linked = driver.findElement(By.xpath("//a[contains(@href,'linked')]"));
		WebElement facebk = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement twitter = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement youtube = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));

		String parentId = driver.getWindowHandle();
		linked.click();
		facebk.click();
		twitter.click();
		youtube.click();

		Set<String> window = driver.getWindowHandles();

		Iterator<String> it = window.iterator();

		while (it.hasNext()) {
			String winID = it.next();
			driver.switchTo().window(winID);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(3000);
			if(!winID.equals(parentId)) {
				driver.close();
			}
		}
		driver.switchTo().window(parentId);
		System.out.println("Parent window URL:"+driver.getCurrentUrl());

	}

}
