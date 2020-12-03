package com.selenium.pages;

import java.util.Random;

import com.selenium.base.BaseCommands;
import com.selenium.maps.ScheduleTourPageMap;

public class ScheduleTourPage {
	
	ScheduleTourPageMap scheduleTourPageMap=new ScheduleTourPageMap();

	BaseCommands bc=new BaseCommands();
	
	public void loadScheduleTourPage(){

		bc.switchToFrameandClick(scheduleTourPageMap.ScheduleTourPage(),scheduleTourPageMap.SchedulingPageAvatar(),45);

	}	
	
	public void fillFormAndSubmit(){
		
		selectDateAndTime();
		enterPersonalInfo();
		bookTour();		
	}
	
	public void selectDateAndTime(){
		bc.clickParticularDateFromTable(scheduleTourPageMap.DatePicker(),scheduleTourPageMap.DateTable());
		bc.locateElement(scheduleTourPageMap.DatePicker());
		bc.SelectOptionFromDropDown(scheduleTourPageMap.SelectTime(),2);
	}

	public void enterPersonalInfo(){
		String randomString=getRandomString(10);
		
		bc.locateElement(scheduleTourPageMap.FirstName());
		bc.enterText(randomString, scheduleTourPageMap.FirstName());
		bc.enterText(randomString, scheduleTourPageMap.LastName());
		bc.enterText(Long.toString(getRandomNumber()), scheduleTourPageMap.Phone());
		bc.enterText(randomString +"@gmail.com", scheduleTourPageMap.Email());
	}
	
	public void bookTour(){
		bc.click(scheduleTourPageMap.BookTourButton());
	}
	
	public long getRandomNumber(){

		return 1000000000 + new Random().nextLong();
	}
	
	public String getRandomString(int length){
		
		String characterString="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		StringBuilder randomString=new StringBuilder();
		
		for(int i=0;i<length;i++){
			randomString.append(characterString.charAt((int) (characterString.length()*Math.random())));
		}		
		return randomString.toString();
	}
}
