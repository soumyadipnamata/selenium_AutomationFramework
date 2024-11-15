package genricutility;

import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 * @author Soumyadip
 */

public class WebDriverUtility {
	
	/**
	 * this method is used to maximize window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
		
	}
	/**
	 * this method is used to capture size of a window
	 * @param driver
	 * @return
	 */
	public Dimension getSize(WebDriver driver) {
		return driver.manage().window().getSize();
	}
	/**
	 * this method is used to switch the driver control to window based on url
	 * @param driver
	 */
	public void switchTo(WebDriver driver,String url) {
		//capture window id
		Set<String> allWindowsId = driver.getWindowHandles();
		//navigate through all the window
		for (String id : allWindowsId) {
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains(url)) {
				break;
			}
			
		}
		
	}
	/**
	 * this method is used to perform right click on webpage
	 * @param driver
	 */
	public void rightClick(WebDriver driver) {
		Actions act = new Actions(driver);
		act.contextClick().perform();
		
	}
	public void clickAndHold(WebDriver driver,WebElement element) {
		Actions clk = new Actions(driver);
		clk.clickAndHold(element).perform();
	}
	public void mouseHoveronEle(WebDriver driver,WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
		
	}
	public void dragAndDrop(WebDriver driver, WebElement srcelement,WebElement destElement) {
		Actions act = new Actions(driver);
		act.dragAndDrop(srcelement, destElement);
	}
	public void switchToframe(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	public void switchToframe(WebDriver driver,String nameorid) {
		driver.switchTo().frame(nameorid);
	}
	public void switchToframe(WebDriver driver,WebElement frameEle) {
		driver.switchTo().frame(frameEle);
	}
	public void  switchToMainPage(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public void selectDropdownByIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
		
	}
	public void selectDropdownByValue(WebElement element,String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	public void selectDropdownByVisibleText(WebElement element,String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}
	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void switchToAlertAndDissmiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	public void switchToAlertAndSendkeys(WebDriver driver, String data) {
		driver.switchTo().alert().sendKeys(data);   
	}
	public void switchToAlertAndGetText(WebDriver driver) {
		driver.switchTo().alert().getText();
	}
	public void jsScroll(WebDriver driver, int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+", "+y+")");
	}
	public void jsClick(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
		
		
	}
	public void takeScreenshot(WebDriver driver) {
		String timestamp = LocalDateTime.now().toString().replace(":", "_");
		TakesScreenshot ts = (TakesScreenshot)driver;
		ts.getScreenshotAs(OutputType.FILE);
	}
	public void doubleClick(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	

}


