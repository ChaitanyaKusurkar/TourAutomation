package com.selenium.maps;

import org.openqa.selenium.By;

public class LandingPageMap {

	public By scheduleATourButton(){
		return By.xpath("//div//div[@class='frame-content']//div[@id='InlineCss_DoorwayLauncherButtons']//div[@class='doorway-buttons-wrapper']//li[2]//button[text()='Schedule a Tour']");
	}
	
	public By optionsFrame(){
		return By.xpath("//div[@class='doorway-notification-frame-wrapper doorway-notification-frame-wrapper-shown']//iframe[@class='doorway-notification-frame']");
	}
}
