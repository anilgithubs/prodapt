import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JScript {

	private WebDriver driver;
	private JavascriptExecutor js;
	
	public JScript(WebDriver driver) {
		
		this.driver = driver;
		
		js =(JavascriptExecutor)this.driver;
	}
	
	public String jsGetTitle() {
		
		return js.executeScript("return document.title").toString();
	}
	
	public String getUrlByJs() {
		return js.executeScript("return document.URL").toString();
	}
	
	public void refreshByJs() {
		js.executeScript("history.go(0)");
	}
	
	public void goBackByJs() {
		js.executeScript("history.go(-1");
	}
	public void goForwardByJs() {
		js.executeScript("history.go(1)");
	}
	
	public String getPageInnerText() {
	   return js.executeScript("return document.documentElement,innerText").toString();
	}
	
	public void scrollDownByJs() {
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	}
	
	public void scrollMiddlePageDown() {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight/2);");
	}
	
	public void scrollMiddlePageUp() {
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
	}
	
	public void scrollIntoView(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	public void clickByJs(WebElement element) {
		js.executeScript("arguments[0].click();",element);
	}
	
	public void drowColorByJs(WebElement element) {
		js.executeScript("arguments[0].style.border='3px solid red'",element);
	}
}
