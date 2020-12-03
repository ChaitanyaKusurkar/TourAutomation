package com.selenium.maps;

import org.openqa.selenium.By;

public class ScheduleTourPageMap {
	
	public By schedulingPage(){
		return By.xpath("//div[@id='InlineCss_PluginScheduling']");
	}
	
	public By SchedulingPageAvatar(){
		return By.xpath("//img[@class='doorway-avatar-image']");
	}
	
	public By ScheduleTourPage(){
		return By.xpath("//div[@id='InlineCSS_DoorwayWrapper']//div[@class='doorway-wrapper']//div[@class='doorway-plugin-frame-wrapper']//iframe[@class='doorway-plugin-frame']");
	}
	
	public By PreferenceTourSection(){
		return By.xpath("//div[@id='InlineCss_TourTypeButtons']");
	}
	
	public By DatePicker(){
		return By.xpath("//input[@id='date']");
	}

	public By FirstName(){
		return By.xpath("//input[@placeholder='First name']");
	}
	
	public By LastName(){
		return By.xpath("//input[@placeholder='Last name']");
	}
	
	public By Email(){
		return By.xpath("//input[@placeholder='Email']");
	}
	
	public By Phone(){
		return By.xpath("//input[@placeholder='Phone']");
	}
	
	public By BookTourButton(){
		return By.xpath("//button[text()='Book tour!']");
	}

	public By DateTable() {
		return By.xpath("//div[@class='CalendarMonthGrid_month__horizontal CalendarMonthGrid_month__horizontal_1']//table[@class='CalendarMonth_table CalendarMonth_table_1']");
	}
	
	public By SelectTime(){
		return By.xpath("//select[@tabindex='3']");
	}

}
