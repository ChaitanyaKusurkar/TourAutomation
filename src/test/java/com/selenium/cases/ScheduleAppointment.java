package com.selenium.cases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.selenium.base.BaseTest;
import com.selenium.pages.AppointmentStatusPage;
import com.selenium.pages.LandingPage;
import com.selenium.pages.ScheduleTourPage;

public class ScheduleAppointment extends BaseTest {
	
	LandingPage landingPage =new LandingPage();
	ScheduleTourPage scheduleTourPage= new ScheduleTourPage();
	AppointmentStatusPage appointmentStatusPage = new AppointmentStatusPage();
	
	
	// Stating point of Execution of Test Cases
	@Test
	public void bookAppointment(){
		
		landingPage.clickScheduleATour();
		scheduleTourPage.loadScheduleTourPage();
		scheduleTourPage.fillFormAndSubmit();
		appointmentStatusPage.loadStatusPage();
		
		boolean confirmation=appointmentStatusPage.confirmAppointment();
		
		Assert.assertTrue(confirmation, "There was an error booking an appointment. Please verify manually");		
	}
	
	
	
}
