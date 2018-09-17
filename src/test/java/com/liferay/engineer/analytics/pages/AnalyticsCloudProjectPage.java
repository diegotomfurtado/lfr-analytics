package com.liferay.engineer.analytics.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.liferay.engineer.analytics.utils.CommonMethods;

/*
*
*@Author: Diego Furtado
*QA Consultant - Liferay Inc.
*/
public class AnalyticsCloudProjectPage extends CommonMethods {

	private static final By customerLiferayLocator = xpath(".//*[@href=\"/project/50000\"]");

	public AnalyticsCloudProjectPage(WebDriver browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}
	
	public AnalyticsCloudHomePage selectCustomerLiferayComProject() {
		
		clickOnLink(customerLiferayLocator);
		return new AnalyticsCloudHomePage(browser);
	}

	
}
