package com.selenium.pages;

import com.selenium.base.BaseCommands;
import com.selenium.maps.LandingPageMap;

public class LandingPage {
	
	LandingPageMap landingPageMap=new LandingPageMap();

	BaseCommands bc=new BaseCommands();
	
	public void clickScheduleATour(){
	
		bc.switchToFrameandClick(landingPageMap.optionsFrame(),landingPageMap.scheduleATourButton(),45);
	}	
}
