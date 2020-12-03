package com.selenium.maps;

import org.openqa.selenium.By;

public class AppointmentStatusPageMap {
	
	public By appointmentStatusPage(){
		return By.xpath("//div[@id='InlineCSS_DoorwayWrapper']//div[@class='doorway-wrapper']//div[@class='doorway-plugin-frame-wrapper']//iframe[@class='doorway-plugin-frame']");
	}
	
	public By confirmationHeader(){
		return By.xpath("//div[@class='doorway-plugin-header doorway-themed-bg']//span");
	}
	
	public By confirmationBox(){
		return By.xpath("//div[@id='InlineCss_PluginScheduling']//div//div[@class='doorway-plugin-content doorway-plugin-main']");
	}

}
