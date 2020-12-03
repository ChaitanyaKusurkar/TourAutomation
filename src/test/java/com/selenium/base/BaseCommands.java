package com.selenium.base;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.selenium.base.BaseTest;

public class BaseCommands extends BaseTest {

	public WebElement locateElement(By locator){
		try{
			WebDriverWait wait = new WebDriverWait(driver,25);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			 return getDriver().findElement(locator);

		}
		catch(Exception e){
			e.printStackTrace();
			e.toString();
		}
		return null;
	}

	//function to enter Text in an Element
	public void enterText(String text,By locator){
		try{
			getDriver().findElement(locator).sendKeys(text.toString());

		}
		catch(Exception e){
			e.printStackTrace();
			e.toString();
		}
	}
	//function to click element
	public void click(By locator){
		try{
			getDriver().findElement(locator).click();
		}
		catch(Exception e){
			e.printStackTrace();
			e.toString();
		}
	}

	//function to get Text from element
	public String getText(By locator){
		try{
			return getDriver().findElement(locator).getText();
		}
		catch(Exception e){
			e.printStackTrace();
			e.toString();
		}
		return null;
	}

	//Function to get Attribute Value
	public String getAttribute(By locator, String textID) {
		// TODO Auto-generated method stub
		return getDriver().findElement(locator).getAttribute(textID);
	}

	//Report True or False if the condition is true or false
	public void assertPassFail(boolean status){
		Assert.assertTrue(status);
	}
	
	
	public boolean isEnabled(By locator){
		try{
			return getDriver().findElement(locator).isEnabled();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean waitForElementToBeVisible(By locator, int timeOutinSeconds){
		try{
			WebDriverWait wait = new WebDriverWait(driver,timeOutinSeconds);
			wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
			
			return getDriver().findElement(locator).isDisplayed();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	public void switchToFrameandClick(By id, By elementToBeClicked, int timeOutinSeconds){
		try{
		driver.switchTo().parentFrame();
		WebDriverWait wait = new WebDriverWait(driver,timeOutinSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(id));
		driver.switchTo().frame(driver.findElement(id));

		wait.until(ExpectedConditions.visibilityOfElementLocated(elementToBeClicked));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(elementToBeClicked))).click();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void moveToElementAndClick(By locator){
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(locator)).click().perform();
	}

	public void SelectOptionFromDropDown(By selectOption) {		
		Select selectOptionList=new Select (driver.findElement(selectOption));
		int numberOfSlots = selectOptionList.getOptions().size();
		
		Random rand = new Random(); 
		int randomSlot = rand.nextInt(numberOfSlots);
		selectOptionList.selectByIndex(randomSlot);
	}

	//The elements in this method are currently hardcoded due to StaleElementExceptions generated because of absence of Element from DOM.
	public void clickParticularDateFromTable(By datePicker, By dateTable) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(datePicker)).click();		
		
		int rowIndex=1,columnIndex=1, flag=0;
		Actions actions = new Actions(driver);
		
		WebElement simpleTable = driver.findElement(dateTable);
		WebElement tableBody=simpleTable.findElement(By.tagName("tbody"));
		List<WebElement> rows = tableBody.findElements(By.tagName("tr"));
		
		for (int i=1;i<=rows.size();i++) {
			WebElement row =driver.findElement(By.xpath("//div[@class='CalendarMonthGrid_month__horizontal CalendarMonthGrid_month__horizontal_1']//table[@class='CalendarMonth_table CalendarMonth_table_1']//tbody//tr" +"[" + i + "]"));
		    List<WebElement> cols = row.findElements(By.tagName("td"));
		    columnIndex=1;
		    for (WebElement col : cols) {
		        if(col.getAttribute("innerHTML").contentEquals("10")){
		        	WebElement cell=driver.findElement(By.xpath("//div[@class='CalendarMonthGrid_month__horizontal CalendarMonthGrid_month__horizontal_1']//table[@class='CalendarMonth_table CalendarMonth_table_1']//tbody//tr" +"[" + i + "]" + "//td" + "[" + columnIndex + "]"));	
		        	actions.moveToElement(cell).build().perform();
		        	cell.click();
		        	flag=1;
		        	break;
		        }
		        columnIndex++;
		    }
		    if(flag==1)
		    	break;
		    else{
		    	wait.until(ExpectedConditions.elementToBeClickable(datePicker));
		    	locateElement(datePicker);
		    	simpleTable = driver.findElement(dateTable);
				tableBody=simpleTable.findElement(By.tagName("tbody"));
				rows = tableBody.findElements(By.tagName("tr"));		    	
		    }
		}
		wait.until(ExpectedConditions.elementToBeClickable(datePicker));		
	}
}
