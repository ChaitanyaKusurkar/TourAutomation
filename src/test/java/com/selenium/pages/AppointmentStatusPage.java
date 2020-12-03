package com.selenium.pages;

import org.openqa.selenium.WebElement;

import com.selenium.base.BaseCommands;
import com.selenium.maps.AppointmentStatusPageMap;
import com.selenium.maps.ScheduleTourPageMap;

public class AppointmentStatusPage {
	
	AppointmentStatusPageMap appointmentStatusPageMap=new AppointmentStatusPageMap();
	BaseCommands bc=new BaseCommands();
	
	public void loadStatusPage() {

		bc.switchToFrameandClick(appointmentStatusPageMap.appointmentStatusPage(),appointmentStatusPageMap.confirmationBox(),45);
	}
	
	public boolean confirmAppointment() {
		
		WebElement confirmationHeader=bc.locateElement(appointmentStatusPageMap.confirmationHeader());
		if(confirmationHeader.getText().contains("You're booked")){
			return true;
		}
		return false;		
	}
}
